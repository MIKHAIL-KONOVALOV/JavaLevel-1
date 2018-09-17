/**
 * Java Level 1. Lesson 2. Homework.
 * @author Mihail Konovalov
 * @version 17.09.2018
*/
public class HomeWork2 {
    public static void main(String[] args) {
        initrevarr();
        createArr();
        doubleArr();
        squareMass();
    }

    //     * 1. Init and reverse massive [0, 0, 0, 1, 1, 1, 0, 0, 0,].
    static void initrevarr() {
        int[] arr = new int[] {0, 0, 0, 1, 1, 1, 0, 0, 0,};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
		System.out.println();
        for (int i : arr) 
			System.out.print(i + " ");
		System.out.println();
		System.out.println();        
    }

    // 2. Init mass dim. 8 and fill 3,6,9...21
    static void createArr() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
		System.out.println();
		System.out.println();
	}

   // 3. Double number less 6
    static void doubleArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
		System.out.println();
		System.out.println();
    }

    // 4. Square massive diag only 1.
    static void squareMass() {
        int ln = 15; // length of array

        int[][] arr = new int[ln][ln];
        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < ln; j++) {
                if ((i == j) || (i == ln - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < ln; i++) {
            for (int j = 0; j < ln; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}