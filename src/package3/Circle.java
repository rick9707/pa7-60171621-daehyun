//60171621 �����
package package3;

public class Circle extends Shape {//shape�� ��ӹ��� circleŬ�����̴�.
//�Ʒ��� �޼ҵ���� ���� ���̿� ���̸� ���ϴ� �޼ҵ��̴�.
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
