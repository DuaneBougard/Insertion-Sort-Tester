/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsorttester;

import java.util.Arrays;

/**
 *
 * @author DUANE BOUGARD 3566258
 */
public class InsertionSort1{
    
    public void sort(Persons[] p){
        int m; //number of items in the list
        Persons position;
        for(int index=0;index<p.length;index++){ //for each item from the first p[0] to the last item in the list p[n]
            position=p[index];
            m=index-1;
            while((m>=0)&&(p[m].getSurname().compareToIgnoreCase(position.getSurname())>0)){ 
                p[m+1]=p[m];
                m=m-1;
            }
            p[m+1]=position;
        }
       System.out.println("After sorting: ");//prints sorted surnames
        System.out.println(Arrays.toString(p));
        
    }
}
