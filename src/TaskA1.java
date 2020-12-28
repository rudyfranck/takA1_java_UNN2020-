import java.util.Random;

public class TaskA1 {

    public static void main(String[] args) {
        //We accept Negative Random Long
        Random random = new Random();
        Vehicule v1 = new Vehicule(random.nextLong(), "LADA", "Russia");
        Vehicule v2 = new Vehicule(random.nextLong(), "Mercedes", "Germany");
        Vehicule v3 = new Vehicule(random.nextLong(), "Renault", "France");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

    }

}
