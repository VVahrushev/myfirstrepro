package eu.senla.task3;

public class Cat {
    public void CatCreate( )
    {
        String cate1 = "Barsik ";
        int Age1 = 2;
        System.out.println("Cat name = "+ cate1 + "Cate age = "+ Age1);
    }
    private String cat2;
    public String getCat2() {
        return cat2;
    }
    public void setCat2(String cat2) {
        this.cat2 = cat2;
    }
    private int Age2;
    public int getAge2() {
        return Age2;
    }
    public void setAge2(int age2) {
        Age2 = age2;
    }
    public void CatCreate2(String H, int N)
    {
        setCat2(H);
        setAge2(N);
        System.out.println("Cat Name = "+getCat2()+" Cat Age = "+ getAge2());
    }
}
