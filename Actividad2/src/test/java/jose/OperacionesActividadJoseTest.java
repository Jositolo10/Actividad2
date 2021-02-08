package test.java.jose;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.jose.OperacionesActividadJose;

class OperacionesActividadJoseTest {

    Double valor1;
    Double valor2;

    @Test
    
    public void restaTest() {
    	
    	valor1 = 26.0;
    	valor2 = 6.0;
    	
    	Double resultado;
    	
        resultado = OperacionesActividadJose.resta(valor1,valor2);
        Assert.assertNotNull("El resultado no puede ser nulo", resultado);
        Assert.assertTrue("El resultado no es el esperado", resultado.equals(20.0));
    }
    
    @Test
    public void multiplicacionTest() {
    	
    	valor1 = 6.0;
    	valor2 = 6.0;
    	
    	Double resultado;
    	
    	resultado = OperacionesActividadJose.multiplicacion(valor1, valor2);
    	Assert.assertNotNull("El resultado no puede ser nulo", resultado);
    	Assert.assertTrue("El resultado no es el esperado", resultado.equals(36.0));
    }
    

}
