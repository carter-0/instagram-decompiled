package X;

/* renamed from: X.6DL  reason: invalid class name */
public final class AnonymousClass6DL extends AnonymousClass0T0 implements C299575vQ {
    public final AnonymousClass9IC A00;
    public final C61058Jvw A01;
    public final C299505vJ A02;
    public final boolean A03;
    public final boolean A04;
    public final String A05;

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DL) {
                AnonymousClass6DL r5 = (AnonymousClass6DL) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || this.A03 != r5.A03 || !0qQ.A0K(this.A01, r5.A01) || this.A04 != r5.A04) {
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
        return this.A02;
    }

    public final int hashCode() {
        int hashCode = ((this.A02.hashCode() * 31) + this.A00.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.A01.hashCode()) * 31;
        int i2 = 1237;
        if (this.A04) {
            i2 = 1231;
        }
        return hashCode2 + i2;
    }

    public AnonymousClass6DL(AnonymousClass9IC r3, C61058Jvw jvw, C299505vJ r5, boolean z, boolean z2) {
        this.A02 = r5;
        this.A00 = r3;
        this.A03 = z;
        this.A01 = jvw;
        this.A04 = z2;
        this.A05 = C299615vU.A01(this, C66579MXk.A00(348), r5.A03);
    }
}
