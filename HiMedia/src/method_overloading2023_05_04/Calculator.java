package method_overloading2023_05_04;

public class Calculator {
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
