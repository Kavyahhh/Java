/* n = 4
1 2 3 4
1 2 3
1 2 
1 
*/

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
