//*****************************************************************
// File:   PCodeInstruction.java
// Author: Procesadores de Lenguajes-University of Zaragoza
// Date:   abril 2022
// Coms:   Elemento de código que representa una instrucción. 
//			Hereda de CodeElement
//*****************************************************************

package lib.tools.codeGeneration;

public class PCodeInstruction extends CodeElement{
	
	public static enum OpCode {
		AND (0),	// a and b
		ASG (1),	// assign
		ASGI (2),	// assign inverse
		CSF (3),	// close stack frame
		DIV (4),	// a / b
		DRF (5),	// dereference
		DUP (6), 	// push(pop1(); pop1())
		ENP (7), 	// enter program at n
		EQ (8),		// a == b 
		GT (9),		// a > b
		GTE (10),	// a >= b
		JMF (11),	// pop()=0? PC = n else PC = PC+1
		JMP (12),	// PC = n
		JMT (13),	// pop()=1? PC = n else PC = PC+1
		LT (14),	// a < b
		LTE (15),	// a <= b
		LVP (16),	// leave program
		MOD (17),	// a mod b
		NEQ (18),	// a != b
		NGB (19),	// !a
		NGI (20),	// -a
		NOP (21),	// nada
		OR (22),	// a or b
		OSF (23),	// open stack frame
		PLUS (24),	// a + b
		POP (25),	// pop()
		RD (26),	// if n = 0: read char and store at frames[pop()] else: as int
		SBT (27),	// a - b
		SRF (28),	// set reference
		STC (29),	// store constant
		SWP (30),	// push(pop1(); pop2())
		TMS (31),	// a * b
		WRT (32); 	// if n = 0: write pop() as char else: as int
		
		int code; 
		private OpCode(int code) {
			this.code = code; 
		}
	}
	
	OpCode code; 
	int args[] = null; 
	String argetiq = ""; 
	
	public PCodeInstruction (OpCode code, int... args) {
		this.code = code; 
		this.args = new int[args.length]; 
		for (int i=0; i<args.length; i++) {
			this.args[i] = args[i]; 
		}
	}
	
	public PCodeInstruction (OpCode code, int size, int level, String label) {
		// only for OSF s l label
		this.code = code; 
		this.args = new int[2]; 
		this.args[0] = size; 
		this.args[1] = level; 
		this.argetiq = label; 
	}
	
	public PCodeInstruction (OpCode code, String label) {
		this.code = code; 
		this.argetiq = label; 
	}
	
	public String toString () {
		StringBuilder strBldr = new StringBuilder();
		strBldr.append("  "); 
		strBldr.append(code);
		if (code != OpCode.OSF) {
			if (args != null) {
				for (int i=0; i<args.length; i++) {
					strBldr.append (String.format(" %2d", args[i])); 
				}
			}
			else if (!"".equals(argetiq)) {
				strBldr.append(" "); 
				strBldr.append(argetiq); 
			}
		}
		else {
			for (int i=0; i<args.length; i++) {
				strBldr.append (String.format(" %2d", args[i])); 
			}
			if (!"".equals(argetiq)) {
				strBldr.append(" "); 
				strBldr.append(argetiq); 
			}
		}
		return strBldr.toString(); 
	}
	
}

