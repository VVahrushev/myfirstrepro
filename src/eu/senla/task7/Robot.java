package eu.senla.task7;

import eu.senla.task7.body_factory.Body;
import eu.senla.task7.body_factory.BodyFactory;
import eu.senla.task7.body_factory.TypeOfBody;
import eu.senla.task7.head_factory.Head;
import eu.senla.task7.head_factory.HeadFactory;

public class Robot  {

    private String name;
    private Body body;
    private Head head;

    public Robot (String name, Body body, Head head)
    {
        this.name = name;
        this.body = body;
        this.head = head;

    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", " + body +
                ", " + head +
                '}';
    }



}
