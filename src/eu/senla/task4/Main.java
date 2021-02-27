package eu.senla.task4;

public class Main {
        public static String A = "ABCDEFGRUJP";
        public static String[][] matrixCreate()
        {
            String[][] matrix = new String[10][10];
            for(int i =0;i<matrix.length-1;i+=3){
                for(int j = 0; j<matrix[i].length;j++){
                    matrix[9][j] = String.valueOf((String.valueOf(A.charAt((int) (Math.random() * 10))))) + String.valueOf((String.valueOf(A.charAt((int) (Math.random() * 10))))) + String.valueOf((String.valueOf(A.charAt((int) (Math.random() * 10))))) + String.valueOf((String.valueOf(A.charAt((int) (Math.random() * 10))))) + String.valueOf((String.valueOf(A.charAt((int) (Math.random() * 10))))) + String.valueOf((String.valueOf(A.charAt((int) (Math.random() * 10)))));
                    matrix[i][j]= String.valueOf((String.valueOf(A.charAt((int)(Math.random()*10)))))+String.valueOf((String.valueOf(A.charAt((int)(Math.random()*10)))))+String.valueOf((String.valueOf(A.charAt((int)(Math.random()*10)))))+String.valueOf((String.valueOf(A.charAt((int)(Math.random()*10)))))+String.valueOf((String.valueOf(A.charAt((int)(Math.random()*10)))))+String.valueOf((String.valueOf(A.charAt((int)(Math.random()*10)))));
                    matrix[i+1][j]= String.valueOf((String.valueOf(A.charAt((int)(Math.random()*10)))))+String.valueOf((String.valueOf(A.charAt((int)(Math.random()*10)))))+String.valueOf((String.valueOf(A.charAt((int)(Math.random()*10)))))+String.valueOf((String.valueOf(A.charAt((int)(Math.random()*10)))))+String.valueOf((String.valueOf(A.charAt((int)(Math.random()*10)))))+String.valueOf((String.valueOf(A.charAt((int)(Math.random()*10)))));
                    double rnd = (Math.random()*10);
                    double finalrnd = Math.round(rnd*100000)/100000.00;
                    matrix[i+2][j]=String.valueOf(finalrnd);
                    if (i>6) {
                        i = 10;
                        matrix[i][j] = String.valueOf((String.valueOf(A.charAt((int) (Math.random() * 10))))) + String.valueOf((String.valueOf(A.charAt((int) (Math.random() * 10))))) + String.valueOf((String.valueOf(A.charAt((int) (Math.random() * 10))))) + String.valueOf((String.valueOf(A.charAt((int) (Math.random() * 10))))) + String.valueOf((String.valueOf(A.charAt((int) (Math.random() * 10))))) + String.valueOf((String.valueOf(A.charAt((int) (Math.random() * 10)))));
                    }
                }
            }
            return matrix;
        }
        public static void prinarr(String[][] matr)
        {
            for(int i =0;i<matr.length;i++){
                for(int j = 0; j<matr[i].length;j++){
                    System.out.print(matr[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static String[] diag2 (String[][] matr)
        {
            String[] diag2= new String[10];
            int x=9,y=0,i=0;
            while(x>-1 && y<10){
                diag2[i]=matr[y][x];
                i++;
                x--;
                y++;
            }
            return diag2;
        }
    public static String[] diag1 (String[][] matr)
    {
        String[] diag1= new String[10];
        int x=0,y=0,i=0;
        while(x<10 && y<10){
            diag1[i]=matr[x][y];
            i++;
            x++;
            y++;
        }
        return diag1;
    }
        public static void prindiag(String [] diags)
        {
            System.out.println();
            for (String diag : diags)
            {
                System.out.print(diag+" ");
            }
            System.out.println();
        }
        public static boolean comparediag(String [] diag1, String[] diag2 )
        {
            int temp = 0;
            for (int i = 0; i<diag1.length; i++)
            {
              if(diag1[i]==diag2[i]) temp++ ;
            }
            if(temp ==10) return true;
            return false;
        }
        public static double[] masd(String [] diag)
        {
            int j = 0;
            double[] mas = new double[3];
            for (int i = 2; i<diag.length; i+=3)
            {
                double H = Double.parseDouble(String.valueOf(diag[i].charAt(2)));
                    if(H>7)
                    mas[j] = Math.ceil(Double.parseDouble(diag[i]));
                    else mas[j] = Math.floor(Double.parseDouble(diag[i]));
                    j++;
            }
            return mas;
        }
        public static StringBuilder createSB(String[] diag)
        {
            StringBuilder SB = new StringBuilder();
            for (int i = 0,j=1; i<diag.length&&j<diag.length; i+=3, j+=3)
            {
                SB.append(diag[i].charAt(2)).append(diag[i].charAt(3)).append(diag[i].charAt(4)).append(diag[j].charAt(2)).append(diag[j].charAt(3)).append(diag[j].charAt(4));

            }
            SB.append(diag[9].charAt(2)).append(diag[9].charAt(3)).append(diag[9].charAt(4));
            return SB;
        }
        public static void writeSB(StringBuilder SB)
        {
            System.out.println(SB);
        }
        public static void printD(double[] mas)
        {
            for(int i = 0; i < mas.length; i++)
            {
                System.out.print(mas[i]+" - ");
            }
            System.out.println();
        }

        public static void main (String[] args)
        {
            String[][] matr = matrixCreate();
            prinarr(matr);
            String [] diag1 = diag1(matr);
            String[] diag2 = diag2(matr);
            System.out.print("Secondary diag - "); prindiag(diag2);
            System.out.print("Main diag - "); prindiag(diag1);
            System.out.println(comparediag(diag1,diag2));
            double[] mas1 = masd(diag1);
            double[] mas2 = masd(diag2);
            printD(mas1);
            printD(mas2);
            StringBuilder SB1=createSB(diag1);
            StringBuilder SB2 = createSB(diag2);
            writeSB(SB1);
            writeSB(SB2);
        }












}
