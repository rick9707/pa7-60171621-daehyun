//60171621 김대현
package package3;

public class Rectangle extends Shape {//shape를 상속받은 Rectangle클래스이다.
	//아래의 메소드들은 Rectangle의 길이와 넓이를 구하는 메소드이다.

	public Rectangle(double X, double Y, double x, double y) {

	}

	@Override
	public void draw() {
	}
	public double getArea() {
		Area = (X-x)*(Y-y);
		return Area;
	}

	public double getLength() {
		Length = 2*(X-x)*(Y-y);
		return Length;
	}

}
