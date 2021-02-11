package eu.senla.task2;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("1 - red; 2 - yellow; 3 - green; 4 - cyan; 5 - blue; 6 - purple");
        Rainbow rainbow = new Rainbow();
        rainbow.start(1);
        rainbow.start(2);
        rainbow.start(3);
        rainbow.start(4);
        rainbow.start(5);
        rainbow.start(6);
        rainbow.start(1,3);
        rainbow.start(2,6);
        rainbow.start(3,3);
    }
}
