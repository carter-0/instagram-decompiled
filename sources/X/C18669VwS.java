package X;

/* renamed from: X.VwS  reason: case insensitive filesystem */
public final class C18669VwS {
    public static final boolean A01(C16510UwB uwB) {
        0qQ.A0B(uwB, 0);
        if (uwB == C16510UwB.AUTO || uwB == C16510UwB.BOX_NONE) {
            return true;
        }
        return false;
    }

    public static final C16510UwB A00(String str) {
        if (str == null) {
            return C16510UwB.AUTO;
        }
        return C16510UwB.valueOf(00p.A0g(DbY.A0k(str), "-", "_", false));
    }
}
