package TiposDatosClasesWrapper;

public class Ejercicio2 {
        public static void main(String[] args) {
            // Convertir de int a Integer
            int numero = 5;
            Integer numeroObjeto = Integer.valueOf(numero);

            // Convertir de Integer a int
            int numeroPrimitivo = numeroObjeto.intValue();

            System.out.println("Número como objeto Integer: " + numeroObjeto);
            System.out.println("Número convertido de nuevo a int: " + numeroPrimitivo);

    }
}
