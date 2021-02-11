package eu.senla.task2;

public class Rainbow {
    public Rainbow() {
    }

    public static int n;

    public void start(int Y, int H) {
        System.out.println();
        switch (Y) {
            case 1:
                System.out.print((char) 27 + "[31mRed + ");
                switch (H) {
                    case 1:
                        System.out.println((char) 27 + "[31mRed " + (char) 27 + "[0m");
                        break;
                    case 2:
                        System.out.println((char) 27 + "[33mYellow " + (char) 27 + "[0m");
                        break;
                    case 3:
                        System.out.println((char) 27 + "[32mGreen " + (char) 27 + "[0m");
                        break;
                    case 4:
                        System.out.println((char) 27 + "[36mCyan " + (char) 27 + "[0m");
                        break;
                    case 5:
                        System.out.println((char) 27 + "[34mBlue " + (char) 27 + "[0m");
                        break;
                    case 6:
                        System.out.println((char) 27 + "[35mPurple " + (char) 27 + "[0m");
                        break;
                    default:
                        System.out.println("Error");
                }
                break;
            case 2:
                System.out.print((char) 27 + "[33mYellow + ");
                switch (H) {
                    case 1:
                        System.out.println((char) 27 + "[31mRed " + (char) 27 + "[0m");
                        break;
                    case 2:
                        System.out.println((char) 27 + "[33mYellow " + (char) 27 + "[0m");
                        break;
                    case 3:
                        System.out.println((char) 27 + "[32mGreen " + (char) 27 + "[0m");
                        break;
                    case 4:
                        System.out.println((char) 27 + "[36mCyan " + (char) 27 + "[0m");
                        break;
                    case 5:
                        System.out.println((char) 27 + "[34mBlue " + (char) 27 + "[0m");
                        break;
                    case 6:
                        System.out.println((char) 27 + "[35mPurple " + (char) 27 + "[0m");
                        break;
                    default:
                        System.out.println("Error");
                }
                break;

            case 3:
                System.out.print((char) 27 + "[32mGreen + ");
                switch (H) {
                    case 1:
                        System.out.println((char) 27 + "[31mRed " + (char) 27 + "[0m");
                        break;
                    case 2:
                        System.out.println((char) 27 + "[33mYellow " + (char) 27 + "[0m");
                        break;
                    case 3:
                        System.out.println((char) 27 + "[32mGreen " + (char) 27 + "[0m");
                        break;
                    case 4:
                        System.out.println((char) 27 + "[36mCyan " + (char) 27 + "[0m");
                        break;
                    case 5:
                        System.out.println((char) 27 + "[34mBlue " + (char) 27 + "[0m");
                        break;
                    case 6:
                        System.out.println((char) 27 + "[35mPurple " + (char) 27 + "[0m");
                        break;
                    default:
                        System.out.println("Error");
                }
                break;
            case 4:
                System.out.print((char) 27 + "[36mCyan + ");
                switch (H) {
                    case 1:
                        System.out.println((char) 27 + "[31mRed " + (char) 27 + "[0m");
                        break;
                    case 2:
                        System.out.println((char) 27 + "[33mYellow " + (char) 27 + "[0m");
                        break;
                    case 3:
                        System.out.println((char) 27 + "[32mGreen " + (char) 27 + "[0m");
                        break;
                    case 4:
                        System.out.println((char) 27 + "[36mCyan " + (char) 27 + "[0m");
                        break;
                    case 5:
                        System.out.println((char) 27 + "[34mBlue " + (char) 27 + "[0m");
                        break;
                    case 6:
                        System.out.println((char) 27 + "[35mPurple " + (char) 27 + "[0m");
                        break;
                    default:
                        System.out.println("Error");
                }
                break;
            case 5:
                System.out.print((char) 27 + "[34mBlue + ");
                switch (H) {
                    case 1:
                        System.out.println((char) 27 + "[31mRed " + (char) 27 + "[0m");
                        break;
                    case 2:
                        System.out.println((char) 27 + "[33mYellow " + (char) 27 + "[0m");
                        break;
                    case 3:
                        System.out.println((char) 27 + "[32mGreen " + (char) 27 + "[0m");
                        break;
                    case 4:
                        System.out.println((char) 27 + "[36mCyan " + (char) 27 + "[0m");
                        break;
                    case 5:
                        System.out.println((char) 27 + "[34mBlue " + (char) 27 + "[0m");
                        break;
                    case 6:
                        System.out.println((char) 27 + "[35mPurple " + (char) 27 + "[0m");
                        break;
                    default:
                        System.out.println("Error");
                }
                break;
            case 6:
                System.out.print((char) 27 + "[35mPurple + ");
                switch (H) {
                    case 1:
                        System.out.println((char) 27 + "[31mRed " + (char) 27 + "[0m");
                        break;
                    case 2:
                        System.out.println((char) 27 + "[33mYellow " + (char) 27 + "[0m");
                        break;
                    case 3:
                        System.out.println((char) 27 + "[32mGreen " + (char) 27 + "[0m");
                        break;
                    case 4:
                        System.out.println((char) 27 + "[36mCyan " + (char) 27 + "[0m");
                        break;
                    case 5:
                        System.out.println((char) 27 + "[34mBlue " + (char) 27 + "[0m");
                        break;
                    case 6:
                        System.out.println((char) 27 + "[35mPurple " + (char) 27 + "[0m");
                        break;
                    default:
                        System.out.println("Error");
                }
                break;
            default:
                System.out.println("error");
        }
    }

    public void start(int N) {
        {
            switch (N) {
                case 1:
                    System.out.println((char) 27 + "[31mRed " + (char) 27 + "[0m");
                    break;
                case 2:
                    System.out.println((char) 27 + "[33mYellow " + (char) 27 + "[0m");
                    break;
                case 3:
                    System.out.println((char) 27 + "[32mGreen " + (char) 27 + "[0m");
                    break;
                case 4:
                    System.out.println((char) 27 + "[36mCyan " + (char) 27 + "[0m");
                    break;
                case 5:
                    System.out.println((char) 27 + "[34mBlue " + (char) 27 + "[0m");
                    break;
                case 6:
                    System.out.println((char) 27 + "[35mPurple " + (char) 27 + "[0m");
                    break;
                default:
                    System.out.println("Error");
            }
        }

    }
}