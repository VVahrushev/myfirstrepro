package eu.senla.task7.head_factory;

public class Head implements HeadFactory {

    TypeOfHead head;
    public String getType()
    {
        return (TypeOfHead.ROUNDED).toString();
    }
    public Head(TypeOfHead head)
    {
        this.head = head;
    }

    @Override
    public String toString() {
        return "head=" + head;
    }
}
