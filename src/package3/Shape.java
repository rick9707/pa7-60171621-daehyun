//60171621 김대현
package package3;
//circle과 Rectangle의 기초가 되는 shape 클래스이다.
public abstract class Shape implements Drawable {
	double area;
	double length;
	double X;
	double Y;
	double x;
	double y;
	double radius;
	public double getArea() {
		return area;
	}
	public void setArea(double Area) {
		area = Area;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double Length) {
		length = Length;
	}
	


	
}
