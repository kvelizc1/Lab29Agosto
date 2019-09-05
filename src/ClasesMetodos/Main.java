package ClasesMetodos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String args[]) {
        Numeros nums = new Numeros(12, 90, 23, 15);
        nums.showInf();//Vamos a mostrar los numeros por motivos de control
        //Vamos a crear un menu dentro del main debido 
        //a la cantidad de metodos que hay, asi se facilita la ejecucion
        String[] Metodos = {
            "Igualdad", "Comparar Mayor o Menor", "Ordenar de Maximo a Minimo",
            "Ordenar de Minimo a Maximo", "Raiz Cuadrada",
            "Formula para ecuaciones cuadraticas", "Compuerta AND",
            "Compuerta OR", "Compuerta NOT"
        };

        String opt = (String) JOptionPane.showInputDialog(null,
                "Selecciona el metodo que deseas ejecutar", "Menu Principal",
                JOptionPane.DEFAULT_OPTION, null, Metodos, Metodos[0]);
        //System.out.println(opt); //Para efectos de control

        if (opt == "Igualdad") {
            nums.igualdad();
        } else if (opt == "Comparar Mayor o Menor") {
            nums.MayorMenor();
        } else if (opt == "Ordenar de Maximo a Minimo") {
            nums.Maximo();
        } else if (opt == "Ordenar de Minimo a Maximo") {
            nums.Minino();
        } else if (opt == "Raiz Cuadrada") {
            nums.Raiz2();
        } else if (opt == "Formula para ecuaciones cuadraticas") {
            nums.Vieta();
        } else if (opt == "Compuerta AND") {
            nums.AND();
        } else if (opt == "Compuerta OR") {
            nums.OR();
        } else if (opt == "Compuerta NOT") {
            nums.NOT();
        }

    }
}
