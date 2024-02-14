public class Tut4 {
//    static int a;
//    static Integer b;
    public static void main(String[] args) {

//        System.out.println(a);
//        System.out.println(b);
//        4011        4012        4013        4014
//        00000000    00000000    000000000   00000010    = 2
//        int [][][] a = new int [3][][];
//        a[0] = new int [2][2];
//        a[1] = new int[3][3];
//        a[2] = new int[4][4];
//        int [] a = new int [3];
//        int [] b = {10,20,30,40};
//        System.out.println(b[3]);
//        char [] a = {'a','b'}
//        System.out.println(a[2]);
//        String []  str = {"ans", "fasdf"};
//        int [x][y][z] a =
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int n = a.length;
        int m = a[0].length;
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
//        create a 3d array show it
    }
}
