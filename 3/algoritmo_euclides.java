import java.util.Scanner;
public class algoritmo_euclides {
    public static void main(String args[]) {
      Scanner numero = new Scanner (System.in);
      int num1, num2, resto=100, aux1, aux2, aux3=0;
      System.out.print("Digite 2 numeros enteros positivos: ");
      num1 = numero.nextInt();
      num2 = numero.nextInt();
      if(num1<=num2){
          aux1=num1;
          num2=num1;
          num1=aux1;
      }
      aux2=num2;
      if(num2!=0){
          while(resto!=0){
             resto=num1%num2;
             aux3=num2;
             num2=resto;
           
          }
        System.out.print("El MCD de "+num1+" y "+aux2+" es: "+aux3);
      }
      
    }
}