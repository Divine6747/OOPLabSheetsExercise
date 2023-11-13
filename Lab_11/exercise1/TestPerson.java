package Lab_11.exercise1;

import javax.swing.*;

public class TestPerson {

    public static void main(String[] args) {
        String personOutput = "";

        Person p1 = new Person();
        personOutput = "\n\nCalling the person() constructor....\nValue of first person object is: "  +p1.toString();

        Person p2 = new Person("Jasper","Hound");
        personOutput += "\n\nCalling the person(String,String) constructor after getting user-supplied value....\nValue of first person object is: "  +p2.toString();

        JOptionPane.showMessageDialog(null,"**** Person Class Tester ****" + personOutput, "",JOptionPane.INFORMATION_MESSAGE);
    }
}
