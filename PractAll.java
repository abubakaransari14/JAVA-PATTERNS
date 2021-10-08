package paracticeAll;

public class PractAll {
/* In this Program we are going to create Some Patterns,
 * Sorry i didn't knew the name of the patterns but i know some names so i mentioned it
 * like Right Angle Triangle , Inverted Right Angle Triangle
 * flip Right Angle Triangle , inverted Right Angle Triangle 
 * Shape like D , Flip Shape like 
 * triangle, inverted triangle
 * diamond and SANDGLASS */	
	
	// METHOD FOR RIGHT ANGLE Triangle
	public static void RightAngleTriangle() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// METHOD FOR iNVERTED RIGHT ANGLE TRIANGLE PATTERN
	public static void InvertedRightAngleTriangle() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// METHOD FOR D SHAPE PATTERN
	public static void Dshape() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// METHOD FOR FLIP D SHAPE PATTERN
	public static void FlipDshape(int i, int j) {	
		for( i=1;i<=5;i++) {
			for(j=i;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		for(i=5-1;i>=1;i--) {
			for(j=i;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// MEETHOD FOR TRIANGLE PATTERN
	public static void Triangle() {
			for(int i=1;i<=5;i++) {
				for(int j=i;j<=5-1;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
			System.out.println();	
			}
	}
	
	// METHOD FOR InvertedTriangle PATTERN
	public static void InvertedTriangle() {
		for(int i=5;i>=1;i--) {
			for(int j=i;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();	
		}
}
	
	// METHOD FOR DIAMOND PATTERN
	public static void Diamond() {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();	
		}
		for(int i=5-1;i>=1;i--) {
			for(int j=i;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();	
		}

}	
	
	public static void main(String[] args) {
		int i,j;
		
		// CREATING AN OBJECT
		PractAll tri = new PractAll();
		
		// Right Angle Triangle PATTERN 
		System.out.println("Right Angle Triangle");
		tri.RightAngleTriangle();
		
		// INVERTED RIGHT ANGLE TRIANGLE PATTERN
		System.out.println("Inverted Right Angle Triangle");
		tri.InvertedRightAngleTriangle();;
		
		// D SHAPE PATTERN
		System.out.println("D SHAPE");
		tri.Dshape();
		
		//Flip Right Angle Triangle PATTERN
		System.out.println("Flip Right Angle Triangle ");
		for(i=1;i<=5;i++) {
			for(j=i;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		// Inverted Flip Right Angle Triangle PATTERN
		System.out.println("Inverted Flip Right Angle Triangle");
		for(i=5;i>=1;i--) {
			for(j=i;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// FLIP D SHAPE PATTERN
		System.out.println("FLIP D SHAPE");
		tri.FlipDshape(1, 1);
		
		// TRIANGLE PATTERN
		System.out.println("TRIANGLE");
		tri.Triangle();
		
		//INVERTED TRIANGLE PATTERN
		System.out.println("INVERTED TRIANGLE");
		tri.InvertedTriangle();
		
		// DIAMOND PATTERN
		System.out.println("DIAMOND");
		tri.Diamond();
		
		// SANDGLASS PATTERN
		System.out.println("SANDGLASS");
		for(i=5;i>=1;i--) {
			for(j=i;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=2;i<=5;i++) {
			for(j=i;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("THANK YOU !, Regards Uzair Ansari"
				+ " remember me in your prayers and Practice as Much As you can");
		
	}
}