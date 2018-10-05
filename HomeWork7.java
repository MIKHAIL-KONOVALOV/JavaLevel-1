/**
 * Java Level 1. Lesson 7. Homework.
 * @author Mihail Konovalov
 * @version 05.10.2018
*/

class HomeWork7 {
    public static void main(String[] args) {
        final int foodAmount = 25;
		Cat[] cats = {
		new Cat("Barsik", 10),
		new Cat("Myrzik", 20),
		new Cat("Funtik", 30)};
        Plate plate = new Plate(foodAmount);       
		for (Cat cat : cats) {
			System.out.println(cat);
			System.out.println(plate);
			cat.eat(plate);
			System.out.println("\nCat try to eat.......\n");
			System.out.println(cat);
			System.out.println(plate);
			plate.setFood(foodAmount);                                 // Fill plate
			System.out.println("--------------------------------------");
		}
    }
}

class Cat {
    private String name;
    private int appetite;
	private boolean full = false;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    void eat(Plate plate) {
        if (plate.dicreaseFood(appetite))
			full = true;
    }
	
	public String toString() {
        return "Name:" + name + "   Happy_Cat: " + full;
	}	
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean dicreaseFood(int food) {
        if (food <= this.food){
			this.food -= food;
			return true;
		}	
		else {
			this.food = 0;	// Если убрать эту строку то кот не будет есть
			return false;   // если мало еды. А так он все съест но останется
		}					// голодным, что более реально.
    }
	
	void setFood(int food) {
		this.food = food; 
	}

    @Override
    public String toString() {
        return "Food: " + food;
    }

}