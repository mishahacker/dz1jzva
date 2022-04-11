//        1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо
//        бросить исключение MyArraySizeException.
//        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива
//        преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException –
//        с детализацией, в какой именно ячейке лежат неверные данные.
//        3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.

public class Main {

    public static void main(String[] args) {

       package paket1;

        public class students {
            int course;
            String name;
            String str = "СТУДЕНТ1";
            String str1 = "СТУДЕНТ2";

            public students(String str, int x) {
                name=str;
                course=x;
            }
            public void voice() {
                System.out.println(name+" "+ course);
            }


        }




package paket1;

        public class osnovnoi {
            public static void main (String[] X){
                students a = new students("СТУДЕНТ1", 2);
                a.voice();
                students b= new students("СТУДЕНТ2", 4);
                b.voice();
            }

        }
    }

}