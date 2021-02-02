package Threads;

import java.util.Arrays;

public class MyThreads {
    private static final int size = 10000000;
    private static final int h = size / 2;
    final private float[] arr = new float [size];

    private long initialTime;

    MyThreads()
    {
        Arrays.fill(arr, 1);
        goThroughArray();
        goThroughArrayMultiThreads();
    }

    void goThroughArray()
    {
        initialTime = System.currentTimeMillis();
        for (int index = 0; index < arr.length; index++)
        {
            arr[index] = (float)(arr[index] * Math.sin(0.2f + index / 5) *
                            Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));
        }
        System.out.println ("One thread spent: " + getEclipseTime() +
                            " seconds to recalculate and reinitialize array with 10,000,000 elements.");
    }

    void goThroughArrayMultiThreads ()
    {
        initialTime = System.currentTimeMillis();
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        Thread threadA = new Thread(() -> {
            System.arraycopy(arr, 0, arr1, 0, h);
            for (int index = 0; index < arr1.length; index++)
            {
                arr1[index] = (float)(arr1[index] * Math.sin(0.2f + index / 5) *
                        Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));
            }
        });
        threadA.start();

        Thread threadB = new Thread(() ->{
            System.arraycopy(arr, h, arr2, 0, h-1);
            for (int index = 0; index < arr2.length; index++)
            {
                arr2[index] = (float)(arr2[index] * Math.sin(0.2f + index / 5) *
                        Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));
            }
        });
        threadB.start();

        try
        {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e)
        {
            System.out.println("Caught: " + e);
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.out.println ("Two threads spent: " + getEclipseTime() +
                " seconds to re-recalculate and re-reinitialize array with 10,000,000 elements.");
    }

    float getEclipseTime()
    {
        return (float)(System.currentTimeMillis() - initialTime) / 1000;
    }
}
