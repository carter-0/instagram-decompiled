package X;

/* renamed from: X.KsY  reason: case insensitive filesystem */
public abstract class C63165KsY {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "AdjustUpdate";
            case 2:
                return "AdjustStitching";
            case 3:
                return "AdjustCompleted";
            default:
                return "AdjustStarted";
        }
    }
}
