class quickSort_medianOf3Pivot
{
	static int comp = 0;

	// Quick Sort Median of 3 pivot
	static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }


    public static int getMedian(int arr[], int low,int high)
    {
        int mid = (low+high)/2;
         
        if(arr[low] > arr[mid])
            swap(arr, low, mid);
         
        if(arr[low] > arr[high])
            swap(arr, low, high);
         
        if(arr[mid] > arr[high])
            swap(arr, mid, high);
         
        swap(arr, mid, high);
        return arr[high];
    }
     
    static int partition(int arr[], int low, int high)
    {
        // pivot is chosen by median of 3
        getMedian(arr,low,high);
        int pivot = arr[high];
     
 
        int i = (low-1);
        for (int j = low; j < high; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                swap(arr, i, j);
                comp++;
            }
        }
 
        // swap arr[i+1] and arr[high]
        swap(arr, high, i + 1);
 
        return i+1;
    }

	public static void swap(int[] arr, int i, int j) 
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

        System.out.print("QUICK SORT ( Median of 3 pivot )\n");
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
        quickSort(a, 0, a.length-1);
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
        quickSort(b, 0, b.length-1);
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
        quickSort(c, 0, c.length-1);
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
        quickSort(d, 0, d.length-1);
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
        quickSort(increasing1, 0, increasing1.length-1);
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
        quickSort(increasing2, 0, increasing2.length-1);
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
        quickSort(increasing3, 0, increasing3.length-1);
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
        quickSort(increasing4, 0, increasing4.length-1);
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
        quickSort(decreasing1, 0, decreasing1.length-1);
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
        quickSort(decreasing2, 0, decreasing2.length-1);
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
        quickSort(decreasing3, 0, decreasing3.length-1);
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
        quickSort(decreasing4, 0, decreasing4.length-1);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        
        System.out.println("Time difference for size 8000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 8000: "+ comp);
        comp = 0;
    }
}