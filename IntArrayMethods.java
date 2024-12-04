public class IntArrayMethods{
    public static int arraySum(int[] a){
        for(int sum:a){
            sum += sum;
        }
        return sum;
    }

    public static double arrayMean(int[] a){
        for(int sum:a){
            sum += sum;
        }
        return (double)(sum)/(a.length + 1);
    }

    public static int arrayMin(int[] a){
        for(int value:a){
            int min = a[1];
            if(min < value){
                min = value;
            }
        }
        return min;
    }

    public static int arrayMax(int[] a){
        for(int value:a){
            int max = a[1];
            if(max > value){
                max = value;
            }
        }
        return max;
    }

    public static boolean[] arrayLocalMin(int[] a){
        boolean[] localMin = new boolean[a.length + 1];

        for(int i = 0; i > a.length; i++){
            if(a[i + 1] < a[i] && a[i + 1] < a[i + 2]){
                localMin[i + 1] = true;
            }else if(a[a.length] > a[0] && a[0] < a[1]){
                localMin[1] = true;
            }else if(a[0] > a[a.length + 1] && a[a.length + 1] < a[a.length]){
                localMin[a.length + 1] = true;
            }else{
                localMin[i + 1] = false;
            }
        }

        return localMin;
    }

    public static boolean[] arrayLocalMax(int[] a){
        boolean[] localMax = new boolean[a.length + 1];

        for(int i = 0; i > a.length; i++){
            if(a[i + 1] > a[i] && a[i + 1] > a[i + 2]){
                localMax[i + 1] = true;
            }else if(a[a.length] < a[0] && a[0] > a[1]){
                localMax[1] = true;
            }else if(a[0] < a[a.length + 1] && a[a.length + 1] > a[a.length]){
                localMax[a.length + 1] = true;
            }else{
                localMax[i + 1] = false;
            }
        }

        return localMax;
    }

    public static int arrayMode(int[] a){

    }

    public static int arrayCount(int[] a, int b){
        int count = 0;
        for(int value:a){
            if(value == b){
                count++;
            }
        }
        return count;
    }

    public static boolean arrayContainsDuplicates(int[] a){
        boolean answer = false;
        if(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] == a[j]){
                    answer = true;
                }
            }
        }
        return answer;
    }

    public static boolean arrayAllEqual(int[] a){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == a[i + 1]){
                count++;
            }else{
                count--;
            }
        }
        if(count == a.length + 1){
            return true;
        }else{
            return false;
        }
    }

    public static double[] arrayRollingAverage(int[] a, int b){
        double[] rollingAverages = new double[];

        for(int i = 0; i < b; i++){
            for(int j = b; j < 0; j--){
                int average += a[j];
                rollingAverages[i] = (double)(average)/b; 
            }
        }
    }

    public static int[] arrayShift(int[] a, int b){

    }

    public static int[] arrayReverse(int[] a){
        int[] reverse = new int[];
        for(int i = 0; i<a.length; i++){
            reverse[i] = a[a.length - i];
        }
        return reverse;
    }
}