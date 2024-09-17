package clasesAbstractasInterfaces;

public class Ejercicio2 {
}

interface Nadador{
    void nadar();
}

class Pez implements Nadador{
    public void nadar(){
        System.out.println("el pez nada alrededor de la pecera");
    }
}

class Humano implements Nadador{
    public void nadar(){
        System.out.println("La persona nada en la piscina");
    }
}
