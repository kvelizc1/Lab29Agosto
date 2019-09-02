package ClasesMetodos;

import javax.swing.JOptionPane;

public class Numeros {

    protected int n1, n2, n3, n4;

    //Constructor
    public Numeros(int n1, int n2, int n3, int n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    //Getters
    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getN3() {
        return n3;
    }

    public int getN4() {
        return n4;
    }

    //Setters
    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN3(int n3) {
        this.n2 = n3;
    }

    public void setN4(int n4) {
        this.n2 = n4;
    }

    public void showInf() {
        System.out.println("Valores originales: " + n1 + " " + n2 + " " + n3 + " " + n4);
    }

    //Primer Metodo
    public void igualdad() {
        JOptionPane.showMessageDialog(null, "Primer Metodo (Igualdad)"
                + "\nEvaluando " + n1 + " y " + n2);
        if (n1 == n2) {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "Los numeros son diferentes");
        }
    }

    //Segundo Metodo
    public void MayorMenor() {
        JOptionPane.showMessageDialog(null, "Segundo Metodo (Mayor o Menor)\nEvaluando los numeros " + n1 + " y " + n2);
        if (n1 == n2) {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales, no hay mayor o menor");
        } else if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "El numero 1 es mayor: " + n1);
        } else {
            JOptionPane.showMessageDialog(null, "El numero 2 es mayor: " + n2);
        }
    }

    //Tercer Metodo
    public void Maximo() {
//        boolean cam = false;
//        while (true) {
        int aux;
        for (int i = 0; i < 16; i++) {
            if (n4 > n3) {
                aux = n3;
                n3 = n4;
                n4 = aux;
                //                  cam=true;
            }
            if (n3 > n2) {
                aux = n2;
                n2 = n3;
                n3 = aux;
//                    cam=true;
            }
            if (n2 > n1) {
                aux = n1;
                n1 = n2;
                n2 = aux;
//                    cam=true;
            }
        }
        /*          if (cam == true) {
                break;
            }*/
        //}
        JOptionPane.showMessageDialog(null, "Tercer Metodo (Ordenamiento de maximo a minimo):\n" + n1 + ", "
                + n2 + ", " + n3 + ", " + n4);
    }

    //Cuarto Metodo
    public void Minino() {
        int aux;
        for (int i = 0; i < 16; i++) {
            if (n4 < n3) {
                aux = n3;
                n3 = n4;
                n4 = aux;
            }
            if (n3 < n2) {
                aux = n2;
                n2 = n3;
                n3 = aux;
            }
            if (n2 < n1) {
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
        }
        JOptionPane.showMessageDialog(null, "Cuarto Metodo (Ordenamiento de minimo a maximo):\n" + n1 + ", "
                + n2 + ", " + n3 + ", " + n4);
    }
    public void Raiz2(){
       double root=(float) Math.sqrt(n1);
       JOptionPane.showMessageDialog(null, "La raiz cuadrada de "+n1+" es: "+root);
    }
    //Quinto Metodo
    public void Vieta(){
        double root =(float) Math.sqrt((n2*n2)-(4*n1*n3));//Raiz de: (b^2) - 4ac
        double bi=((-1*n2)-root)/2*n1;
        JOptionPane.showMessageDialog(null, "Para la ecuacion ("+n1+"x^2)"+"+"+n2+"x+"+n3+
                ",\nLa primera solucion de x es: "+bi);
    }
    
}
