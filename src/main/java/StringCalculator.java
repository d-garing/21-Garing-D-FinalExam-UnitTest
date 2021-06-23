public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {

            if (Integer.parseInt(number.trim()) < 0)
            {
                throw new IndexOutOfBoundsException("negatives not allowed.");
            }

            if (!number.trim().isEmpty()) {
                if (Integer.parseInt(number.trim()) > 1000)
                {
                    //skip
                }
                else
                {
                    returnValue += Integer.parseInt(number.trim());
                }
            }
        }
        return returnValue;
    }
}
