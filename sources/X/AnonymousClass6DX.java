package X;

/* renamed from: X.6DX  reason: invalid class name */
public final class AnonymousClass6DX extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final int A01;
    public final C299505vJ A02;
    public final String A03;
    public final AnonymousClass62P A04;
    public final AnonymousClass9IC A05;

    public AnonymousClass6DX(AnonymousClass9IC r2, C299505vJ r3, String str, AnonymousClass62P r5, int i, int i2) {
        0qQ.A0B(r5, 6);
        this.A02 = r3;
        this.A05 = r2;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = r5;
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DX) {
                AnonymousClass6DX r5 = (AnonymousClass6DX) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01 || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((this.A02.hashCode() * 31) + this.A05.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31) + this.A04.hashCode();
    }

    public final String BK1() {
        return C299615vU.A01(this, "post_fediverse_replies_row", this.A02.A03);
    }

    public final C299505vJ Be5() {
        return this.A02;
    }
}
