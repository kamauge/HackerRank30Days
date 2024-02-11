package day10;

public class ConvertToBinary {

    public static void main(String[] args) {

        int n = 15;
        int count = 0;

        int maxConsecutiveOnes = 0;

        //Convert to Binary
        String binaryRep = Integer.toBinaryString(n);

        System.out.println(binaryRep);
        for (int i =0; i <= binaryRep.length(); i++){
             if (binaryRep.charAt(i) == '1'){
                 count++;
                 maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);
             }
             else {
                 count = 0;
             }

        }
    }
}
