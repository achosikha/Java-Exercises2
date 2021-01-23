package Exceptions;

import java.util.Scanner;

public class MyExceptions {

    String myMassive [][];

    MyExceptions()
    {
        setMassive();
        initializeArray();
        getMassive();
        sumArray();
    }

    int getArrayNumber()
    {
        Scanner myNumber = new Scanner(System.in);

        return myNumber.nextInt();
    }

    void setMassive()
    {
        System.out.print ("Your array size must be 4x4. Enter two int to set array size: ");

        int rows = getArrayNumber();
        int columns = getArrayNumber();

        myMassive = new String[rows][columns];

        if (myMassive.length != 4 || myMassive[0].length != 4)
        {
            throw new IllegalArgumentException("MyArraySizeException");
        }
        else
        {
            System.out.println ("You have entered right size\n");
        }
    }

    void initializeArray()
    {
        for (int rows = 0; rows < myMassive.length; rows++)
        {
            for (int columns = 0; columns < myMassive[0].length; columns++)
            {
                myMassive[rows][columns] = String.valueOf (rows + columns);
            }
        }

        myMassive[0][2] = "$";
        myMassive[1][1] = "String";
        myMassive[2][0] = "NULL";
        myMassive[3][3] = "#";
    }

    void getMassive ()
    {
        for (int rows = 0; rows < myMassive.length; rows++)
        {
            for (int columns = 0; columns < myMassive[0].length; columns++)
            {
                System.out.println ("myMassive[" + rows + "][" + columns + "]: " + myMassive[rows][columns]);
            }
            System.out.println();
        }
    }

    void sumArray()
    {
        int sum = 0;

        for (int rows = 0; rows < myMassive.length; rows++)
        {
            for (int columns = 0; columns < myMassive[0].length; columns++)
            {
                try
                {
                    sum = sum + Integer.parseInt(myMassive[rows][columns]);
                } catch (NumberFormatException e)
                {
                    System.out.print ("myMassive[" + rows + "][" + columns + "]: ");
                    System.out.println ("MyArrayDataException");
                }
            }
        }
        System.out.println ("\nSum of the all rows and columns values of the massive is: " + sum);
    }
}
