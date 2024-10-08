package X;

/* renamed from: X.Gp5  reason: case insensitive filesystem */
public final class C53473Gp5 extends AnonymousClass0T0 implements C299575vQ {
    public final AnonymousClass9IC A00;
    public final C299505vJ A01;
    public final boolean A02;
    public final String A03;

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53473Gp5) {
                C53473Gp5 gp5 = (C53473Gp5) obj;
                if (!0qQ.A0K(this.A01, gp5.A01) || !0qQ.A0K(this.A00, gp5.A00) || this.A02 != gp5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return this.A03;
    }

    public final C299505vJ Be5() {
        return this.A01;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)));
    }

    public C53473Gp5(AnonymousClass9IC r3, C299505vJ r4, boolean z) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = z;
        this.A03 = C299615vU.A01(this, "hushcontrol", r4.A03);
    }
}
