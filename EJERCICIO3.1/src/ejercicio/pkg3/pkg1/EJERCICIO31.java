package ejercicio.pkg3.pkg1;

import java.util.Arrays;
import java.util.Scanner;



public class EJERCICIO31 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Digite el tamaño del arreglo:");
       int tam =sc.nextInt();//Guardar un entero
       int[] arreglo=new int[tam];
       for(int i=0; i<tam ;i++){
           arreglo[i]=(int)(Math.random()*101);
       }
       
       System.out.println("El arreglo generado es:"+Arrays.toString(arreglo));
       //MEDIA
       double media = calcularMedia(arreglo);
       System.out.println("Media: "+media);
       //MEDIANA
       double mediana=calcularMediana(arreglo);
       System.out.println("Mediana: "+mediana);
       //VARIANZA
       double varianza=calcularVarianza(arreglo);
       System.out.println("Varianza: "+varianza);
       //DESVIACION ESTANDAR
       double desviacionEstandar=calcularDesviacionEstandar(arreglo);
       System.out.println("Desviacion estandar: "+desviacionEstandar);
       //MODA
       int moda=calcularModa(arreglo);
       if(moda==-1){
          System.out.println("No hay moda");
        } else {
           System.out.println("Moda:"+moda);
           sc.close();
            
        } 

    }
             public static double calcularMedia(int[]arreglo) {
           int suma=0;
           for(int i=0;i<arreglo.length;i++){
               suma+=arreglo[i];
           }
             return(double)suma/arreglo.length;
       }
               public static double calcularMediana(int[]arreglo){
                   Arrays.sort(arreglo);
                   if(arreglo.length%2==0){
                       int index1=arreglo.length/2-1;
                       int index2=arreglo.length/2;
                       return(double)(arreglo[index1]+arreglo[index2]/2);
                   }else{
                       int index=arreglo.length/2;
                       return arreglo[index];
                   }
               }
                public static double calcularVarianza(int[] arreglo){
                    double media= calcularMedia(arreglo);
                    double suma=0;
                    for(int i=0;i<arreglo.length;i++){
                        suma+=Math.pow(arreglo[i]-media,2);
                        
                    }
                    return suma/arreglo.length;
                }         
                public static double calcularDesviacionEstandar(int[] arreglo){
                    return Math.sqrt(calcularVarianza(arreglo));
                }
                public static int calcularModa(int[]arreglo){
                    int moda=-1;
                    int frecuenciaMaxima=0;
                    for(int i=0;i<arreglo.length;i++){
                        int frec=0;
                        for(int j=0;j<arreglo.length;j++){
                            frec++;
                            if(frec>frecuenciaMaxima){
                        frecuenciaMaxima=frec;
                        moda=arreglo[i];
                    
                        }
                    }
                    
                    return moda;
                    }
        return 0;
                }
}
       

    