/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62818
 */
import java.util.Scanner;
public class latihan30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini?\nJawab (Yoi/Enggak): ");
        String jawab = scanner.nextLine();
        
        if (jawab.equalsIgnoreCase("Yoi")) {
            System.out.println("Cakep Bener. Good Job");
        } else if (jawab.equalsIgnoreCase("Enggak")) {
            System.out.println("Tetep cakep sih.");
            System.out.println("Sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
        } else {
            System.out.println("Jawaban tidak valid. Harus Yoi atau Enggak.");
        }

        scanner.close();
    }
}

