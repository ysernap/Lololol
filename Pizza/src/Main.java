
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yeison
 */
public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        Scanner read = new Scanner(System.in);
        p1.setToppings(read.next());
        p1.setSize(read.nextInt());
        p1.setPrice(read.nextDouble());
        
        System.out.println(p1.getToppings() + " " + p1.getSize() + " " + p1.getPrice());
        
        Pizza[] pizza = new Pizza[3];
        
        for (int i = 0; i < 3; i++) {
            pizza[i] = new Pizza();
        }
        
        for (int i = 0; i < 3; i++) {
            pizza[i].setToppings(read.next());
            pizza[i].setSize(read.nextInt());
            pizza[i].setPrice(read.nextDouble());
            System.out.println(pizza[i].getToppings()+" "+pizza[i].getSize()+" "+pizza[i].getPrice());
        }
    }        
}
