package X;

/* renamed from: X.Ntr  reason: case insensitive filesystem */
public abstract class C69889Ntr {
    public static final void A00(1a8 r5, C70713OHi oHi, C74443Puy puy, Integer num) {
        String str;
        int A02 = DbW.A02(1, oHi, r5);
        NUY nuy = oHi.A05;
        nuy.A09();
        if (num == AnonymousClass05K.A00) {
            str = "YES";
        } else {
            str = "NO";
        }
        nuy.A0D("IS_V3_IMPLICIT_BACKUP", str);
        nuy.A0D("CALLSITE", C69892Ntu.A00(num));
        PU8.A00(1aU.A06(new C72169Oxe(r5, oHi, 1)), r5, puy, A02);
    }
}
