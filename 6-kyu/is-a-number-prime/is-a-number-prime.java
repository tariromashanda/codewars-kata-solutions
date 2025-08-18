public class Prime {
  public static boolean isPrime(int num) {
    
      if (num <= 1){
            return false;
        }
​
        if (num == 2 || num == 3){
            return true;
        }
​
        if(num % 2 == 0 || num % 3 == 0 ){
            return false;
        }
​
        int stop = (int)Math.sqrt(num);
​
        for(int i = 5; i <= stop; i += 6){
            if (num % i == 0 || num % (i + 2) == 0){
​
                return false;
            }
        }
​
        return true;
    }
  }