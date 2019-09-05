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
        //Metodo para conocer la informacion principal enviada al objeto
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

        int aux;
        for (int i = 0; i < 16; i++) {
            if (n4 > n3) {
                aux = n3;
                n3 = n4;
                n4 = aux;
            }
            if (n3 > n2) {
                aux = n2;
                n2 = n3;
                n3 = aux;
            }
            if (n2 > n1) {
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
        }

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

    //Quinto Metodo
    public void Raiz2() {
        double root = (float) Math.sqrt(n1);
        JOptionPane.showMessageDialog(null, "La raiz cuadrada de " + n1 + " es: " + root);
    }

    //Sexto Metodo
    public void Vieta() {
        double root = (float) Math.sqrt((n2 * n2) - (4 * n1 * n3));//Raiz de: (b^2) - 4ac
        double bi = ((-1 * n2) - root) / 2 * n1;
        JOptionPane.showMessageDialog(null, "Para la ecuacion "
                + "(" + n1 + "x^2)" + "+" + n2 + "x+" + n3
                + ",\nLa primera solucion de x es: " + bi);
    }

    //Septimo Metodo
    public void Suma() {
        double sum = n1 + n2;
        JOptionPane.showMessageDialog(null, "La suma de los "
                + "primeros dos numeros " + n1 + " y " + n2 + " es:\n" + sum);
    }

    public void Resta() {
        double res = n1 - n2;
        JOptionPane.showMessageDialog(null, "La resta de los "
                + "primeros dos numeros " + n1 + " y " + n2 + " es:\n" + res);
    }

    public void Mult() {
        double sum = n1 * n2;
        JOptionPane.showMessageDialog(null, "La multiplicacion "
                + "de los primeros dos numeros " + n1 + " y " + n2 + " es:\n" + sum);
    }

    public void Div() {
        double sum = n1 / n2;
        JOptionPane.showMessageDialog(null, "La division "
                + "de los primeros dos numeros " + n1 + " entre " + n2 + " es:\n" + sum);
    }

    public void AND() {
        //Un arreglo tipo string con los nombres de las cosas que voy a preguntar
        String[] sel = {"Gasolina", "Peluche", "Llaves del carro", "Llaves"
            + " de su corazon :v"};
        int[] opt = new int[2]; //Aqui vamos a guardar las dos selecciones que brinde el usuario
        for (int i = 0; i < opt.length; i++) { //Vamos a preguntar la cantidad de veces que sea necesario
            if (i == 0) {
                opt[i] = JOptionPane.showOptionDialog(null, "¿Qué necesito para "
                        + "encender mi auto?", "Compuerta AND",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sel, sel[i]);
                //System.out.println("Primera seleccion " + opt[i]); //Para fines de control 
            } else {
                opt[i] = JOptionPane.showOptionDialog(null, "¿Qué más necesito para "
                        + "encender mi auto?", "Compuerta AND",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sel, sel[i]);
                //System.out.println("Primera seleccion " + opt[i]); //Para fines de control 
            }
        }
        //Finalmente, evaluo la seleccion del usuario con una compuerta AND
        if (opt[0] == 0 && opt[1] == 2) {
            JOptionPane.showMessageDialog(null, "La seleccion fue correcta!", 
                    "Compuerta AND", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Eso no se necesita para encender un auto.", 
                    "Compuerta AND", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void OR() {
        String[] sel = {"Rojo", "Gris", "Amarillo", "Negro"};
        int opt = JOptionPane.showOptionDialog(null, "Decime un color primario", "Compuerta OR",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sel, sel[0]);
        //Evaluamos la seleccion del usuario
        if (opt == 0 || opt == 2) {
            JOptionPane.showMessageDialog(null, "Correcto!", 
                    "Compuerta OR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Sos daltonico?\nNada que ver, amigo.", 
                    "Compuerta OR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void NOT(){
        String [] sel = {"1","3","100","23","4"};
        int res = JOptionPane.showOptionDialog(null, "Cual es la suma de 2 + 2", "Compuerta NOT", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sel, sel[0]);
        if(res != 4)JOptionPane.showMessageDialog(null, "Como fue que ganaste mate?",
                "Compuerta NOT", JOptionPane.ERROR_MESSAGE);
        else JOptionPane.showMessageDialog(null, "Exacto! obviamente es 4",
                "Compuerta NOT",JOptionPane.INFORMATION_MESSAGE);
    }
}
