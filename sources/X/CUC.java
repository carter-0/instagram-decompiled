package X;

public abstract class CUC {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FROM_NUMBER_WITH_IDD";
            case 2:
                return "FROM_NUMBER_WITHOUT_PLUS_SIGN";
            case 3:
                return "FROM_DEFAULT_COUNTRY";
            default:
                return "FROM_NUMBER_WITH_PLUS_SIGN";
        }
    }
}
