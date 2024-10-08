package X;

/* renamed from: X.MbV  reason: case insensitive filesystem */
public abstract class C66724MbV {
    public static final String A00(Integer num) {
        if (num == null) {
            return "unknown";
        }
        int intValue = num.intValue();
        if (intValue == 1000) {
            return "all";
        }
        if (intValue == 0) {
            return "primary";
        }
        if (intValue == 1) {
            return "general";
        }
        if (intValue == 3) {
            return "public";
        }
        if (intValue == 4) {
            return "ad_responses";
        }
        if (intValue == 6) {
            return "ai_bot";
        }
        return "unknown";
    }
}
