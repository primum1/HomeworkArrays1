public class Main {
    public static void main(String[] args) {//Задание 1,2
        int [] weight1 = new int[] {1,2,3};
        for (int i = 0; i < weight1.length; i++) {
            if (i > 0) {System.out.print(",");
            }
            System.out.print(weight1[i]);
        }
        System.out.println();
        float [] weight2 = new float[] {1.57F, 7.654F, 9.986F};
        for (int i = 0; i < weight2.length; i++) {
            if (i > 0) {System.out.print(", ");
            }
            System.out.print(weight2[i]);
        }
        System.out.println();
        String [] weight3;
        weight3 = new String[]{"a", "b" ,"c" ,"d","e","k","l","m","n"};
        for (int i = 0; i < weight3.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(weight3[i]);
        } //Задание 3
        System.out.println();
        for (int i = weight1.length-1; i >= 0; i--) {
            System.out.print(weight1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = weight2.length-1; i >= 0; i--) {
            System.out.print(weight2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = weight3.length-1; i >= 0; i--) {
            System.out.print(weight3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задание 4
        for (int i = 0; i < weight1.length; i++) {
            if (weight1[i] % 2 != 0) {
                weight1[i]++;
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(weight1[i]);
        }
    }
}