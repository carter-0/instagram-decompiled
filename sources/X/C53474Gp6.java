package X;

/* renamed from: X.Gp6  reason: case insensitive filesystem */
public final class C53474Gp6 extends AnonymousClass0T0 implements C299575vQ {
    public final C299505vJ A00;
    public final String A01;
    public final boolean A02;
    public final AnonymousClass9IC A03;

    public C53474Gp6(AnonymousClass9IC r2, C299505vJ r3, String str, boolean z) {
        0qQ.A0B(r2, 2);
        this.A00 = r3;
        this.A03 = r2;
        this.A01 = str;
        this.A02 = z;
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53474Gp6) {
                C53474Gp6 gp6 = (C53474Gp6) obj;
                if (!0qQ.A0K(this.A00, gp6.A00) || !0qQ.A0K(this.A03, gp6.A03) || !0qQ.A0K(this.A01, gp6.A01) || this.A02 != gp6.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return C299615vU.A01(this, "replyToContext", this.A00.A03);
    }

    public final C299505vJ Be5() {
        return this.A00;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A00))));
    }
}
