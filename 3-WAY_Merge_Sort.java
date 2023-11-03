class ThreeWayMergeSort
{
	static int comp = 0;

	public static void threeWayMergeSort(int arr[], int n)
    { 
    	if (n == 0)
        {
            return;
        }
        
        // copy given array 
        int[] copyArray = new int[n];
        for (int i = 0; i < n; i++)
        {
            copyArray[i] = arr[i];
        }
    
        threeWayMergeSortRec(copyArray, 0, n, arr);
        for (int i = 0; i < n; i++)
        {
            arr[i] = copyArray[i];
        }
    }

    public static void threeWayMergeSortRec(int arr[], int low, int high, int arr2[])
    {
        if (high - low < 2)
        {
            return;
        }
        int mid1 = low + ((high - low) / 3);
        int mid2 = low + 2 * ((high - low) / 3) + 1;

        threeWayMergeSortRec(arr2, low, mid1, arr);
        threeWayMergeSortRec(arr2, mid1, mid2, arr);
        threeWayMergeSortRec(arr2, mid2, high, arr);
        merge(arr2, low, mid1, mid2, high, arr);
    }

	public static void merge(int arr[], int low, int mid1, int mid2, int high, int arr2[])
    {
        int i = low, j = mid1, k = mid2, l = low;
        while ((i < mid1) && (j < mid2) && (k < high))
        {
            comp++;
            if (arr[i] < arr[j])
            {
                comp++;
                if (arr[i] < arr[k])
                {
                    arr2[l++] = arr[i++];
                }
                else
                {
                    arr2[l++] = arr[k++];
                }
            }
            else
            {
                comp++;
                if (arr[j] < arr[k])
                {
                    arr2[l++] = arr[j++];
                }
                else
                {
                    arr2[l++] = arr[k++];
                }
            }
        }
        while ((i < mid1) && (j < mid2))
        {
            comp++;
            if (arr[i] < arr[j])
            {
                arr2[l++] = arr[i++];
            }
            else
            {
                arr2[l++] = arr[j++];
            }
        }
        while ((j < mid2) && (k < high))
        {
            comp++;
            if (arr[j] < arr[k])
            {
                arr2[l++] = arr[j++];
            }
            else
            {
                arr2[l++] = arr[k++];
            }
        }
        while ((i < mid1) && (k < high))
        {
            comp++;
            if (arr[i] < arr[k])
            {
                arr2[l++] = arr[i++];
            }
            else
            {
                arr2[l++] = arr[k++];
            }
        }
        while (i < mid1)
        {
            arr2[l++] = arr[i++]; 
            comp++;
        }
        while (j < mid2)
        {
            arr2[l++] = arr[j++];
            comp++;
        }
        while (k < high)
        {
            arr2[l++] = arr[k++]; 
            comp++;
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

        System.out.print("3-WAY_MERGE_SORT\n");
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
        threeWayMergeSort(a, 1000);
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
        threeWayMergeSort(b, 2000);
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
        threeWayMergeSort(c, 4000);
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
        threeWayMergeSort(d, 8000);
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
        threeWayMergeSort(increasing1, 1000);
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
        threeWayMergeSort(increasing2, 2000);
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
        threeWayMergeSort(increasing3, 4000);
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
        threeWayMergeSort(increasing4, 8000);
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
        threeWayMergeSort(decreasing1, 1000);
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
        threeWayMergeSort(decreasing2, 2000);
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
        threeWayMergeSort(decreasing3, 4000);
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
        threeWayMergeSort(decreasing4, 8000);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        
        System.out.println("Time difference for size 8000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 8000: "+ comp);
        comp = 0;
    }
}