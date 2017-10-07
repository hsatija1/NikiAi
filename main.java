import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


class Main{


public static void res(long n,BigInteger[] t){
  BigInteger MOD =  new BigInteger("1000000007");

BigInteger fn,fnp1,f2n,f2np1;
    if(n == 0){t[0] = BigInteger.ZERO;t[1] = BigInteger.ONE;return;}
    res((n/2),t);
    fn = t[0];
    fnp1 = t[1];
    
    f2n = fnp1.multiply(BigInteger.valueOf(2)).subtract(fn);
    int res = f2n.compareTo(BigInteger.ZERO);
    
    if(res == -1)
        f2n = f2n.add(MOD);
    f2n = fn.multiply(f2n).mod(MOD);
    
    f2np1 = fn.multiply(fn).add(fnp1.multiply(fnp1));
    f2np1 = f2np1.mod(MOD);
    
    if(n%2 == 0){
        t[0] = f2n;
        t[1] = f2np1;
    }
    else{
        t[0] = f2np1;
        t[1] = f2n.add(f2np1);
        
    }
}




public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int z = sc.nextInt();
  while(z != 0){
    z--;
        long n = sc.nextLong();; 
        BigInteger[] zz = {BigInteger.ZERO,BigInteger.ZERO};
        res(n+2,zz);
        System.out.println(zz[0]);
    }
}
}