
package calculadora;


public class CalculadoraTestes {


    public static void main(String[] args) {
            Calculadora calc = new Calculadora();
            
            //Método para somar dois positívos
            int soma = calc.somar(3, 7);
            System.out.println(soma);
            
            //Método para somar um negativo e um positivo
            soma = calc.somar(-3, 7);
            System.out.println(soma);
            
            //Método para somar dois negativos
            soma = calc.somar(-3, -7);
            System.out.println(soma);
            
            //Método para somar um positívo e um negativo
            soma = calc.somar(3, -7);
            System.out.println(soma);
            
            
            //Método para subtrair dois positívos
            int subtracao = calc.subtracao(3, 7);
            System.out.println(subtracao);
            
            //Método para somar um negativo e um positivo
            subtracao = calc.subtracao(-3,7);
            System.out.println(subtracao);
            
            //Método para somar dois negativos
            subtracao = calc.subtracao(-3,-7);
            System.out.println(subtracao);
            
            //Método para somar um positívo e um negativo
            subtracao = calc.subtracao(3,-7);
            System.out.println(subtracao);
            
            
            //Método para subtrair dois positívos
            int divisao = calc.divisao(3, 7);
            System.out.println(divisao);
            
            //Método para somar um negativo e um positivo
            divisao = calc.divisao(-3, 7);
            System.out.println(divisao);
            
            //Método para somar dois negativos
            divisao = calc.divisao(-3, -7);
            System.out.println(divisao);
            
            //Método para somar um positívo e um negativo
            divisao = calc.divisao(3, -7);
            System.out.println(divisao);
            
            
            //Método para subtrair dois positívos
            int multiplicacao = calc.multiplicacao(3, 7);
            System.out.println(multiplicacao);
            
            //Método para somar um negativo e um positivo
            multiplicacao = calc.multiplicacao(-3, 7);
            System.out.println(multiplicacao);
            
            //Método para somar dois negativos
            multiplicacao = calc.multiplicacao(-3, -7);
            System.out.println(multiplicacao);
            
            //Método para somar um positívo e um negativo
            multiplicacao = calc.multiplicacao(3, -7);
            System.out.println(multiplicacao);
    }
    
}
