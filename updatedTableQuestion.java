public class Pydp {

    public static void pattern (int n) {
        int nsp = n/2;
        int nst = 1;

        for (int csp = 1; csp <= nsp; csp++) {
            System.out.print("\t");
        }

        for (int cst = 1; cst <= nst; cst++) {
            System.out.println("*\t");
        }
        nsp--;
        nst++;
    }
    
}
