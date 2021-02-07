/**
* 2021. 02. 05
* Creater : Gunhee Choi
* Problem Number : 2438
* Title : 별 찍기 - 1
* Problem :
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
* Input : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
	5
	
* Output : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
	*
	**
	***
	****
	*****
**/

package Step03;
import java.util.*;

public class Back03_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=0; i<num; i++) {
            for(int j=0; j<=i; j++)
                System.out.printf("*");
            System.out.printf("\n");
        }
        
        sc.close();
    }
}
