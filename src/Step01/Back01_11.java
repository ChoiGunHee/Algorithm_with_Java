/**
* 2021. 01. 13
* Creater : Gunhee Choi
* Problem Number : 	2588
* Title : 곱셈
* Problem :
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
            472           (1)
		X   385           (2)
		-------
		   2360           (3)
		  3776            (4)
		 1416             (5)
	    -------
		 181720           (6)
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
* Input :첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
	472
	385
* Output :
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
	2360
	3776
	1416
	181720
**/

package Step01;
import java.util.*;

public class Back01_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        
        int temp_1, temp_10, temp_100, temp;
        temp = A * B;
        
        System.out.println(A*(B%10));
        B = (B-B%10)/10;
        
        System.out.println(A*(B%10));
        B = (B-B%10)/10;
        
        System.out.println(A*(B%10));
        
        System.out.println(temp);
    }
}
