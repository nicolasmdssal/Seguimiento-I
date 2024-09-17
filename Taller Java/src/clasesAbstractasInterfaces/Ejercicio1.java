package clasesAbstractasInterfaces;

abstract public class Ejercicio1 {
    abstract void mover();
}

class carro extends Ejercicio1{
    void mover(){
        System.out.println("el carro se mueve");
    }
}

class bicicleta extends Ejercicio1{
    void mover(){
        System.out.println("la bicicleta se mueve");
    }
}
