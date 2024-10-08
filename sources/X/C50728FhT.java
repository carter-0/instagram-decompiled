package X;

/* renamed from: X.FhT  reason: case insensitive filesystem */
public final class C50728FhT implements AnonymousClass5IX {
    public final 2cX A00;
    public final String A01;
    public final boolean A02;

    public final boolean E1z(AnonymousClass5IY r4) {
        boolean z;
        String A002 = this.A00.A00(this.A01);
        if (A002 != null) {
            z = Boolean.parseBoolean(A002);
        } else {
            z = false;
        }
        if (this.A02 == z) {
            return true;
        }
        return false;
    }

    public C50728FhT(2cX r1, String str, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = str;
    }
}
