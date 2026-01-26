package complexityexamples;



public class Methods {
    
    public int sum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result = result + i;
        }
        return result;
    }
    
    public int findMin(int a, int b) {
        if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }
    
    public void method1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i * 10 + j + " ");
            }
            System.out.println();
        }
    }
    
    public void method2(int n) {
        int i = n;
        while (i >= 1) {
            System.out.println(i);
            i = i / 2;
        }
    }
    
    public int method3(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result = result + i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i * 10 + j + " ");
            }
            System.out.println();
        }
        return result;
    }
    
    public int method4(int n) {
        for (int i = n; i >= 1; i = i / 2) {
            System.out.println(i);
        }
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result = result + i;
        }
        return result;
    }
    
    public int method5(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result = result + i;
        }
        return result;
    }
    
    public int method6(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j = j / 2) {
                System.out.println(j);
                result = result + j;
            }
            System.out.println(i);
        }
        return result;
    }
    
    public int method7(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    System.out.println(k);
                    result = result + k;
                }
            }
            
        }
        return result;
    }

    public int method8(int n){
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j);
                result = result + j;
            }
        }
        return result;
    }

    public static int fib(int n){
        int result;
        if (n<=1){
            result = n;
        }
        else {
            result = fib(n-1) + fib(n-2);
        }
        return result;
    }

}
