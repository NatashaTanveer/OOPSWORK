public class Marks {
    int sidra;
    int natasha;
    int laiba;
    public Marks() {
        sidra = 89;
        natasha = 79;
        laiba = 88;
        System.out.println("The sum of three is:");
    }
    public Marks(int a, int b, int c) {
        sidra = a;
        natasha = b;
        laiba = c;
    }
    public int calculateSum(){
        return(sidra+natasha+laiba);

    }
}
