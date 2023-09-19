package testesoftware;

import funcionalidades.Divisao;
import funcionalidades.Multiplicacao;
import funcionalidades.Soma;
import funcionalidades.Subtracao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraJUnitTest {

     /******************************************************\
     *                                                      *
     *       Teste de Funcionalidade da Classe "Soma"       *
     *                                                      *
     \******************************************************/

     private final Soma calcSum = new Soma();
     private int somar;
     private int subtrair;
     private int dividir;
     private int multiplicar;

    //Cenário de Teste 1: Soma de 2 valores
    @Test
    public void somarDoisPositivos() {
        somar = calcSum.soma(7,3);
        Assertions.assertEquals(10,somar);
    }

    //Cenário de Teste 2: Soma de 2 valores sendo um 0
    @Test
    public void somarComZero() {
        somar = calcSum.soma(7,0);
        Assertions.assertEquals(7,somar);
    }

    //Cenário de Teste 3: Soma de 2 valores, ambos 0
    @Test
    public void somarAmbosZero() {
        somar = calcSum.soma(0,0);
        Assertions.assertEquals(0,somar);
    }

    //Cenário de Teste 4: Soma de 2 valores sendo um negativo
    @Test
    public void somarComNegativo() {
        somar = calcSum.soma(7,-3);
        Assertions.assertEquals(4,somar);
    }

    //Cenário de Teste 5: Soma de 2 valores, ambos negativos
    @Test
    public void somarAmbosNegativos() {
        somar = calcSum.soma(-7,-3);
        Assertions.assertEquals(-10,somar);
    }

    //Cenário de Teste 6: Soma de 2 valores, negativo e 0
    @Test
    public void somarNegativoZero() {
        somar = calcSum.soma(-7,0);
        Assertions.assertEquals(-7,somar);
    }

    //Cenário de Teste 7: Soma de 2 valores, maior int e negativo
    @Test
    public void somarMaxIntNegativo() {
        somar = calcSum.soma(2147483647,-3);
        Assertions.assertEquals(2147483644,somar);
    }

    //Cenário de Teste 8: Soma de 2 valores, maior int e 0
    @Test
    public void somarMaxIntZero() {
        somar = calcSum.soma(2147483647,0);
        Assertions.assertEquals(2147483647,somar);
    }


    //====================================================================\\

     /******************************************************\
     *                                                      *
     *     Teste de Funcionalidade da Classe "Subtracao"    *
     *                                                      *
     \******************************************************/

    private final Subtracao calcSub = new Subtracao();

    //Cenário de Teste 1: Subtracao de 2 valores
    @Test
    public void subtrairPositivo() {
        subtrair = calcSub.subtracao(7,3);
        Assertions.assertEquals(4,subtrair);
    }

    //Cenário de Teste 2: Subtracao de 2 valores sendo um 0
    @Test
    public void subtrairZero() {
        subtrair = calcSub.subtracao(7,0);
        Assertions.assertEquals(7,subtrair);
    }

    //Cenário de Teste 3: Subtracao de 2 valores, ambos 0
    @Test
    public void subtrairAmbosZero() {
        subtrair = calcSub.subtracao(0,0);
        Assertions.assertEquals(0,subtrair);
    }

    //Cenário de Teste 4: Subtracao de 2 valores sendo um negativo
    @Test
    public void subtrairNegativo() {
        subtrair = calcSub.subtracao(7,-3);
        Assertions.assertEquals(10,subtrair);
    }

    //Cenário de Teste 5: Subtracao de 2 valores, ambos negativos
    @Test
    public void subtrairAmbosNegativos() {
        subtrair = calcSub.subtracao(-7,-3);
        Assertions.assertEquals(-4,subtrair);
    }

    //Cenário de Teste 6: Subtracao de 2 valores, negativo e 0
    @Test
    public void subtrairZeroNegativo() {
        subtrair = calcSub.subtracao(-7,0);
        Assertions.assertEquals(-7,subtrair);
    }

    //Cenário de Teste 7: Subtracao de 2 valores, negativo e maior int
    @Test
    public void subtrairMaxIntNegativo() {
        subtrair = calcSub.subtracao(-3,2147483647);
        Assertions.assertEquals(2147483646,subtrair);
    }

    //Cenário de Teste 8: Subtracao de 2 valores, maior int e 0
    @Test
    public void subtrairMaxIntZero() {
        subtrair = calcSub.subtracao(2147483647,0);
        Assertions.assertEquals(2147483647,subtrair);
    }

    //Cenário de Teste 9: Subtracao de 2 valores sendo o primeiro negativo
    @Test
    public void subtrairPrimeiroNegativo() {
        subtrair = calcSub.subtracao(-7,3);
        Assertions.assertEquals(-10,subtrair);
    }


    //====================================================================\\

     /******************************************************\
     *                                                      *
     *      Teste de Funcionalidade da Classe "Divisao"     *
     *                                                      *
     \******************************************************/

    Divisao calcDiv = new Divisao();

    //Cenário de Teste 1: Divisao de 2 valores
    @Test
    public void dividirPositivo() {
        dividir = calcDiv.divisao(6,2);
        Assertions.assertEquals(3,dividir);
    }

    //Cenário de Teste 2: Divisao de 2 valores sendo um 0
    @Test
    public void dividirZero() {
        dividir = calcDiv.divisao(7,0);
        Assertions.assertEquals(0,dividir);
    }//Erro: Não é possível dividir por 0!

    //Cenário de Teste 3: Divisao de 2 valores, primeiro 0
    @Test
    public void dividirPrimeiroZero() {
        dividir = calcDiv.divisao(0,3);
        Assertions.assertEquals(0,dividir);
    }

    //Cenário de Teste 4: Divisao de 2 valores, ambos 0
    @Test
    public void dividirAmbosZero() {
        dividir = calcDiv.divisao(0,0);
        Assertions.assertEquals(0,dividir);
    }//Erro: Não é possível dividir por 0!

    //Cenário de Teste 5: Divisao de 2 valores sendo um negativo
    @Test
    public void dividirNegativo() {
        dividir = calcDiv.divisao(7,-3);
        Assertions.assertEquals(-2,dividir);
    }

    //Cenário de Teste 6: Divisao de 2 valores, ambos negativos
    public void dividirAmbosNegativos() {
        dividir = calcDiv.divisao(-7,-3);
        Assertions.assertEquals(2,dividir);
    }

    //Cenário de Teste 7: Divisao de 2 valores, ambos negativos
    public void dividirPrimeiroNegativo() {
        dividir = calcDiv.divisao(-7,3);
        Assertions.assertEquals(-2,dividir);
    }

    //Cenário de Teste 8: Divisao de 2 valores, negativo e 0
    public void dividirNegativoZero() {
        dividir = calcDiv.divisao(-7,0);
        Assertions.assertEquals(0,dividir);
    }

    //Cenário de Teste 9: Divisao de 2 valores, maior int e negativo
    public void dividirMaxIntNegativo() {
        dividir = calcDiv.divisao(2147483647,-3);
        Assertions.assertEquals(-715827882,dividir);
    }

    //Cenário de Teste 10: Divisao de 2 valores, maior int e 0
    public void dividirMaxIntZero() {
        dividir = calcDiv.divisao(2147483647,0);
        Assertions.assertEquals(0,dividir);
    }

    //Cenário de Teste 11: Divisao resulta em decimal
    public void dividirDecimal() {
        dividir = calcDiv.divisao(3,2);
        Assertions.assertEquals(1.5,dividir);
    }//OBS: Números decimais não podem ser retornados por "int", não
     //houve erro no teste pois "assertEquals" converte "int" para "double"


    //====================================================================\\

     /******************************************************\
     *                                                      *
     *  Teste de Funcionalidade da Classe "Multiplicacao"   *
     *                                                      *
     \******************************************************/

    Multiplicacao calcMulti = new Multiplicacao();

    //Cenário de Teste 1: Multiplicacao de 2 valores
    public void multiplicarPositivo() {
        multiplicar = calcMulti.multiplicacao(7,3);
        Assertions.assertEquals(21,multiplicar);
    }

    //Cenário de Teste 2: Multiplicacao de 2 valores sendo um 0
    public void multiplicarZero() {
        multiplicar = calcMulti.multiplicacao(7,0);
        Assertions.assertEquals(0,multiplicar);
    }

    //Cenário de Teste 3: Multiplicacao de 2 valores, ambos 0
    public void multiplicarAmbosZero() {
        multiplicar = calcMulti.multiplicacao(0,0);
        Assertions.assertEquals(0,multiplicar);
    }

    //Cenário de Teste 4: Multiplicacao de 2 valores sendo um negativo
    public void multiplicarNegativo() {
        multiplicar = calcMulti.multiplicacao(7,-3);
        Assertions.assertEquals(-21,multiplicar);
    }

    //Cenário de Teste 5: Multiplicacao de 2 valores, ambos negativos
    public void multiplicarAmbosNegativos() {
        multiplicar = calcMulti.multiplicacao(-7,-3);
        Assertions.assertEquals(21,multiplicar);
    }

    //Cenário de Teste 6: Multiplicacao de 2 valores, negativo e 0
    public void multiplicarNegativoZero() {
        multiplicar = calcMulti.multiplicacao(-7,0);
        Assertions.assertEquals(0,multiplicar);
    }


    //Cenário de Teste 7: Multiplicacao de 2 valores, maior int e negativo
    public void multiplicarMaxIntNegativo() {
        multiplicar = calcMulti.multiplicacao(2147483647,-3);
        Assertions.assertEquals(-2147483645,multiplicar);
    }

    //Cenário de Teste 8: Multiplicacao de 2 valores, maior int e 0
    public void multiplicarMaxIntZero() {
        multiplicar = calcMulti.multiplicacao(2147483647,0);
        Assertions.assertEquals(0,multiplicar);
    }

    //====================================================================\\
}