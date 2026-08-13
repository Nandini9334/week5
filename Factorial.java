public class Factorial{
public static long compute(int n){
   if (n < 0) {
            throw new IllegalArgumentException(
                "Factorial not defined for negative numbers" );
  }
long result=1;
for(int i=2;i<=n; i++){
result*=i;
}
return result;
}
}