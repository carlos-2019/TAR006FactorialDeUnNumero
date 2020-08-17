package pe.unjfsc.daw.spring5.logical;

import org.slf4j.Logger;

import pe.unjfsc.daw.spring5.entity.CEFactorial;

public class CLFactorial {
	public static final Logger LOG = org.slf4j.LoggerFactory.getLogger("CLFactorial");
	
	public CEFactorial factorialNumero(int n) {		
		CEFactorial oCEFactorial = new CEFactorial();
		/*
		 * Siendo el factorial de un número la multiplicación de todos los números desde el 1 hasta el número del que queremos calcular el factorial.
		 * 1 x 2 x 3 x 4 hasta que sea igual al numero que ingresamos
		 * por ejemplo ingresamos el 5 seria 1x2x3x4x5 = 120
		 * i ++ va ir aumentando 
		 */
		int factorial = 1;
		for(int i=1; i<=n; i++) {
			factorial = factorial * i;
		}
		
		oCEFactorial.setNumero(factorial);
		LOG.info("[EVL] Factorial Logical : {}", oCEFactorial);
		return oCEFactorial;
	}
}
