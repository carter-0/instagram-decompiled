package X;

public abstract class VA5 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ALL";
            case 1:
                return "CAROUSEL_V2";
            case 2:
                return "IMAGE";
            case 3:
                return "SHOPPING";
            default:
                return "VIDEO";
        }
    }
}
