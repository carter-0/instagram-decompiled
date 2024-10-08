package X;

/* renamed from: X.Hb4  reason: case insensitive filesystem */
public abstract class C55033Hb4 {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass05K.A00(2)) {
            if (1 - num.intValue() != 0) {
                str2 = "GAP_0";
            } else {
                str2 = "NEXT_AD_SLOT_REPLACEMENT";
            }
            if (str2.equalsIgnoreCase(str)) {
                return num;
            }
        }
        return null;
    }
}
