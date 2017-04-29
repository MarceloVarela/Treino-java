class Fatorial{


    public static void main(String[] args) {
        
        long fatorial = 1;

        System.out.println("\n\nFatorial de 20 agora!\n\n ");
        for (long n = 1; n <= 20; n++) {

            fatorial = fatorial * n;

            System.out.println("Fatorial de " + n + " = " + fatorial);
        }

        System.out.println("\n\nFatorial de 30 agora!\n\n ");
        for (long n = 1; n <= 30; n++) {

            fatorial = fatorial * n;

            System.out.println("Fatorial de " + n + " = " + fatorial);
        }

        System.out.println("\n\nFatorial de 40 agora! \n\n");
        for (long n = 1; n <= 40; n++) {

            fatorial = fatorial * n;

            System.out.println("Fatorial de " + n + " = " + fatorial);
        }
    }
}