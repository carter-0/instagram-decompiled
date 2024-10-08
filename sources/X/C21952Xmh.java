package X;

/* renamed from: X.Xmh  reason: case insensitive filesystem */
public abstract class C21952Xmh {
    public static final 2HY A00 = new 2HY(0, 15);
    public static final 2HY A01 = new 2HY(-140, 0);
    public static final 2HY A02 = new 2HY(-140, -43);
    public static final 2HY A03 = new 2HY(-34, 3);
    public static final 2HY A04 = new 2HY(-140, -43);
    public static final 2HY A05 = new 2HY(-20, 30);
    public static final 2HY A06 = new 2HY(1, 108);
    public static final 2HY A07 = new 2HY(0, Integer.MAX_VALUE);
    public static final 2HY A08 = new 2HY(-120, -20);

    public static final Integer A00(Integer num, 2HY r2, int i) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (r2.A01(intValue)) {
            return Integer.valueOf(intValue + i);
        }
        return null;
    }
}
