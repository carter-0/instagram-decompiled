package X;

/* renamed from: X.5kM  reason: invalid class name and case insensitive filesystem */
public abstract class C293215kM {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "UNSET";
            case 1:
                return "DRAFT";
            case 2:
                return "UPDATING";
            default:
                return "UPLOADED";
        }
    }
}
