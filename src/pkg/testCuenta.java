package pkg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class testCuenta {
	
	@Test
    public void test0014_LimiteDescubierto() throws Exception {
        // Inicialización
        Cuenta c1 = new Cuenta("12345", "Cliente 1", 50);
        Cuenta c2 = new Cuenta("67890", "Cliente 2", 0);

        // 1
        c1.retirar(200);
        assertEquals(-150, c1.getSaldo(), 0.001);

        // 2
        c2.retirar(350);
        assertEquals(-350, c2.getSaldo(), 0.001);

        // 3
        c1.ingresar(100);
        assertEquals(-50, c1.getSaldo(), 0.001);

        // 4 - Rechazado
        assertThrows(FondosInsuficientesException.class, () -> {
            c2.retirar(200);
        });
        assertEquals(-350, c2.getSaldo(), 0.001);

        // 5
        c2.retirar(150);
        assertEquals(-500, c2.getSaldo(), 0.001);

        // 6
        c1.retirar(200);
        assertEquals(-250, c1.getSaldo(), 0.001);

        // 7
        c2.ingresar(50);
        assertEquals(-450, c2.getSaldo(), 0.001);

        // 8 - Rechazado
        assertThrows(FondosInsuficientesException.class, () -> {
            c2.retirar(100);
        });
        assertEquals(-450, c2.getSaldo(), 0.001);
    }
}
