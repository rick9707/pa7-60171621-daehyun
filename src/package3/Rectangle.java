//60171621 �����
package package3;

public class Rectangle extends Shape {//shape�� ��ӹ��� RectangleŬ�����̴�.
	//�Ʒ��� �޼ҵ���� Rectangle�� ���̿� ���̸� ���ϴ� �޼ҵ��̴�.

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
