public class IntArrayMethods{
    public static int arraySum(int[] a){
        int sum = 0;
        for(int value:a){
            sum += value;
        }
        return sum;
    }

    public static double arrayMean(int[] a){
        double sum = 0;
        int count = 0;
        for(int value:a){
            sum += (double)(value);
            count++;
        }
        return (sum)/(count);
    }

    public static int arrayMin(int[] a){
        int min = a[0];
        for(int value:a){
            if(min > value){
                min = value;
            }
        }
        return min;
    }

    public static int arrayMax(int[] a){
        int max = a[0];
        for(int value:a){
            if(max < value){
                max = value;
            }
        }
        return max;
    }

    public static boolean[] arrayLocalMin(int[] a){
        boolean[] localMin = new boolean[a.length + 1];

        if(a[a.length - 1] > a[0] && a[0] < a[1]){
            localMin[0] = true;
        }else{
            localMin[0] = false;
        }

        if(a[0] > a[a.length - 1] && a[a.length - 1] < a[a.length - 2]){
            localMin[a.length - 1] = true;
        }else{
            localMin[a.length - 1] = false;
        }

        for(int i = 1; i < a.length - 2; i++){
            if(a[i - 1] > a[i] && a[i] < a[i + 1]){
                localMin[i] = true;
            }else{
                localMin[i] = false;
            }
        }

        return localMin;
    }

    public static boolean[] arrayLocalMax(int[] a){
        boolean[] localMax = new boolean[a.length + 1];

        if(a[a.length - 1] < a[0] && a[0] > a[1]){
            localMax[0] = true;
        }else{
            localMax[0] = false;
        }

        if(a[0] < a[a.length - 1] && a[a.length - 1] > a[a.length - 2]){
            localMax[a.length - 1] = true;
        }else{
            localMax[a.length - 1] = false;
        }

        for(int i = 1; i < a.length - 2; i++){
            if(a[i - 1] < a[i] && a[i] > a[i + 1]){
                localMax[i] = true;
            }else{
                localMax[i] = false;
            }
        }

        return localMax;
    }

    public static int arrayMode(int[] a){
        if(a.length == 1){
            return a[0];
        }

        int maxValue = 0;
        int maxCount = 0;

        for(int i = 0; i < a.length - 1; i++){
            int count = 0;
            for(int j = 1; j < a.length; j++){
                if(a[i] == a[j]){
                    count++;
                }
                if(count > maxCount){
                    maxCount = count;
                    maxValue = a[i];
                }
            }
        }
        return maxValue;
        
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

        for(int i = 0; i <= a.length - 1; i++){
            for(int j = 0; j <= a.length - 1; j++){
                if(a[i] == a[j]){
                    answer = true;
                }
            }
        }
        if(a.length == 1){
            answer = false;
        }

        return answer;
    }

    public static boolean arrayAllEqual(int[] a){
        int count = 0;
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] == a[i + 1]){
                count++;
            }else{
                count--;
            }
        }
        if(count == a.length - 1){
            return true;
        }else{
            return false;
        }
    }

    public static double[] arrayRollingAverage(int[] a, int b){
        double[] rollingAverages = new double[a.length + 1];

        for(int i = 0; i < a.length; i++){
            int total = 0;
            for(int j = b; j < 0; j--){
                total = a[i - j];
                if(total < 0){
                    total = a[i];
                }
            }
        }
        return rollingAverages;
    }

    public static int[] arrayShift(int[] a, int b){
        int[] shift = new int[a.length];
        if(b >= a.length - 1){
            return a;
        }

        for(int i = 0; i < a.length; i++){
            int position = (i + b) % a.length;
            shift[position] = a[i];
        }
        return shift;
    }

    public static int[] arrayReverse(int[] a){
        int[] reverse = new int[a.length + 1];

        for(int i = 0; i < a.length; i++){
            reverse[i] = a[(a.length - 1) - i];
        }
        return reverse;
    }
}