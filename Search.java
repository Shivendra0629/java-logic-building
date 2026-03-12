import java.util.Scanner; 
public class Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search:");
        int a = sc.nextInt();
        boolean found = false;
        int[][] arr = {
                { 100, 20, 30 }, { 40, 10, 50 }
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == a) 
                {
                    System.out.println(" Element found at index:" + i + "," + j);
                    found =true;
                }
            }
        
        } 
        if (found!=true)
            {
                 System.out.print("Element not found");
            }
            
        sc.close();
    }
}