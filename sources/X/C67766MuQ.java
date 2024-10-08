package X;

/* renamed from: X.MuQ  reason: case insensitive filesystem */
public final class C67766MuQ extends AnonymousClass3AQ {
    public final /* synthetic */ POV A00;

    public C67766MuQ(POV pov) {
        this.A00 = pov;
    }

    public final boolean A0H(C249703kE r4) {
        C74438Put put;
        C68295N9i n9i = this.A00.A02;
        C74438Put put2 = null;
        if (n9i != null) {
            put = n9i.A05;
        } else {
            put = null;
        }
        if (!(put instanceof N50)) {
            if (n9i != null) {
                put2 = n9i.A05;
            }
            if (put2 instanceof N4z) {
                return false;
            }
            return true;
        }
        return false;
    }
}
