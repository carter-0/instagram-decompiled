package X;

/* renamed from: X.6DW  reason: invalid class name */
public final class AnonymousClass6DW extends AnonymousClass0T0 implements C299575vQ {
    public final C299505vJ A00;
    public final boolean A01;
    public final boolean A02;
    public final AnonymousClass9IC A03;

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DW) {
                AnonymousClass6DW r5 = (AnonymousClass6DW) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || this.A02 != r5.A02 || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return C299615vU.A01(this, "post_insights_row", this.A00.A03);
    }

    public final C299505vJ Be5() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode = ((this.A00.hashCode() * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public AnonymousClass6DW(AnonymousClass9IC r1, C299505vJ r2, boolean z, boolean z2) {
        this.A00 = r2;
        this.A03 = r1;
        this.A02 = z;
        this.A01 = z2;
    }
}
