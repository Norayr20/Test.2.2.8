public class Weekend {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Is Saturday a weekend day? " + Weekend.isWeekend("Saturday"));
        System.out.println("Is Monday a weekend day? " + Weekend.isWeekend("Monday"));

        System.out.println("Number of weekend days: " + Weekend.weekendCount(days));
        System.out.println("Number of weekday days: " + Weekend.weekdayCount(days));
    }

    public static boolean isWeekend(String dayName) {
        return dayName.equalsIgnoreCase("saturday") || dayName.equalsIgnoreCase("sunday");
    }

    public static int weekendCount(String[] days) {
        int count = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                count++;
            }
        }
        return count;
    }

    public static int weekdayCount(String[] days) {
        int count = 0;
        for (String day : days) {
            if (!isWeekend(day)) {
                count++;
            }
        }
        return count;
    }
}
