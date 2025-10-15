package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] authGrade = AuthGrade.values();
        for (AuthGrade grade : authGrade) {
            printAuthGrade(grade, grade.getLevel(), grade.getDescription());
        }
    }

    private static void printAuthGrade(AuthGrade authGrade, int level, String description) {
        System.out.println("grade = " + authGrade.name() + ", level = " + level + ", 설명 = " + description);
    }
}
