
    import java.util.ArrayList;
import java.util.Scanner;

    public class maxarray {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
//	  int n=scan.nextInt();
//	  int[] ar=new int[n];
            ArrayList<Integer> ar=new ArrayList<>();
            for(int i=0;i<ar.size();i++) {
                ar.add(scan.nextInt());
            }
            //System.out.println(secondLargestNumber(ar));
            maxsubArrayEement(ar);

        }
        static int secondLargestNumber(int[] ar){
            int first=Integer.MIN_VALUE;
            int second=Integer.MIN_VALUE;
            for(int i=0;i<ar.length;i++) {
                if(ar[i]>first) {
                    second=first;
                    first=ar[i];
                }
                else if(ar[i]>second) {
                    second=ar[i];
                }
            }
            return second;
        }
        static void maxsubArrayEement(ArrayList<Integer> ar) {
            for(int i=0;i<=ar.size()-3;i++) {
                int max=Integer.MIN_VALUE;

                for(int j=i;j<i+3;j++) {
                    int l=ar.indexOf(j);
                    if(l>max) {
                        max=l;

                    }
                }
                System.out.print(max+" ");
            }
        }
    }

