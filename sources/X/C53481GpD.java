package X;

/* renamed from: X.GpD  reason: case insensitive filesystem */
public final class C53481GpD extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final int A01;
    public final AnonymousClass9IC A02;
    public final C299505vJ A03;
    public final C299735vl A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final String A09;

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53481GpD) {
                C53481GpD gpD = (C53481GpD) obj;
                if (!0qQ.A0K(this.A03, gpD.A03) || !0qQ.A0K(this.A02, gpD.A02) || this.A08 != gpD.A08 || this.A07 != gpD.A07 || !0qQ.A0K(this.A05, gpD.A05) || !0qQ.A0K(this.A06, gpD.A06) || this.A00 != gpD.A00 || !0qQ.A0K(this.A04, gpD.A04) || this.A01 != gpD.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return this.A09;
    }

    public final C299505vJ Be5() {
        return this.A03;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A03)))) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + this.A00) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31) + this.A01;
    }

    public C53481GpD(AnonymousClass9IC r3, C299505vJ r4, C299735vl r5, String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.A03 = r4;
        this.A02 = r3;
        this.A08 = z;
        this.A07 = z2;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = i;
        this.A04 = r5;
        this.A01 = i2;
        this.A09 = C299615vU.A01(this, "condensed_quote_post_preview", r4.A03);
    }
}
