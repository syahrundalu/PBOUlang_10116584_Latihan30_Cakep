/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakep;

import java.util.Scanner;

/**
 *
 * @author 
 * NIM  : 10116584
 * Nama : Muhammad Syahrun Dalu
 */
public class Cakep {
    
    public static final String ANSI_RESET = "\u001B[0m" ;
    public static final String ANSI_BLACK = "\u001B[30m" ;
    public static final String ANSI_RED = "\u001B[31m" ;
    public static final String ANSI_GREEN = "\u001B[32m" ;
    public static final String ANSI_YELLOW = "\u001B[33m" ;
    public static final String ANSI_BLUE = "\u001B[34m" ;
    public static final String ANSI_PURPLE = "\u001B[35m" ;
    public static final String ANSI_CYAN = "\u001B[36m" ;
    public static final String ANSI_WHITE = "\u001B[37m" ;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        // TODO code application logic here
        String Jawab;
        
        Scanner scan = new Scanner (System.in);
            System.out.print(ANSI_RED+"Kamu "+ANSI_RESET);
            System.out.print(ANSI_GREEN+"Ngerjain sendiri "+ANSI_RESET);
            System.out.print(ANSI_YELLOW+"Latihan 17 sampe "+ANSI_RESET);
            System.out.println(ANSI_BLUE+"Latihan 30 ini? "+ANSI_RESET);
            System.out.print(ANSI_BLUE+"Jawab "+ANSI_RESET);
            System.out.print(ANSI_RED+"(Yoi/Engga) "+ANSI_RESET);
            String jawab = scan.nextLine();
            System.out.println("");
            
            if (jawab.equals("yoi")){
                System.out.print(ANSI_RED+"Cakep Bener. "+ANSI_RESET);
                System.out.println(ANSI_CYAN+"Good Job"+ANSI_RESET);
            }
            else if (jawab.equals("engga")){
                    System.out.println(ANSI_RED+"Tetep Cakep Sih. "+ANSI_RESET);
                    System.out.println(ANSI_CYAN+"Sing Penting Paham konsepnya yee"+ANSI_RESET);
                    System.out.println("Keep the code works dude");
                    }
            
    }
    
}
