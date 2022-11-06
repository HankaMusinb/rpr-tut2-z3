package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite brojeve u Vašu listu: \n");
        List<Integer> lista = new ArrayList<>();

       String str = "";
       do{
           str = input.nextLine();
           if(str.equals("stop")) break;
           Integer x = Integer.parseInt(str);
           lista.add(x);
       }while(str != "stop" );
        if(str.equals("stop")){
            System.out.println("Najmanji element liste je: " + min(lista));
            System.out.println("Najveći element liste je: " + max(lista));
            System.out.println("Prosjek unesenih brojeva je: " + mean(lista));
            System.out.println("Prosjecna standardna devijacija je: " + standardna_Devijacija(lista));
        }
        System.out.println("Vaša lista glasi : "+ lista);
    }
    public  static Integer min(List<Integer> lista){
        Integer i = Integer.MAX_VALUE;
        for( Integer h : lista){
                if(i>h){
                    i=h;
                }
        }
        return i;
    }
    public  static Integer max(List<Integer> lista){
        Integer i = Integer.MIN_VALUE;
        for( Integer h : lista){
            if(i<h){
                i=h;
            }
        }
        return i;
    }
    public static Integer suma(List<Integer> lista){
        Integer suma = 0;
        for(Integer x: lista){
            suma += x;
        }
        return suma;
    }
    public static double mean(List<Integer> lista){
        return suma(lista)/lista.size();
    }
    public static double standardna_Devijacija(List<Integer> lista){
        double suma = 0;
        for(Integer i: lista){
            suma+=(i-mean(lista));
        }
        return suma/lista.size();
    }
}