

	class Cstudent{
		private int height = 150;
		private int weight = 40;
		private void setWeight(int w) {
			if (w>= 40 && w<=150) weight = w;
		}
		private void setHeight(int h) {
			if(h>=50 && h<= 250) height = h;
		}
		public Cstudent() {}
		public Cstudent(int w) {
			setWeight(w);
		}
		public Cstudent(int h, int w) {
			setHeight(h);
			setWeight(w);
		}
		public void getshow() {
			System.out.println("  身高是:  " + height);
			System.out.println("  體重是:  " + weight + "\n");
		}
	}
	public class yoyo28 {
	public static void main(String[] args) {
		Cstudent Peter = new Cstudent();
		System.out.println("Peter 的資料--> 使用Cstudent()建構式");
		Peter.getshow();
		Cstudent David = new Cstudent(300);
		System.out.println("David 的資料--> 使用Cstudent(300)建構式");
		David.getshow();
		Cstudent Mary = new Cstudent(180, 78);
		System.out.println("Mary的資料--> 使用Cstudent(180, 78)建構式");
	    Mary.getshow();
	}
}
