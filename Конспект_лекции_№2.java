Introduction to OOP
OOP - object-oriented programming
Любой объект можно разложить на набор характеристик/свойств и набор действий, которые он может совершать
public class Main {
    public static void main(String[] s) { // крафтим челикса
        String name = "Шустрый";
        int health = 625; // здоровье
        int mana = 820; // авторитет
        int age = 28; // возраст
        long longitude = 2123123;
        long latitude = 1231231;

        say();
        if( runToWest(health, age, longitude) == 30_375399) { // в Купчино
            mana++;
        }
    }

    public static void say() {
        System.out.println("Самые быстрые ноги на районе");
    }

    public static long runToWest(int health, int age, long longitude) {
        int speed = health * age;
        return longitude - speed;
    }
}
// Два челикса !
public class Main {
    public static void main(String[] s) {
        String name = "Шустрый";
        int health = 625;
        int mana = 820;
        int age = 21;
        long longitude = 123123;
        long latitude = 123123;

        String name2 = "Тормоз"; 
        int health2 = 400;
        int mana2 = 747;
        long longitude2 = 123123;
        long latitude2 = 123123;

        say();
        if( runToWest(age, health, longitude) == runToWest(age2, health2, longitude2)) { // встретились
            say2();
        }
    }
    public static void say() {
        System.out.println("Самые быстрые ноги на районе");
    }
    public static void say2() {
        System.out.println("Семки есть?");
    }
    public static long runToWest(int health, int age, long longitude) {
        int speed = health * age;
        return longitude - speed;
    }
}
Первые два метода - через функции. Их долго писать. Проще создать класс, чтобы компактно им пользоваться
class Guy { // class - файл для класса
	
	String name; // Поле - значения по умолчанию
	int health;
	int mana;
	int age;
	long longitude;
	long lattitude;
}
В один файл можно пихать несколько классов (но стоит ли...) Дефолт правило: 1 файл - 1 класс
class Guy {
	String message = "Самые быстрые ноги на районе";
	public void sayPhrase() {
		System.out.println(message);
	}
	public long runToWest() {
		speed = health * age;
		return longitude - speed;
	}
}
public static viud main(String args[]) {
	// Экземпляр класса
	Guy guy = new Guy();
	guy.health = 1;
	int guyMana = guy.mana;
	guy.sayPhrase ();
	if (guy.runToWest() > 0) {
		System.out.println("Здарова парни");
	}
}
new - оператор, который просит выделить память под объект
Guy guy = new Guy(); // объект типа Guy()
public Guy(String newName) {
	newName = "Жидкий";
}
Описание классов в UML
UML - язык графического описания для объектного моделирования в области разработки ПО
Большинство IDE могут рисовать UML относительно написанного кода
Пакет - набор классов
package ru.ifmo.se.prog.examples;
Существует пакет "по умолчанию" :/

Принципы ООП
Обязательные:
1) Наследование
	> Выделяем одинаковые свойства и действия
	> Делаем класс, в котором их описываем - создаем дочерний класс от родительских(Обобщение)
Можно создать массив челиксов и для всех них что-то применять (фабрика человеков!!)
Тип ссылки и тип объекта могут быть разными, но тип объекта может быть дочерним к типу ссылки
Модификаторы доступа: public, protected, default, private -> Применимы для: классы, методы, поля, конструкторы
На второй или третьей лабе могут спросить "Зачем нужно крафтить приватный конструктор?"
Несколько классов в файле - как называть файл:
package ru.ifmo.se.prog.examples;
public class Boy { // Файл будет называться Boy.java - по модификатору доступа главного (первого/верхнего) класса
	// klass
}
class Girl {
	// klass
}