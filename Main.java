public class Main {
    public static void main(String[] args) {
        String nameParticipant = "";
        String nameObstacle;
        System.out.println("\n \"Бег с препятствиями\"...");
        Object[] participants = new Object[9];
        participants[0] = new Cat("Мурзик", 2.1, 400);
        participants[1] = new Cat("Барсик", 2.2, 4000);
        participants[2] = new Cat("Мурка", 3.1, 15000);
        participants[3] = new Person("Иван", 2.1, 3000);
        participants[4] = new Person("Митяй", 2.2, 5000);
        participants[5] = new Person("Петр", 2.5, 10000);
        participants[6] = new Robot("R2", 1.8, 15000);
        participants[7] = new Robot("C3", 1.3, 5000);
        participants[8] = new Robot("K2", 2.5, 10000);

        Object[] obstacles = new Object[6];
        obstacles[0] = new Track("забег по прямой ", 500);
        obstacles[1] = new Wall("Малая стенка", 1.2);
        obstacles[2] = new Track("дорога - асфальт ", 3000);
        obstacles[3] = new Wall("Средняя стенка", 1.8);
        obstacles[4] = new Track("булыжник ", 1000);
        obstacles[5] = new Wall("Высокая стенка", 2.3);

        System.out.println("Тренировочный забег смешанного типа: Коты, Люди, Роботы");

        for (Object participant : participants) {
            int vMaxRun = 0;
            double vMaxHeight = 0;

            System.out.print("На полосу препятствий выходит ");
            if (participant instanceof Cat) {
                nameParticipant = ((Cat) participant).getName();
                vMaxRun = ((Cat) participant).getMaxRun();
                vMaxHeight = ((Cat) participant).getMaxHeight();
            }
            if (participant instanceof Person) {
                nameParticipant = ((Person) participant).getName();
                vMaxRun = ((Person) participant).getMaxRun();
                vMaxHeight = ((Person) participant).getMaxHeight();
            }
            if (participant instanceof Robot) {
                nameParticipant = ((Robot) participant).getName();
                vMaxRun = ((Robot) participant).getMaxRun();
                vMaxHeight = ((Robot) participant).getMaxHeight();
            }

            System.out.println(nameParticipant + " : бег " + vMaxRun + " прыжок " + vMaxHeight);
            boolean failure = false;
            System.out.print("СТАРТ!   ");
            for (int y = 0; y < obstacles.length; y++) {
                int tRun = 0;
                double tHeight = 0;
                if (obstacles[y] instanceof Track) {
                    nameObstacle = ((Track) (obstacles[y])).getName();
                    tRun = ((Track) (obstacles[y])).getDistance();
                    if (tRun > vMaxRun) {
                        System.out.println(" Участник: " + nameParticipant + " сошел с дистанции на препятствии №" +
                                (y + 1) + " " + nameObstacle + "(" + tRun + "м.) \n");
                        failure = true;
                        break;
                    }
                }
                if (obstacles[y] instanceof Wall) {
                    nameObstacle = ((Wall) (obstacles[y])).getName();
                    tHeight = ((Wall) (obstacles[y])).getHeight();
                    if (tHeight > vMaxHeight) {
                        System.out.println(" Участник: " + nameParticipant + " сошел с дистанции на препятствии №" +
                                (y + 1) + " " + nameObstacle + "(" + tHeight + "м.) \n");
                        failure = true;
                        break;
                    }

                }
            }
            if (!failure) {
                System.out.println(" Участник: " + nameParticipant + " успешно выдержал все испытания!!!\n\n");
            }

        }
    }
}
