package ru.geekbrains.Java Corels1;

/*
2. Добавить класс Team, который будет содержать название команды,массив из четырех участников (в конструкторе можно сразу указыватьвсех участников )
*/
public class Team {
    private String name;// название команды
    private Participant participants[] ;    // участники

    public Team(String name) {
        this.name = name;
    }

    public Team(String name,Participant ... participantsGiven ) {
        this.name = name;
        this.participants = participantsGiven;
    }
  //метод вывода информации обо всех членах команды.
    public void getTeamInfo() {
        System.out.println("Команда: " + this.name );
        for (Participant participant : participants) {
            if (participant instanceof Dog) {
                System.out.println("Собака " + participant.getName());
            }
            if (participant instanceof Cat) {
                System.out.println("Кот " + participant.getName());
            }
            if (participant instanceof Robot) {
                System.out.println("Робот " + participant.getName());
            }
        }
    }
//
    public void showResults(){
        for (Participant participant : participants) {
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
    public void doIt(Obstacle obstacle){
        for (Participant participant : participants) {
            obstacle.doIt(participant);
        }
    }



}