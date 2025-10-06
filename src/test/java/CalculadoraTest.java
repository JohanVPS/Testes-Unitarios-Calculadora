import org.example.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    public void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomarDoisValores(){

        double valorA = 10;
        double valorB = 20;

        double resultadoSoma = calculadora.somar(valorA, valorB);
        Assertions.assertEquals(30, resultadoSoma);
    }

    @Test
    public void deveSubtrairDoisValores(){
        // AAA
        // A = Arrange = Preparação da massa

        double valorA = 10;
        double valorB = 20;
        //A = Act = Ação / Fazer
        double resultadoSub = calculadora.subtrair(valorA, valorB);
        // A = Assert / verificar
        Assertions.assertEquals(-10, resultadoSub);
    }

    @Test
    public void deveMultiplicarDoisValores(){

        double valorA = 10;
        double valorB = 20;

        double resultadoMult = calculadora.multiplicar(valorA, valorB);
        Assertions.assertEquals(200, resultadoMult);
    }

    @Test
    public void deveDividirDoisValores(){

        double valorA = 10;
        double valorB = 20;

        double resultadoDiv = calculadora.dividir(valorA, valorB);
        Assertions.assertEquals(0.5, resultadoDiv);
    }


}
