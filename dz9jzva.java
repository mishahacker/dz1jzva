
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
