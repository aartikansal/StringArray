public class StringRunner {


    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday"};
        String dayWithMostCharacters = "";
        for (String day : daysOfWeek) {

                if (day.length() > dayWithMostCharacters.length()) {
                    dayWithMostCharacters = day;
                }
            }
            System.out.println(" day with most number of characters " + dayWithMostCharacters);
        }
    }
