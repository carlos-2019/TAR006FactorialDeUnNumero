package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEFactorial;
import pe.unjfsc.daw.spring5.logical.CLFactorial;



public class CVMostrarFactorial {
	public static final Logger LOG = org.slf4j.LoggerFactory.getLogger("CVMostrarFactorial");
	public static void main(String[] args) {
		
		LOG.info("[EVL] Iniciando CVContextFactorial");
		ApplicationContext onCntx = new ClassPathXmlApplicationContext("factorial.xml");
		
		LOG.info("[EVL] Instancia ApplicationContext : {}", onCntx);
		
		CEFactorial oCEFactorial =(CEFactorial) onCntx.getBean("idCEFactorial");
		CLFactorial oCLFactorial =(CLFactorial) onCntx.getBean("idCLFactorial");
		
		LOG.info("[EVL] Instancia with data : {}", oCEFactorial);
		LOG.info("[EVL] Instancia with data : {}", oCLFactorial);
		oCEFactorial = oCLFactorial.factorialNumero(10);
		LOG.info("[EVL] Factorial : {}", oCEFactorial);
		((ConfigurableApplicationContext) onCntx).close();
	}
}
