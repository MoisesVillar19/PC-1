import java.util.Scanner;
public class funcion {
    static Scanner entrada= new Scanner(System.in);
        static int hackerman(int m, int n){
            if(m==0){
                return n+1;
            }
            else{
                if(n==0){
                    return hackerman(m-1,1);
                }
                else{
                    return hackerman(m-1,hackerman(m, n-1));
                }
            }
        }
   
    public static void main(String args[]) {
      Scanner numero = new Scanner (System.in);
      int num1, num2, h;
      System.out.print("Digite 2 numeros enteros positivos: ");
      num1 = numero.nextInt();
      num2 = numero.nextInt();
      h=hackerman(num1,num2);
      System.out.print("Hackerman("+num1+", "+num2+")= "+h);
    }
}