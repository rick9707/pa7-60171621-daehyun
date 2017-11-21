//60171621 김대현
package package3;

public class Circle extends Shape {//shape를 상속받은 circle클래스이다.
//아래의 메소드들은 원의 길이와 넓이를 구하는 메소드이다.
	public Circle(double X, double Y, double radius) {

	}

	@Override
	public void draw() {

	}

	public double getArea() {
		area = radius * radius * Math.PI;
		return area;
	}

	public double getLength() {
		length = radius * 2 * Math.PI;
		return length;
	}
}
