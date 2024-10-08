package X;

/* renamed from: X.GpA  reason: case insensitive filesystem */
public final class C53478GpA extends AnonymousClass0T0 implements C299575vQ {
    public final C299505vJ A00;
    public final String A01;
    public final AnonymousClass62P A02;
    public final boolean A03;
    public final AnonymousClass9IC A04;
    public final C61082JwK A05 = new C61082JwK((N49) null, 2, true);
    public final String A06;

    public C53478GpA(AnonymousClass9IC r6, C299505vJ r7, String str, AnonymousClass62P r9, boolean z) {
        this.A00 = r7;
        this.A04 = r6;
        this.A03 = z;
        this.A01 = str;
        this.A02 = r9;
        this.A06 = C299615vU.A01(this, "overlayview", r7.A03);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53478GpA) {
                C53478GpA gpA = (C53478GpA) obj;
                if (!0qQ.A0K(this.A00, gpA.A00) || !0qQ.A0K(this.A04, gpA.A04) || this.A03 != gpA.A03 || !0qQ.A0K(this.A01, gpA.A01) || !0qQ.A0K(this.A02, gpA.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return this.A06;
    }

    public final C299505vJ Be5() {
        return this.A00;
    }

    public final C61082JwK CFL() {
        return this.A05;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A00))) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
