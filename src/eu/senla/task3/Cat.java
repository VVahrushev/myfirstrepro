package eu.senla.task3;
import java.util.Arrays;

public class Cat {
    public String name;
   public  int age;
    Cat(String name, int age)
    {
        this.name = name; this.age = age;
    }
    public String ToString()
    {
        return this.name+" "+this.age;
    }

    public void CatCreate( )
    {
        name = "Barsik ";
        age = 2;
        System.out.println("Cat name = "+ name + "Cate age = "+ age);
    }

    public String getName() {
        return name;
    }
    public void setName(String cat2) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age2) {
        this.age = age;
    }
    public void CatCreate2(String H, int N)
    {
        setName(H);
        setAge(N);
        System.out.println("Cat Name = "+getName()+" Cat Age = "+ getAge());
    }
    public Cat(int N, String H)
    {
        setName(H);
        setAge(N);
    }
    public Cat(){}
    public static Cat[] CreateArr()
   {
       Cat [] arr = new Cat[5];
      for (int i = 0; i<arr.length;i++)
      {
          arr[i] = new Cat("martin",3 );
      }
       return arr;
   }
   public static void Writearr(Cat[] cats)
   {
       for(Cat cat : cats)
       {
           System.out.println(cat.ToString());
       }
   }




}
