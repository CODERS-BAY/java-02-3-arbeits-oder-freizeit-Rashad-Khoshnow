public class zweiPunktDrei {
    public static void main(String[] args) {
        double time = 12.30;

        if (time >= 8 && time < 12 || time > 13 && time <= 16) {
            System.out.println("work time");
        } else if (time >= 12 && time <= 13) {
            System.out.println("break");
        }
    }
}
