package ezen.array;

/**
 * 다차원 배열 선언, 생성, 사용하기
 * @author 김기정
 */
public class ArrayExample5 {

	public static void main(String[] args) {
//		int[][]  array;
//		array = new int[2][5];
//		array[0][0] = 88;
//		array[0][1] = 98;
//		array[0][2] = 75;
//		array[0][3] = 100;
//		array[0][4] = 100;
//		array[1][0] = 50;
//		array[1][4] = 100;
//		int[][] array = 
//				new int[][] {
//			                 {88, 98, 75, 100, 100}, 
//			                 {50, 60, 70, 80, 90}
//			                };
	    int[][] array = {
	    	             {88, 98, 75, 100, 100}, 
	    	             {50, 60, 70, 80, 90}
	    	            };
	    
	    for (int i = 0; i < array.length; i++) {
	    	System.out.println((i+1)+"반 성적");
	    	for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
	    	System.out.println();
		}
	    
	    /*
	    int sum1 = 0;
	    System.out.println("1반 전체 학생수 : "  + array[0].length );
	    for (int i = 0; i < array[0].length; i++) {
	    	sum1 += array[0][i];	    				
		}
	    System.out.println("총점 : " + sum1);
	    System.out.println("평균 : " + sum1/array[0].length);
	    */
	    
	    int sum1 = 0, sum2 = 0;
	    for (int i = 0; i < array.length; i++) {
	    	for (int j = 0; j < array[i].length; j++) {
				if(i == 0) {
					sum1 += array[i][j];
				}else if(i == 1) {
					sum2 += array[i][j];
				}
			}
		}
	    double avg1 = (double)sum1/array[0].length;
	    double avg2 = (double)sum2/array[1].length;
	    double totalAvg = (double)(sum1+sum2)/(array[0].length + array[0].length);
	    
	    System.out.println("1반 총점: " + sum1 + ", 평균: " + avg1);
	    System.out.println("2반 총점: " + sum2 + ", 평균: " + avg2);
	    System.out.println("전체 총점: " + (sum1+sum2) + ", 평균: " + totalAvg);
	    
	    // 1반 총점: ???점, 평균: ???점
	    // 2반 총점: ???점, 평균: ???점
	}
}
















