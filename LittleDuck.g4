grammar LittleDuck;
@parser::header {
	import interventions.*;
}

@parser::members {
	public static Middleman m = new Middleman(); 
}

programa locals[Program p = new Program(m)] :'program 'ID {$programa::p.setName($ID.text);}';' dec_v dec_f 'main'body'end'{m.cuads.add(new Cuadruplo("End"));}{System.out.println(m.cuads);}; 

dec_v: vars | ;
dec_f: funcs dec_f | ;

vars locals [ArrayList<String> l_vars = new ArrayList<String>()]:'var 'vars1;
vars1: list_ids':'type {$programa::p.decVars($vars::l_vars, $type.text, $ctx.getStart().getLine());} ';'vars2;
vars2: vars1| ;
list_ids: ID {$vars::l_vars.add($ID.text);} list_ids1;
list_ids1: ','list_ids | ;
type: 'int' | 'float';

body: '{' body1 '}';
body1: statement body1 | ;

statement: assign | condition | cycle | f_call | print;

print: 'print('print1')'';';
print1: print_opciones print2;
print_opciones: expresion {$programa::p.pushPrintExpresion();}| STRING {$programa::p.pushPrintString($STRING.text);};
print2: ','print1| ;

cycle: 'do'{$programa::p.pushDo();}body'while''('expresion')'';'{$programa::p.popDo();};

condition: 'if('expresion')'{$programa::p.pushIf();}body else_if';'{$programa::p.endIf();};
else_if: 'else'{$programa::p.pushElse();}body| ;

assign: ID'='{$programa::p.checkVarExists($ID.text, $ctx.getStart().getLine());$programa::p.pushAssign($ID.text);}expresion {$programa::p.popAssign();}';';

expresion: exp expresion1 ;
expresion1: signos{$programa::p.pushOps($signos.text);} exp {$programa::p.pushRelational();} | ;
signos: '<' | '>' | '!=';

exp: termino {$programa::p.pushAdd();} exp1;
exp1: exp_signos {$programa::p.pushOps($exp_signos.text);} exp | ;
exp_signos: '+'|'-';

termino: factor {$programa::p.pushMult();} termino1;
termino1: term_signos {$programa::p.pushOps($term_signos.text);}termino | ;
term_signos: '*'|'/';

factor: '('{$programa::p.createFBottom();}expresion')'{$programa::p.removeFBottom();} | factor1{$programa::p.pushNegative($factor1.text);} factor2;
factor1: exp_signos | ;
factor2: ID {$programa::p.checkVarExists($ID.text, $ctx.getStart().getLine());} {$programa::p.pushQVar($ID.text);}| cte;

cte: INT {$programa::p.pushQConst($INT.text, "Integer");} | FLOAT{$programa::p.pushQConst($FLOAT.text, "Float");};

funcs locals[ArrayList<Variable> l_vars = new ArrayList<Variable>()]: {$programa::p.setLocal(true);} 'void 'ID {$programa::p.addFunc($ID.text, $ctx.getStart().getLine());} '('funcs1')''['funcs2 body'];'{$programa::p.setLocal(false); $programa::p.deleteFunc($ID.text);};

funcs1: ID':'type {$programa::p.decVar($ID.text, $type.text, $ctx.getStart().getLine());} funcs_var| ;
funcs_var: ','funcs1| ;
funcs2 : vars | ;

f_call: ID'('{$programa::p.checkFuncExists($ID.text, $ctx.getStart().getLine());}f_call1')'';';
f_call1: expresion call_list| ;
call_list: ','f_call1| ;

ID: [A-Za-z][A-Za-z0-9_]*;
STRING: '"'~["]*'"';
NEWLINE: [\r\n]+ -> skip;
WHITESPACE: (' ' | '\t') -> skip;
INT: [-]?[0-9]+;
FLOAT: [0-9]+('.'[0-9]+);