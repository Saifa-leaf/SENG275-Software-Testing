public class AddMyAlphas {

    public int add (String numbers) {
        String negative = "";
        int answer = 0;
        String delim = "[,\n]";

        if (numbers.startsWith("//")) {
            delim = numbers.substring(2,3);
            numbers = numbers.substring(4);
        }
        if (numbers.equals("")) {
            return 0;
        }
        String[] arrNum = numbers.split(delim);
        for (int i = 0; i < arrNum.length; i++) {
            int num = Integer.valueOf(arrNum[i]);
            answer += num;
            if (num > 1000) {
                answer -= num;
            }
            else if (num < 0) {
                negative += arrNum[i] + ",";
            }
        }
        if (!negative.equals("")) {
            negative = negative.substring(0,negative.length() - 1);
            negative = "Negatives not allowed: " + negative;
            throw new IllegalArgumentException(negative);
        }
        return answer;
    }
}
