package Encryption;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*; 
/*
 * Author: L1ght5ec
 * Date 3.1.2020
 * Project: encryption my moving letters
 * PL: Java
 */
class commands {
    public void echo(String msg) {
        System.out.println(msg);
    }
}
public class main {    
    public static void main(String[] args) {        
        commands cmd = new commands();
        Scanner scaner = new Scanner(System.in); 
        cmd.echo("enter text to encrypt:");
        String vars = scaner.nextLine();        
        String var = vars.toLowerCase();
            for (int i=0;i < var.length();i++) {                
                String[] alb = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","a","b","c"};
                String alf = new String("abcdefghijklmnopqrstuvwxyzbc");
                char ch = var.charAt(i);            
                int pos = alf.indexOf(ch);        
                int newP = pos + 3;
                System.out.printf(alb[newP]);                            
            }
        }
    } 