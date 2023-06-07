package nested_class_2023_05_31;

public class A {
	A() {
		System.out.println("A객채가 생성됨");
	}

	class B {
		B() {
			System.out.println("B객체가 생성됨");
		}

		int field1;

		// static int field2;
		void method1() {
		}
		// static void method2() {}
	}

	static class C {
		C() {
			System.out.println("C객체가 생성됨");
		}

		int field1;
		static int field2;

		void method1() {
		}

		static void method2() {
		}
	}
	
	void method() {
		class D {
			D() {
				System.out.println("C객체가 생성됨");
			}
			int field1;
			//static int field2;
			void method1() {}
			//static void method2() {}
 		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
