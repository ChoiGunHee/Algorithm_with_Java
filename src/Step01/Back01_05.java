/**
* 2021. 01. 06
* Creater : Gunhee Choi
* Problem Number : 1000
* Title : A+B
* Problem :
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
* Input : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
	1 2
	
* Output : 3
**/

package Step01;
import java.util.*;

public class Back01_05 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
    }
}
