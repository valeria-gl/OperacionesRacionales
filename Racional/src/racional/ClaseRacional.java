package racional;
import javax.swing.JOptionPane; 
public class ClaseRacional {

    public static void main(String args[]) {
        //Crear obj1
        Racional obj1 = new Racional();
        obj1.setNumerador(17);
        obj1.setDenominador(7);
        JOptionPane.showMessageDialog(null,"Número racional 1: " + obj1);
        //Crear obj1
        Racional obj2 = new Racional(4, 3);
        JOptionPane.showMessageDialog(null,"Número racional 2: " + obj2);
        //Crear obj3
        Racional obj3 = new Racional();
        obj3.suma(obj1, obj2); //suma ob1+ob2 en ob3
        JOptionPane.showMessageDialog(null, "La suma de los racionales es: " + obj3);
        obj3.resta(obj1, obj2); //resta ob1- ob2 en ob3
        JOptionPane.showMessageDialog(null,"La resta de los racionales es: " + obj3);
        obj3.multiplica(obj1, obj2); //multiplica ob1-ob2 en ob3
        JOptionPane.showMessageDialog(null,"La multiplicación de los racionales es: " + obj3);
        obj3.division(obj1, obj2); //multiplica ob1-ob2 en ob3
        JOptionPane.showMessageDialog(null,"La división de los racionales es: " + obj3);
    }
}
