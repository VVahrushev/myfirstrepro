package eu.senla.task7.body_factory;

public class Body implements BodyFactory{
     TypeOfBody body;

    public String bodySize(TypeOfBody body)
    {
      return body.toString();
    }
    public Body(TypeOfBody body)
    {
        this.body = body;
    }

    @Override
    public String toString() {
        return "body=" + body;
    }
}
