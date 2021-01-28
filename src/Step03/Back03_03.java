/**
* 2021. 01. 28
* Creater : Gunhee Choi
* Problem Number : 8393
* Title : 합
* Problem :
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
* Input : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
	3
	
* Output : 1부터 n까지 합을 출력한다.
	6
**/

package Step03;
import java.util.*;

public class Back03_03 {
    public static void main(String[] args) {
        int sum = 0;
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        for(int i=1; i<=N; i++) sum += i;
        
        System.out.print(sum);
    }
}
