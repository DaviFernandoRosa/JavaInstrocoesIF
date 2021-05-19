

/**
 *Podemos fazer uso de
operadores lógicos "&&" e "||". Quando usamos o operador &&, caso a primeira
condição avaliada em um comando if seja falsa, automaticamente a segunda
expressão não será avaliada. Quando usamos ||, caso a primeira condição avaliada
em um comando if seja verdadeira, automaticamente a segunda expressão
não será avaliada.
 *
 */
public class INSTRUCOESIF {
    
    
    public static void main(String[]args){
    
    int valor1 = 10;
    int valor2 = 15;
    
    if (valor1 > 10 && valor2 >10){
     System.out.println("1)- Os dois valores sao maiores que 10");
    }else{
     System.out.println("1) O primeiro ou o segundo valor nao é maior que 10");
    }
    
    if(valor1 >10 || valor2 >10){
     System.out.println("2) Um dos numero é maior que 10");
    }else{
     System.out.println("2) Nenhum do numeros é maior que 10");
    }
    

    }
}
