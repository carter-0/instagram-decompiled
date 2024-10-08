package X;

/* renamed from: X.GpE  reason: case insensitive filesystem */
public final class C53482GpE extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final AnonymousClass9IC A01;
    public final C299505vJ A02;
    public final C299735vl A03;
    public final C53333GmJ A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final C61082JwK A0C;
    public final String A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53482GpE) {
                C53482GpE gpE = (C53482GpE) obj;
                if (!(0qQ.A0K(this.A02, gpE.A02) && 0qQ.A0K(this.A01, gpE.A01) && this.A08 == gpE.A08 && 0qQ.A0K(this.A04, gpE.A04) && this.A07 == gpE.A07 && this.A0A == gpE.A0A && this.A09 == gpE.A09 && 0qQ.A0K(this.A03, gpE.A03) && this.A06 == gpE.A06 && this.A00 == gpE.A00 && this.A0B == gpE.A0B && 0qQ.A0K(this.A05, gpE.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return this.A0D;
    }

    public final C299505vJ Be5() {
        return this.A02;
    }

    public final C61082JwK CFL() {
        return this.A0C;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02));
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A07, (AnonymousClass7TF.A09(this.A08, A072) + AnonymousClass7TG.A0C(this.A04)) * 31));
        boolean z = this.A06;
        return AnonymousClass7TF.A09(this.A0B, (AnonymousClass7TF.A09(z, (AnonymousClass7TF.A09(this.A09, A092) + AnonymousClass7TG.A0C(this.A03)) * 31) + this.A00) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public C53482GpE(AnonymousClass9IC r7, C299505vJ r8, C299735vl r9, C53333GmJ gmJ, Integer num, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str;
        String str2;
        AnonymousClass62P r0;
        boolean A1Y = DbW.A1Y(r7);
        this.A02 = r8;
        this.A01 = r7;
        this.A08 = z;
        this.A04 = gmJ;
        this.A07 = z2;
        this.A0A = z3;
        this.A09 = z4;
        this.A03 = r9;
        this.A06 = z5;
        this.A00 = i;
        this.A0B = z6;
        this.A05 = num;
        if (gmJ == null || (r0 = gmJ.A0K) == null || AnonymousClass7TE.A1b(r0) != A1Y) {
            str = "quote_post_preview";
        } else {
            str = "quote_post_media_preview";
        }
        N49 n49 = null;
        this.A0D = C299615vU.A01(this, str, this.A02.A03);
        if (!(gmJ == null || (str2 = gmJ.A0F) == null)) {
            n49 = new N49(C299615vU.A01(this, str, str2), str2, 15);
        }
        this.A0C = new C61082JwK(n49, A1Y ? 1 : 0, false);
    }
}
