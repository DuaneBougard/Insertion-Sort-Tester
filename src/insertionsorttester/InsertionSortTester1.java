/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsorttester;

/**
 *
 * @author DUANE BOUGARD 3566258
 */
public class InsertionSortTester1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InsertionSort1 run = new InsertionSort1();
        Persons[] members = new Persons[10];
        
        members[0] = new Persons("Wilsonia","Agnetia",21);        
        members[1] = new Persons("Davidson","Bradley",32);
        members[2] = new Persons("Addmore","William",20);
        members[3] = new Persons("English","Wlfred",19); 
        members[4] = new Persons("Makatini","Siphola",23);
        members[5] = new Persons("Roykere","Yaasien",41);
        members[6] = new Persons("Gabriels","Pedros",35);
        members[7] = new Persons("Normande","Michael",52);
        members[8] = new Persons("De Niro","Robert",62);
        members[9] = new Persons("Jacobsen","Patrice",31);
        run.sort(members);
}
}
