package Ujian;
import java.util.Scanner;

public class UjianSoal1 {//ini mah pengen nyoba brance aja sih
	public int inputN(){
		System.out.println("Masukan Nilai N:");
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		scan.close();
		return n;
	}
	public int [][] isiArray(int n){
		int [][]array= new int [2][n];
		for(int i=0;i<2;i++) {
			for(int j=0; j<n;j++) {
				if(i==0) {
					array[i][j]=4*j+1;//1 5 9 13 17
				}else {
					array[i][j]=4*n-3-4*j;//cara 2
					//array[i][j]=array[0][n-1-j];//cara 1
				}
			}
		}
		return array;
		
	}
	public void cetakArray() {
		int n=inputN();
		int [][]array=isiArray(n);
		for(int i=0;i<2;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%3d",array[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		UjianSoal1 run = new UjianSoal1();
		run.cetakArray();
	}

}
