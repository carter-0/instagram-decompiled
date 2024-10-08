package X;

/* renamed from: X.6DU  reason: invalid class name */
public final class AnonymousClass6DU extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final C299505vJ A01;
    public final AnonymousClass62P A02;
    public final boolean A03;
    public final AnonymousClass9IC A04;

    public AnonymousClass6DU(AnonymousClass9IC r2, C299505vJ r3, AnonymousClass62P r4, int i, boolean z) {
        0qQ.A0B(r4, 4);
        this.A01 = r3;
        this.A04 = r2;
        this.A00 = i;
        this.A02 = r4;
        this.A03 = z;
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DU) {
                AnonymousClass6DU r5 = (AnonymousClass6DU) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A04, r5.A04) || this.A00 != r5.A00 || !0qQ.A0K(this.A02, r5.A02) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return C299615vU.A01(this, "inline_reply_expansion", this.A01.A03);
    }

    public final C299505vJ Be5() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode = ((((((this.A01.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode + i;
    }
}
