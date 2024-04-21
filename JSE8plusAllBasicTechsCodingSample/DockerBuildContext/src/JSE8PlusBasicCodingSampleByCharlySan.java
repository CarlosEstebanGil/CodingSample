package com.charly.j8PlusTechs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JSE8PlusBasicCodingSampleByCharlySan {
	
	// Fields:
	
	//private char[] cArrPal;

	private static final Logger logger = LogManager.getLogger(JSE8PlusBasicCodingSampleByCharlySan.class);
	
	// Constructors:
	
	public JSE8PlusBasicCodingSampleByCharlySan() {
		super(); 
	}

	/*
	 * public JSE8PlusBasicCodingSampleByCharlySan(char[] cArrPal) { super();
	 * this.cArrPal = cArrPal; }
	 */

	// Methods:

	/** 
		* @author Carlos Esteban Gil @date Sept 1  @version 1.0
		* @description: Indica si una palabra es un palindromo o no.	
		* @param char[] cArrPal	: El texto a evaluar
		* @return true if a text is a palindromo or false if it it not a palindromo.
		* @throws ExcepcionTipo Descripción de la exception
		*/

		public boolean isPalByCharlySan(char[] cArrPal) {
		    return isPalHelper(cArrPal, 0, cArrPal.length - 1);
		}
	
		private boolean isPalHelper(char[] cArrPal, int iPos, int fPos) {
		    if (iPos >= fPos) {
		        return true;  
		    }
	
		    if (cArrPal[iPos] != cArrPal[fPos]) {
		        return false; 
		    }
	
		    // 
		    return isPalHelper(cArrPal, iPos + 1, fPos - 1);
		}

	// Main: ( testing based on main method - for unit test run junit file for this class )

		public static void main(String[] args) {
			
			logger.debug("Running the main method .."); System.out.println();
			logger.info("Running the main method .. "); System.out.println();	//logger.error("Messagexxx", new RuntimeException("msgexxx"));
			
			char []cArr = new char[] {'r', 'a', 'd', 'a', 'r'};
			
			JSE8PlusBasicCodingSampleByCharlySan appInst = new JSE8PlusBasicCodingSampleByCharlySan();  
			System.out.println("Is Palindromo result for text \"radar\"  -->  " + appInst.isPalByCharlySan(cArr));
			
			cArr = new char[] {'h', 'e', 'l', 'l', 'o'};
			System.out.println("Is Palindromo result for text \"hello\"  -->  " + appInst.isPalByCharlySan(cArr));
		}
}
