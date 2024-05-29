Mem = [None] * 10000000
lineas = []
l = 0
Cuadruplos = []
f = open('MaquinaVirtual\Programa.txt', 'r')

state = 0

#DIRECTORIO DE VARIABLES Y CONSTANTES
for i in f:
	if(i == "CONSTANTES\n"):
		continue
	if(i == "VARIABLES\n"):
		state = 1
		continue
	if(i == "CUADRUPLOS\n"):
		state = 2
		continue
	if(state == 0): #	CONSTANTES
		val = ""
		typ = ""
		mem = 0
		if('"' in i): 
			val = i[0:i.rfind('"')+1]
			typ = i.strip('\n')[i.rfind('"')+1:].split(" ")[1]
			mem = int(i.strip('\n')[i.rfind('"')+1:].split(" ")[2])
		else :
			val = i.strip('\n').split(" ")[0]
			typ = i.strip('\n').split(" ")[1]
			mem = int(i.strip('\n').split(" ")[2])
		if(typ == "Integer"):
			Mem[mem] = int(val)
		elif(typ == "Float"):
			Mem[mem] = float(val)
		elif(typ == "String"):
			Mem[mem] = val
	elif(state == 1):
		val = i.strip('\n').split(" ")[0]
		typ = i.strip('\n').split(" ")[1]
		mem = int(i.strip('\n').split(" ")[2])
		Mem[mem] = 0
	elif(state == 2):
		lineas.append(i)
#EJECUCION
while(l < len(lineas)):
	lin = lineas[l].strip('\n').split(" ")
	opr = lin[0]
	izq = int(lin[1])
	der = int(lin[2])
	add = int(lin[3])
	if(opr == "*"): 
		Mem[add] = Mem[izq] * Mem[der]
	elif(opr == "/"):
		if(Mem[izq] % Mem[der] == 0):
			Mem[add] = int(Mem[izq] / Mem[der])
		else: 
			Mem[add] = Mem[izq] / Mem[der]
	elif(opr == "%"):
		Mem[add] = Mem[izq] % Mem[der]
	elif(opr == "+"):
		Mem[add] = Mem[izq] + Mem[der]
	elif(opr == "-"):
		Mem[add] = Mem[izq] - Mem[der]
	elif(opr == ">"):
		Mem[add] = Mem[izq] > Mem[der]
	elif(opr == "<"):
		Mem[add] = Mem[izq] < Mem[der]
	elif(opr == "!="):
		Mem[add] = Mem[izq] != Mem[der]
	elif(opr == "="):
		Mem[add] = Mem[der]
	elif(opr == "Goto"):
		l = add
		continue
	elif(opr == "GotoV"):
		if(Mem[izq]):
			l = add
			continue
	elif(opr == "GotoF"):
		if(not Mem[izq]):
			l = add
			continue
	elif(opr == "Print"):
		if(isinstance(Mem[izq], str)):
			print(Mem[izq].replace('\\n', "\n").replace('"', ''), end = "")
		else :
			print(Mem[izq], end = "")
	l+=1

f.close()