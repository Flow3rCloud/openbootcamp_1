public class App {
    public static void main(String[] args) {
        int resultado = suma(1,2,3);
        System.out.println(resultado);
        
        Coche coche1 = new Coche();
        coche1.agregarPuertas();
        System.out.println(coche1.numeroPuertas);

    }

    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
      }


}
