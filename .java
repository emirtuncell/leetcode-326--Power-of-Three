class Solution {
    public boolean isPowerOfThree(int n) {
        boolean isTrue=false;
       if(n<=0){//negatif bir sayı 3'ün kuvveti olamaz. False döndürdüm.
        return isTrue;
       }
       if(n==1){//1 her sayının 0.kuvvetidir. True döndürdüm.
        isTrue=true;
        return isTrue;
       }
       
       long i=1;
       while(true){
        
        i*=3; //i*3 n'e eşitse n 3'ün bir kuvvetidir. True döndürdüm ve döngüden çıktım. Ancak i n'den büyük olduğu halde döngüden çıkamamışsam n 3'ün kuvveti değildir. Döngüyü burada bitirip false döndürdüm.
        if(i==n){
            isTrue=true;
            break;
        }
        if(i>n){
            break;
        }

       }

        return isTrue;
    }
}
