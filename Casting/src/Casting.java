public class Casting {
    public static void main(String[] args) {
        char n = 'z';
        int nI = n;
        System.out.println("chart "+n+" converted to int "+nI);
        int i =250;
        long iL = i;
        System.out.println("int " +i+" converted to long "+iL);
        double d = 301.067;
        System.out.println("double " +d+" converted to long "+(long)d);
        int j = 100;
        float jS = j + (float)5000.66;
        System.out.println("int "+j+" add 5000.66 and converted to float "+jS);
        int k = 737;
        int kM = k * 100;
        byte mR = (byte)kM;
        System.out.println("int "+k+" times 100 and converted to byte "+mR);
        double l = 298.638;
        double lD = l/25;
        long lL = (long)lD;
        System.out.println("double "+l+" divided by 25 and converted to long "+mR);
    }
}
