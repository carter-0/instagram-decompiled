package X;

/* renamed from: X.Di0  reason: case insensitive filesystem */
public final class C46620Di0 {
    public final C361078fd A00;
    public final C3034468v A01;
    public final C277014uI A02;
    public final String A03;

    public static C46620Di0 A00(C3034368u r5) {
        C277014uI r4;
        C276544tV r2 = r5.A02;
        if (r2 == null || r2.A04 != 13343) {
            r4 = null;
        } else {
            r4 = r2.A09();
        }
        return new C46620Di0(r5.A00, r5.A01, r4, r5.A03);
    }

    public C46620Di0(C361078fd r1, C3034468v r2, C277014uI r3, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
    }
}
