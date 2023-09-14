public class Task7 {
	public static void main(String[] args){
		double x = 1;
		double y = 4;
		if ((((x*x+(y-2)*(y-2)>=4)&(x>=0))|(x*x+(y+2)*(y+2)<=4))&(x*x+y*y<=16)) {
			System.out.println("yep");
		} else {
			System.out.println("nope");
		}
	}
}
		