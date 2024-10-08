package X;

public abstract class VHW {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "BUSINESS_MANAGER";
            case 2:
                return "SHARED_WITH_BUSINESS";
            default:
                return "FACEBOOK_PAGE";
        }
    }
}
