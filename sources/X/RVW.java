package X;

public abstract class RVW {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "UI_VIEW";
            case 2:
                return "NON_UI";
            case 3:
                return "TEMPORARY";
            case 4:
                return "UNCATEGORIZED";
            default:
                return "USER_INTERACTION";
        }
    }
}
