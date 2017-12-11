public class EvenOddAlignment {
    public static void main(String[] args) {
        int[] x={1,2,2,8,6,6,7,8,3,3,4,4,5,2};

        int ne=0,no=x.length-1;
        while(ne<no){
            if(x[ne]%2==0){
                ne++;
            }
            else{
                int t=x[ne];
                x[ne]=x[no];
                x[no--]=t;
                //no--;
            }
        }

        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}
