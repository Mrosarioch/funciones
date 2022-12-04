public class App {
    public static void main(String[] args)  {
        Coche miCoche= new Coche();
        miCoche.sumarpuertas();
        System.out.println(miCoche.puertas);
        int resultado=0;
        int a = 5;
        int b = 5;
        int c = 10;
       resultado= suma(a, b, c);
       System.out.println(resultado);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;

    }
}
class Coche{
    public int puertas = 0;
    public void sumarpuertas(){
        this.puertas++;
    }
}

// Crear una clase coche.

// Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

// Una función que incremente el número de puertas que tiene el coche.

// Crear un objeto miCoche en el main y añadirle una puerta.

// Mostrar el número de puertas que tiene el objeto.