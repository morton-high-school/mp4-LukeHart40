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
        return sum/(a.length + 1);
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

    }

    public static boolean[] arrayLocalMax(int[] a){

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

    }

    public static boolean arrayAllEqaul(int[] a){
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

    public static double[] arrayRollingAverage(int[] a, b){

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