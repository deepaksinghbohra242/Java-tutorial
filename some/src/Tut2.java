public class Tut2 {
    public static void main(String[] args) {
        // ternary operator
//        int age =10;
//        boolean out ;
//        if(age>10){
//            out = true;
//        }
//        else{
//            out = false;
//        }
//
//        out = age > 10 ? true : false;
        // break
//        for(int i=0;i<3;i++){
//            System.out.print(i);   //012
//        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==3){
                    break;
                }
                System.out.print(i + j);

            }


            for(int j=0;j<5;j++){
                if(i>=3){
                    System.out.println(j + i);
                }else{
                    break;
                }
            }
        }

//        for (int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                if(i==3 || j==4){
//                    break;
//                }
//                System.out.print(i + j);
//            }
//            System.out.println();
//            for (int j=5 ;j>0 ;j++){
//                if(i==3 || j==4){
//                    break;
//                }
//                System.out.print(i + j);
//            }
//        }


    }
}
