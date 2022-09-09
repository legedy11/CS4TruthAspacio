/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01truthaspacio;

/**
 *
 * @author TRUTH
 */
public class Ex01TruthAspacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String unit1 = "Dimitri Alexandre Blaiddyd";
        String weapon1 = "Lance";
        int str1 = 20;
        String unit2 = "Sylvain Jose Gautier";
        String weapon2 = "Lance";
        int str2 = 9;
        String unit3 = "Felix Hugo Fraldarius";
        String weapon3 = "Sword";
        int str3 = 10;
        int totalStr = str1 + str2 + str3;
        boolean strUp = str2 > str3;
        boolean weaponCompare = weapon1 == weapon2;
        System.out.printf("Unit 1: %s%nWeapon of choice: %s%nBase strength: %d%n%n", unit1, weapon1, str1);
        System.out.printf("Unit 2: %s%nWeapon of choice: %s%nBase strength: %d%n%n", unit2, weapon2, str2);
        System.out.printf("Unit 3: %s%nWeapon of choice: %s%nBase strength: %d%n%n", unit3, weapon3, str3);
        System.out.printf("Total base strength of all displayed units: %d%n", totalStr);
        System.out.printf("Sylvain is stronger than Felix: %s%n", strUp);
        System.out.printf("Dimitri and Sylvain share the same base weapon type: %s%n", weaponCompare);
    }
    
}
