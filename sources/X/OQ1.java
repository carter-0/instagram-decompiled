package X;

public abstract class OQ1 {
    public static final C69427NlX A00(Integer num) {
        if (num != null) {
            long intValue = (long) num.intValue();
            for (C69427NlX nlX : C69427NlX.values()) {
                Long valueOf = Long.valueOf(nlX.A00);
                if (valueOf != null && valueOf.longValue() == intValue) {
                    return nlX;
                }
            }
        }
        return null;
    }

    public static final String A01(AnonymousClass2Ep r2) {
        String str;
        String str2;
        if (r2 == null) {
            return null;
        }
        if (r2.CUG()) {
            str = "group";
        } else {
            str = "one_to_one";
        }
        if (r2.CVr()) {
            str2 = ":xac";
        } else {
            str2 = "";
        }
        return 002.A0R(str, str2);
    }
}
