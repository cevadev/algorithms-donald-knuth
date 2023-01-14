package knuth.ch01.basics.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EuclidesAlgo {
    private int m;
    private int n;
    private int r;
    private int reminder;
    private int inputData()throws IOException{
        System.out.print("Ingrese un valor entero: ");
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String input = userInput.readLine();
        return Integer.valueOf(input);
    }

    private void validations()throws IOException{
        if(m < n){
            int temp = m;
            m = n;
            n = temp;
        }
    }

    private void findRemainder() throws IOException{
        r = m % n;
        while(this.r != 0){
            this.m = n;
            this.n = this.r;
            this.reminder = this.r;
            findRemainder();
        }
    }

    private void perform()throws IOException{
        this.m = inputData();
        this.n = inputData();
        validations();
        findRemainder();
    }

    public static void main(String[] args)throws IOException {
        EuclidesAlgo euclidesAlgo = new EuclidesAlgo();
        euclidesAlgo.perform();
        System.out.println("El maximo comun divisor de los numeros ingresados es: " + euclidesAlgo.reminder);
    }
}
