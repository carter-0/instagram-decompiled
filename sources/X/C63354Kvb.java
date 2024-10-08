package X;

/* renamed from: X.Kvb  reason: case insensitive filesystem */
public abstract class C63354Kvb {
    public static final boolean A00(LFH lfh) {
        String str;
        if (lfh.A03 || lfh.A04 || lfh.A00 <= 0 || (str = lfh.A01) == null || str.length() == 0) {
            return false;
        }
        return true;
    }
}
