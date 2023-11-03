class Insertion_Sort
{
	static int comp = 0;
    public static void insertionSort(int arr[], int n)
    {
        int i, key, j;
        for (i = 1; i < n; i++)
        {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
                comp++;
            }
            arr[j + 1] = key;
        }
    }
	public static void fill_random_numbers(int a[], int size) 
    {
        for (int i = 0; i < size; i++) 
        {
            a[i] = (int) Math.round(Math.random() * 1000000);
        }
    }

    public static void fill_sorted_numbers(int[] inc, int[] dec, int size) 
    {
        int step = 1000000 / size;
        for (int i = 0; i < size; i++) 
        {
            inc[i] = dec[size - 1 - i] = step * i;
        }
    }

	public static void main(String[] args) 
    {
        int[] a = new int[1000];
        int[] b = new int[2000];
        int[] c = new int[4000];
        int[] d = new int[8000];

        int[] increasing1 = new int[1000];
        int[] increasing2 = new int[2000];
        int[] increasing3 = new int[4000];
        int[] increasing4 = new int[8000];

        int[] decreasing1 = new int[1000];
        int[] decreasing2 = new int[2000];
        int[] decreasing3 = new int[4000];
        int[] decreasing4 = new int[8000];

        System.out.print("INSERTION SORT\n");
        System.out.print("\nFor Random Number array:\n");

        fill_random_numbers(a, 1000);
        fill_random_numbers(b, 2000);
        fill_random_numbers(c, 4000);
        fill_random_numbers(d, 8000);

        fill_sorted_numbers(increasing1, decreasing1, 1000);
        fill_sorted_numbers(increasing2, decreasing2, 2000);
        fill_sorted_numbers(increasing3, decreasing3, 4000);
        fill_sorted_numbers(increasing4, decreasing4, 8000);
        
        //System.out.print("Input Array: ");
        /* If you want to see the Array please remove comments
        for (int i = 0; i < 1000; ++i)
        {
            System.out.println(a[i]+" ");
        } 
        */

        long start = System.nanoTime();
        insertionSort(a, 1000);
        long finish = System.nanoTime();
        long timeElapsed = finish - start;

        System.out.println("Time difference for size 1000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 1000: "+ comp);
        comp = 0;

        //System.out.print("Input Array: ");
        /*  If you want to see the Array please remove comments
        for (int i = 0; i < 2000; ++i)
        {
            System.out.println(b[i]+" ");
        }
        */

        start = System.nanoTime();
        insertionSort(b, 2000);
        finish = System.nanoTime();
        timeElapsed = finish - start;

        System.out.println("Time difference for size 2000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 2000: "+ comp);
        comp = 0;

        //System.out.print("Input Array: ");
        /*  If you want to see the Array please remove comments
        for (int i = 0; i < 4000; ++i)
        {
            System.out.println(c[i]+" ");
        }
        */

        start = System.nanoTime();
        insertionSort(c, 4000);
        finish = System.nanoTime();
        timeElapsed = finish - start;

        System.out.println("Time difference for size 4000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 4000: "+ comp);
        comp = 0;

        //System.out.print("Input Array: ");
        /*  If you want to see the Array please remove comments
        for (int i = 0; i < 8000; ++i)
        {
            System.out.println(d[i]+" ");
        }
        */

        start = System.nanoTime();
        insertionSort(d, 8000);
        finish = System.nanoTime();
        timeElapsed = finish - start;

        System.out.println("Time difference for size 8000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 8000: "+ comp);
        comp = 0;

        System.out.print("\nFor Sorted array:\n");
        //System.out.print("Input Array: ");
        /*  If you want to see the Array please remove comments
        for (int i = 0; i < 1000; ++i)
        {
            System.out.println(increasing1[i]+" ");
        }
        */
        
        start = System.nanoTime();
        insertionSort(increasing1, 1000);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        
        System.out.println("Time difference for size 1000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 1000: "+ comp);
        comp = 0;

        //System.out.print("Input Array: ");
        /*  If you want to see the Array please remove comments
        for (int i = 0; i < 2000; ++i)
        {
            System.out.println(increasing2[i]+" ");
        }
        */
        
        start = System.nanoTime();
        insertionSort(increasing2, 2000);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        
        System.out.println("Time difference for size 2000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 2000: "+ comp);
        comp = 0;

        //System.out.print("Input Array: ");
        /*  If you want to see the Array please remove comments
        for (int i = 0; i < 4000; ++i)
        {
            System.out.println(increasing3[i]+" ");
        }
        */
        
        start = System.nanoTime();
        insertionSort(increasing3, 4000);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        
        System.out.println("Time difference for size 4000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 4000: "+ comp);
        comp = 0;

        //System.out.print("Input Array: ");
        /*  If you want to see the Array please remove comments
        for (int i = 0; i < 8000; ++i)
        {
            System.out.println(increasing4[i]+" ");
        }
        */
        
        start = System.nanoTime();
        insertionSort(increasing4, 8000);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        
        System.out.println("Time difference for size 8000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 8000: "+ comp);
        comp = 0;

        System.out.print("\nFor Reverse sorted array:\n");

        //System.out.print("Input Array: ");
        /*  If you want to see the Array please remove comments
        for (int i = 0; i < 1000; ++i)
        {
            System.out.println(decreasing1[i]+" ");
        }
        */
        
        start = System.nanoTime();
        insertionSort(decreasing1, 1000);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        
        System.out.println("Time difference for size 1000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 1000: "+ comp);
        comp = 0;
        
        //System.out.print("Input Array: ");
        /*  If you want to see the Array please remove comments
        for (int i = 0; i < 2000; ++i)
        {
            System.out.println(decreasing2[i]+" ");
        }
        */
        
        start = System.nanoTime();
        insertionSort(decreasing2, 2000);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        
        System.out.println("Time difference for size 2000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 2000: "+ comp);
        comp = 0;

        //System.out.print("Input Array: ");
        /*  If you want to see the Array please remove comments
        for (int i = 0; i < 4000; ++i)
        {
            System.out.println(decreasing3[i]+" ");
        }
        */
        
        start = System.nanoTime();
        insertionSort(decreasing3, 4000);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        
        System.out.println("Time difference for size 4000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 4000: "+ comp);
        comp = 0;

        //System.out.print("Input Array: ");
        /*  If you want to see the Array please remove comments
        for (int i = 0; i < 8000; ++i)
        {
            System.out.println(decreasing4[i]+" ");
        }
        */
        
        start = System.nanoTime();
        insertionSort(decreasing4, 8000);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        
        System.out.println("Time difference for size 8000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 8000: "+ comp);
        comp = 0;
    }
}