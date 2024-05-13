package lambdalambdaInterfejsF;


interface Liczba1 //interfejs funkcyjny Liczba1
{
    boolean sprawdzCzy(int a, int b);
}
public class Main {
    public static void main(String[] args)
    {
        int x = 4;
        int y = 8;

        Liczba1 Suma = (int a, int b) -> (a * b) > 30;

        if(Suma.sprawdzCzy(x,y))
        {
            System.out.println("iloczyn dwóch liczb " + x + " i " + y + " jest wiekszy od 30.");
        }
    }
}
