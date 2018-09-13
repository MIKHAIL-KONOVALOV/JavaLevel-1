class HomeWork1 {
	public static void main(String[] args) {
	
	// Вызовы методов
		System.out.println(calc(2,3,2,4));
		System.out.println(range(13,8));
		posneg(0);
		System.out.println(negat(-3));
		hello("Михаил");
		year(2018);
	}	
	
	// 1.Создание и инициализация переменных
	static void creatvar() {
		byte a = 10;
		short b = 20000;
		int c = 1000000;
		long d = -34567891;
		float fl = -200.0f;
		double db = 400.678;
		boolean bool = true;
		char ch = '$';
	}
	
	// 2. Вычисление выражения a*(b+(c/d)) и возврат значения
	static float calc(int a, int b, int c, int d) {
		return a * (b + (c / d));
	}
	
	// 3. Проверка нахождения внутри диапозона суммы двух чисел
	static boolean range(int a, int b) {
		if ( ((a + b) >= 10 ) && ((a + b) <= 20))
			return true;
		else
			return false;
	}
	
	// 4. Определяет положительное или отрицательное число и выводит в консоль 
	static void posneg(int a) {
		System.out.println((a >= 0)? "Positive" : "Negative");
	}
	
	// 5. Возвращает true если число отрицательное
	static boolean negat(int a) {
		if (a >= 0) 
			return false;
		else
			return true;
	}
	
	// 6. Выдает приветствие
	static void hello(String name) {
		System.out.println("Привет " + name + "!");
	}
	// 7. Определяет високосный год или нет
	static void year(int a) {
		if ( (a % 400) == 0)
			System.out.println(a + " Год високосный");
		else if ( ((a % 4) == 0) && ((a % 100) != 0) ) // Когда уже написал увидел что первые два условия можно совместить
			System.out.println(a + " Год високосный"); // Но мне кажется что так проще вникнуть в условия при чтении кода
		else
			System.out.println(a + " Год не високосный");
	}
}