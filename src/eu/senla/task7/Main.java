package eu.senla.task7;

import eu.senla.task7.body_factory.Body;
import eu.senla.task7.body_factory.BodyFactory;
import eu.senla.task7.body_factory.TypeOfBody;
import eu.senla.task7.head_factory.Head;
import eu.senla.task7.head_factory.HeadFactory;
import eu.senla.task7.head_factory.TypeOfHead;

public class Main {

    public static void main (String[] args) {
        BodyFactory big = new Body(TypeOfBody.BIG);
        BodyFactory small = new Body(TypeOfBody.SMALL);
        BodyFactory medium = new Body(TypeOfBody.MEDIUM);
        HeadFactory triangle = new Head(TypeOfHead.TRIANGLED);
        HeadFactory rounded = new Head(TypeOfHead.ROUNDED);
        HeadFactory square = new Head(TypeOfHead.SQUARED);
        Robot robot1 = new Robot("Yandex", (Body) big,(Head) triangle);
        Robot robot2 = new Robot("Google", (Body) small, (Head) square);
        System.out.println(robot1);
        System.out.println(robot2);






    }



}
