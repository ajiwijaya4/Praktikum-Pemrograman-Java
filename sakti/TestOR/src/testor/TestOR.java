/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testor;

/**
 *
 * @author LK09Nu4UTY
 */
public class TestOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = false;
        
        //demostrasi ||
        test = (i < 10) || (j++ > 9);
        System.out.println (i);
        System.out.println (j);
        System.out.println (test);
        
        //demonstrasi |
        test = (i < 10) | (j++ > 9);
        System.out.println (i);
        System.out.println (j);
        System.out.println (test);
        
    }
    
}
