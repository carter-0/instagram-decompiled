package X;

/* renamed from: X.7aE  reason: invalid class name and case insensitive filesystem */
public abstract class C333837aE {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "recent";
            case 2:
                return AnonymousClass000.A00(5052);
            case 3:
                return C66579MXk.A00(320);
            case 4:
                return "following";
            case 5:
                return "questions";
            case 6:
                return "undefined";
            default:
                return "popular";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "LATEST_TOP";
            case 2:
                return "META_VERIFIED";
            case 3:
                return "FOLLOWERS";
            case 4:
                return "PEOPLE_YOU_FOLLOW";
            case 5:
                return "QUESTIONS";
            case 6:
                return "NOT_SET";
            default:
                return "RANKED";
        }
    }
}
