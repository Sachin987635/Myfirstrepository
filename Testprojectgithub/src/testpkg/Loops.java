package testpkg;

	public class Loops extends test{
		public void m1(){
			System.out.println("Default");
		}
		public void m2(int a,int b){
			System.out.println("Two Parm");
		}
		public static void main(String[] args) {
			Loops obj=new Loops();
			obj.m3(10, 20);
		}
}