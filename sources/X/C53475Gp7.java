package X;

/* renamed from: X.Gp7  reason: case insensitive filesystem */
public final class C53475Gp7 extends AnonymousClass0T0 implements C299575vQ {
    public final AnonymousClass9IC A00;
    public final C299505vJ A01;
    public final C299515vK A02;
    public final C53310Glw A03;
    public final boolean A04;
    public final String A05;

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53475Gp7) {
                C53475Gp7 gp7 = (C53475Gp7) obj;
                if (!0qQ.A0K(this.A01, gp7.A01) || !0qQ.A0K(this.A00, gp7.A00) || this.A04 != gp7.A04 || !0qQ.A0K(this.A02, gp7.A02) || !0qQ.A0K(this.A03, gp7.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return this.A05;
    }

    public final C299505vJ Be5() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)))));
    }

    public C53475Gp7(AnonymousClass9IC r3, C299505vJ r4, C299515vK r5, C53310Glw glw, boolean z) {
        this.A01 = r4;
        this.A00 = r3;
        this.A04 = z;
        this.A02 = r5;
        this.A03 = glw;
        this.A05 = C299615vU.A01(this, "ad_card", r4.A03);
    }
}
