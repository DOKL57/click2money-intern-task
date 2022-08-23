public class task1 {
    /*
    Рекурсивное решение.
    Временные затраты (time complexity): O(2^n)
    Затраты по памяти (space complexity): O(n)
     */
    public int recursiveFib(int n) {
        if(n==0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return recursiveFib(n-1) + recursiveFib(n-2);
    }

    /*
    Итеративное решение
    Временные затраты (time complexity): O(n)
    Затраты по памяти (space complexity): O(1)
     */
    public static int iterativeFib(int n) {
        if (n < 2){
            return n;
        }

        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
