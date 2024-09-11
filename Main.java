public class Main{

    public static void main(String[] args) {
        FrascosDulce frascoDulce = new FrascosDulce();
        System.out.println("Se pudo envasar 250?: " + frascoDulce.envasarDulce(250));

        System.out.println("Se pudo envasar 200?: " + frascoDulce.envasarDulce(200));
        System.out.println("la cantidad es: " + frascoDulce.cantidad + " gr");

        System.out.println("cantidad Sacada: " + frascoDulce.sacarDulce(150) + " gr");
        System.out.println("Quedan: " + frascoDulce.cantidad + " gr");

        System.out.println("cantidad Sacada: " + frascoDulce.sacarDulce(60) + " gr");
        System.out.println("Quedan: " + frascoDulce.cantidad + " gr");

    }
}