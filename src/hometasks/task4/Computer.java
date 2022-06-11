package hometasks.task4;

public class Computer {
    private String about;

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];
        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4] = new Computer();

        for (int i = 0; i < computers.length; i++) {
            computers[i].about = "Computer №" + (i + 1);
        }

        for (Computer temp : computers) {
            System.out.println(temp.about);
        }
    }

}
