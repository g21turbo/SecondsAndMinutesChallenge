public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(265, 32));

        System.out.println(getDurationString(5873));

    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid Value";
        } else {
            int hours = seconds/3600;
            int minutes = hours%60;
            int remainingSeconds = minutes%60 + seconds%60;

            return hours + "h " + minutes + "m " + remainingSeconds + "s";
        }

    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds > 59 || seconds < 0) {
            return "Invalid Values";
        } else {
            int hours = minutes / 60;
            int remainingMinutes = minutes%60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }
    }
}