package eu.senla.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Cat kotik = new Cat();
       int x = 0;
      while (x != 10)
      {
          kotik.CatCreate();
          x++;
      }
       Scanner in = new Scanner(System.in);
      for(int i = 0; i<10; i++)
      {
          String H = in.next();
          int N = in.nextInt();
          kotik.CatCreate2(H,N);
      }
      int n = 0;
      do
      {
       String H1 = in.next();
       int N = in.nextInt();
       Cat kotik3 = new Cat(N,H1);
       System.out.println("Cat name = " + kotik3.getName() + "Cat age = " + kotik3.getAge());
       n++;
      }
      while(n<10);

      Cat[] cats = kotik.CreateArr();
      kotik.Writearr(cats);
      boolean b = cats.equals(cats);
      System.out.println(b);



    }
}
