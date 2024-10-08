package X;

/* renamed from: X.6DV  reason: invalid class name */
public final class AnonymousClass6DV extends AnonymousClass0T0 implements C299575vQ {
    public final C299505vJ A00;
    public final AnonymousClass62P A01;
    public final AnonymousClass9IC A02;

    public AnonymousClass6DV(AnonymousClass9IC r2, C299505vJ r3, AnonymousClass62P r4) {
        0qQ.A0B(r4, 3);
        this.A00 = r3;
        this.A02 = r2;
        this.A01 = r4;
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DV) {
                AnonymousClass6DV r5 = (AnonymousClass6DV) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String BK1() {
        return C299615vU.A01(this, "relevant_tags", this.A00.A03);
    }

    public final C299505vJ Be5() {
        return this.A00;
    }
}
