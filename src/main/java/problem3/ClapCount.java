package problem3;

public class ClapCount {
    public int CountCalp(int number) {
        int count = 0;
//        for (int i = 1; i <= number; ++i) {
//             String stringNumber = Integer.toString(i);
//            // 2번 이상일 경우
//            for (int j = 0; j < stringNumber.length(); ++j){
//                if (stringNumber.charAt(j) == '3' || stringNumber.charAt(j) == '6' || stringNumber.charAt(j) == '9') {
//                    count++;
//                }
//            }
//        }
        //jiyeong's Code + (-48)
        for (int i = 1; i < number + 1; ++i) {
            String strNum = Integer.toString(i);
            for (int j = 0; j < strNum.length(); ++j) {
                int convertIntNum = strNum.charAt(j) - 48;
                if (convertIntNum % 3 == 0 && convertIntNum != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
