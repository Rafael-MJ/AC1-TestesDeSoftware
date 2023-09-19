package testesoftware;

import funcionalidades.Divisao;
import funcionalidades.Multiplicacao;
import funcionalidades.Soma;
import funcionalidades.Subtracao;

public class Testes {

    public static void main(String[] args) {
        
        /******************************************************\
        *                                                      *
        *       Teste de Funcionalidade da Classe "Soma"       *
        *                                                      *
        \******************************************************/
        
        Soma calcSum = new Soma();
        
        //Cenário de Teste 1: Soma de 2 valores
        System.out.println(calcSum.soma(7, 3));
        
        //Cenário de Teste 2: Soma de 2 valores sendo um 0
        System.out.println(calcSum.soma(7, 0));
        
        //Cenário de Teste 3: Soma de 2 valores, ambos 0
        System.out.println(calcSum.soma(0, 0));
        
        //Cenário de Teste 4: Soma de 2 valores sendo um negativo
        System.out.println(calcSum.soma(7, -3));
        
        //Cenário de Teste 5: Soma de 2 valores, ambos negativos
        System.out.println(calcSum.soma(-7, -3));
        
        //Cenário de Teste 6: Soma de 2 valores, negativo e 0
        System.out.println(calcSum.soma(-7, 0));
        
        //Cenário de Teste 7: Soma de 2 valores, maior int e negativo
        System.out.println(calcSum.soma(2147483647, -3));
        
        //Cenário de Teste 8: Soma de 2 valores, maior int e 0
        System.out.println(calcSum.soma(2147483647, 0));
        
        
        //====================================================================\\
        
        /******************************************************\
        *                                                      *
        *     Teste de Funcionalidade da Classe "Subtracao"    *
        *                                                      *
        \******************************************************/
        
        Subtracao calcSub = new Subtracao();
        
        //Cenário de Teste 1: Subtracao de 2 valores
        System.out.println(calcSub.subtracao(7, 3));
        
        //Cenário de Teste 2: Subtracao de 2 valores sendo um 0
        System.out.println(calcSub.subtracao(7, 0));
        
        //Cenário de Teste 3: Subtracao de 2 valores, ambos 0
        System.out.println(calcSub.subtracao(0, 0));
        
        //Cenário de Teste 4: Subtracao de 2 valores sendo um negativo
        System.out.println(calcSub.subtracao(7, -3));
        
        //Cenário de Teste 5: Subtracao de 2 valores, ambos negativos
        System.out.println(calcSub.subtracao(-7, -3));
        
        //Cenário de Teste 6: Subtracao de 2 valores, negativo e 0
        System.out.println(calcSub.subtracao(-7, 0));
        
        //Cenário de Teste 7: Subtracao de 2 valores, maior int e negativo
        System.out.println(calcSub.subtracao(2147483647, -3));
        
        //Cenário de Teste 8: Subtracao de 2 valores, maior int e 0
        System.out.println(calcSub.subtracao(2147483647, 0));
        
        //Cenário de Teste 9: Subtracao de 2 valores sendo o primeiro negativo
        System.out.println(calcSub.subtracao(-7, 3));
        
        
        //====================================================================\\
        
        /******************************************************\
        *                                                      *
        *      Teste de Funcionalidade da Classe "Divisao"     *
        *                                                      *
        \******************************************************/
        
        Divisao calcDiv = new Divisao();
        
        //Cenário de Teste 1: Divisao de 2 valores
        System.out.println(calcDiv.divisao(7, 3));
        
        //Cenário de Teste 2: Divisao de 2 valores sendo um 0
        //System.out.println(calcDiv.divisao(7, 0));
        //ERRO: ão é possível dividir por 0
        
        //Cenário de Teste 3: Divisao de 2 valores, primeiro 0
        System.out.println(calcDiv.divisao(0, 3));
        
        //Cenário de Teste 4: Divisao de 2 valores, ambos 0
        //System.out.println(calcDiv.divisao(0, 0));
        //ERRO: ão é possível dividir por 0
        
        //Cenário de Teste 5: Divisao de 2 valores sendo um negativo
        System.out.println(calcDiv.divisao(7, -3));
        
        //Cenário de Teste 6: Divisao de 2 valores, ambos negativos
        System.out.println(calcDiv.divisao(-7, -3));
        
        //Cenário de Teste 7: Divisao de 2 valores, ambos negativos
        System.out.println(calcDiv.divisao(-7, 3));
        
        //Cenário de Teste 8: Divisao de 2 valores, negativo e 0
        //System.out.println(calcDiv.divisao(-7, 0));
        //ERRO: ão é possível dividir por 0
        
        //Cenário de Teste 9: Divisao de 2 valores, maior int e negativo
        System.out.println(calcDiv.divisao(2147483647, -3));
        
        //Cenário de Teste 10: Divisao de 2 valores, maior int e 0
        //System.out.println(calcDiv.divisao(2147483647, 0));
        //ERRO: ão é possível dividir por 0

        //Cenário de Teste 11: Divisao resulta decimal
        System.out.println(calcDiv.divisao(3, 2));
        //OBS: Resultado incorreto por retornar "int"
        
        
        //====================================================================\\
        
        /******************************************************\
        *                                                      *
        *   Teste de Funcionalidade da Classe "Multiplicacao"  *
        *                                                      *
        \******************************************************/
        
        Multiplicacao calcMulti = new Multiplicacao();
        
        //Cenário de Teste 1: Multiplicacao de 2 valores
        System.out.println(calcMulti.multiplicacao(7, 3));
        
        //Cenário de Teste 2: Multiplicacao de 2 valores sendo um 0
        System.out.println(calcMulti.multiplicacao(7, 0));
        
        //Cenário de Teste 3: Multiplicacao de 2 valores, ambos 0
        System.out.println(calcMulti.multiplicacao(0, 0));
        
        //Cenário de Teste 4: Multiplicacao de 2 valores sendo um negativo
        System.out.println(calcMulti.multiplicacao(7, -3));
        
        //Cenário de Teste 5: Multiplicacao de 2 valores, ambos negativos
        System.out.println(calcMulti.multiplicacao(-7, -3));
        
        //Cenário de Teste 6: Multiplicacao de 2 valores, negativo e 0
        System.out.println(calcMulti.multiplicacao(-7, 0));
        
        //Cenário de Teste 7: Multiplicacao de 2 valores, maior int e negativo
        System.out.println(calcMulti.multiplicacao(2147483647, -3));
        
        //Cenário de Teste 8: Multiplicacao de 2 valores, maior int e 0
        System.out.println(calcMulti.multiplicacao(2147483647, 0));
        
        
        //====================================================================\\
        
        /*********************************************************************\
        *                                                                     *
        *  Observação Geral de Testes:                                        *
        *                                                                     *
        *  . Apesar de não ocasionar qualquer tipo de erro, resultados com    *
        *    números decimais se mostram incorretos por se tratarem de int.   *
        *                                                                     *
        \*********************************************************************/
    }
}