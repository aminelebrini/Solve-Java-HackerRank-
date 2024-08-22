import java.util.*;
public class javaarraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> xx = new  ArrayList<ArrayList<Integer>>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> yy = new ArrayList<>();
            for (int j = 0; j<d;j++) {
                int num = sc.nextInt();
                yy.add(num);
            }
            xx.add(yy);
        }

        int a = sc.nextInt();
        for (int i = 0; v < a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x>xx.size() && y>xx.get(x-1).size()) {
                System.out.println("ERROR!");
            }
            else{System.out.println(xx.get(x-1).get(y-1));}
        }
    }
}
