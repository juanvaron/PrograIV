package taller2;

public class Taller2 {

    public static void main(String[] args) {
        
        //                  PUNTO 1
         
        /*
	int i = 4;
        
        if (i%2 == 0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
        */
        
        //                  PUNTO 2
        
        /*
	int x = -3, f = x;
        
        if (x > 1){
            for (int cont = x-1;cont > 0;cont--){
                f *= cont;              
            }
            System.out.print(f);
        
        }else if(x >= 0 && x <= 1){
            System.out.print("1");
        }
	*/

        //                    PUNTO 3
        
        /*int n = 7,fibonacci1 = 1,fibonacci2 = 1;

        System.out.print("Serie de Fibonacci hasta "+n+"\n"); 

        System.out.print(fibonacci1+" ");
        for(int i = 2;i <= n;i++){
             System.out.print(fibonacci2+" ");
             fibonacci2 = fibonacci1+fibonacci2;
             fibonacci1 = fibonacci2-fibonacci1;
        }
	*/
        
        //                  PUNTO 4
        
        /*
	int i = 5, f = 1;
        
        for (int e = 2;e > 0;e--){
            f *= i;
        }
        System.out.print(f);
	*/
        
        //                  PUNTO 5
        
        /*
	int i = 4, primo = 0;
        
        if(i > 0){
            for(int cont = 1;cont <= i;cont++){
                if(i % cont == 0){
                    primo++;
                }
            }
            if (primo == 2){
                System.out.print("el numero es primo");
            }else{
                System.out.print("el numero no es primo");
            }
        }
	*/
        
        //                  PUNTO 6
        
        /*
	int i = 55,d = 0,h = 0,s = 0,f = 0;
        
        if (i > 0){
            s = i / 168;
            f = i - (s * 168);
            d = f / 24;
            h = i % 24;
        }
        System.out.print(s+" semanas\n");
        System.out.print(d+" dias\n");
        System.out.print(h+ " horas\n");*/
        
        //                   PUNTO 7
        /*
	int a = 1,b = 8,c = 3; 
        float raiz1 = 0, raiz2 = 0;
        
        raiz1 = (float) ((- b + Math.sqrt((b * b) - 4 * a * c)) / 2 * a);
        raiz2 = (float) ((- b - Math.sqrt(b * b - 4 * a * c)) / 2 * a);
        System.out.print("x1= "+raiz1+"\n");
        System.out.print("x2= "+raiz2+"\n");
	*/
    }
    
}
