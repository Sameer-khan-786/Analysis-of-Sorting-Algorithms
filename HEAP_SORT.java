class Heap_sort
{
	static int comp = 0;

	public static void HeapSort(int arr[], int n)
    {
        for (int i = n / 2 - 1; i >= 0; i--)
        {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) 
        {
            swap(arr, 0, i);
            comp++;
            heapify(arr, i, 0);
        }
    }
  
    static void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 
 
        if (left < n && arr[left] > arr[largest])
        {
            largest = left;
        }
  
        if (right < n && arr[right] > arr[largest])
        {
            largest = right;
        }
  
        if (largest != i) 
        {
        	swap(arr, i, largest);
        	comp++;
            heapify(arr, n, largest);
        }
    }

    public static void swap(int[] arr, int i, int j) {
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

        System.out.print("HEAP SORT\n");
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
        HeapSort(a, 1000);
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
        HeapSort(b, 2000);
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
        HeapSort(c, 4000);
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
        HeapSort(d, 8000);
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
        HeapSort(increasing1, 1000);
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
        HeapSort(increasing2, 2000);
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
        HeapSort(increasing3, 4000);
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
        HeapSort(increasing4, 8000);
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
        HeapSort(decreasing1, 1000);
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
        HeapSort(decreasing2, 2000);
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
        HeapSort(decreasing3, 4000);
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
        HeapSort(decreasing4, 8000);
        finish = System.nanoTime();
        timeElapsed = finish - start;
        
        System.out.println("Time difference for size 8000: "+ timeElapsed + " nanoseconds");
        System.out.println("Total comparisions for size 8000: "+ comp);
        comp = 0;
    }
}