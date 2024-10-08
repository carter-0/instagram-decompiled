package X;

/* renamed from: X.6DK  reason: invalid class name */
public final class AnonymousClass6DK extends AnonymousClass0T0 implements C299575vQ {
    public final AnonymousClass9IC A00;
    public final C53292Gle A01;
    public final C299505vJ A02;
    public final String A03;

    public /* synthetic */ AnonymousClass6DK(C53292Gle gle, C299505vJ r10) {
        this(new AnonymousClass9IC(31, 0, false, false, false, false, false), gle, r10);
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DK) {
                AnonymousClass6DK r5 = (AnonymousClass6DK) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String BK1() {
        return this.A03;
    }

    public final C299505vJ Be5() {
        return this.A02;
    }

    public AnonymousClass6DK(AnonymousClass9IC r3, C53292Gle gle, C299505vJ r5) {
        this.A02 = r5;
        this.A00 = r3;
        this.A01 = gle;
        this.A03 = C299615vU.A01(this, "poll", r5.A03);
    }
}
