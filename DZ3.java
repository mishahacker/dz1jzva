public class Main {
    public static void main(String[] args) {
        public abstract class Fruit {
            private double weight;

            public Fruit(double weight) {
                this.weight = weight;
            }

            public double getWeight() {
                return weight;
            }
        }
        public final class Apple extends Fruit {
            public Apple() {
                super(1);//яблоко
            }
        }
            public final class Orange extends Fruit {
                public Orange() {
                    super(1.5);
                }
            }
            //создаем ящик для фруктов
        public class Box<T extends Fruit> {
            private List<T> fruitList;

            private double totalWeight;

            public Box() {
                this.fruitList = new ArrayList<>();
            }

            public void addFruit(T fruit) {
                fruitList.add(fruit);

                totalWeight = totalWeight + fruit.getWeight();
            }

            public double getTotalWeight() {
                return totalWeight;
            }
        }
        //метод getWeight()
        public float getWeight(){
            for(int i = 0; i < fruit.size(); i++){
                sum += fruit.get(i).getWeight(); 
            }
            return sum;
        }
    }
}