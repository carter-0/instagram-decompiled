package X;

/* renamed from: X.6Cy  reason: invalid class name and case insensitive filesystem */
public final class C304306Cy extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final int A01;
    public final AnonymousClass9IC A02;
    public final C299505vJ A03;
    public final C299585vR A04;
    public final C53283GlV A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final String A09;

    public C304306Cy(AnonymousClass9IC r3, C299505vJ r4, C299585vR r5, C53283GlV glV, String str, String str2, int i, int i2, boolean z) {
        0qQ.A0B(r3, 2);
        this.A03 = r4;
        this.A02 = r3;
        this.A07 = str;
        this.A05 = glV;
        this.A08 = z;
        this.A06 = str2;
        this.A00 = i;
        this.A04 = r5;
        this.A01 = i2;
        this.A09 = C299615vU.A01(this, "voice_post", r4.A03);
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C304306Cy) {
                C304306Cy r5 = (C304306Cy) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A05, r5.A05) || this.A08 != r5.A08 || !0qQ.A0K(this.A06, r5.A06) || this.A00 != r5.A00 || this.A04 != r5.A04 || this.A01 != r5.A01) {
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
        int hashCode;
        int hashCode2 = ((((((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A05.hashCode()) * 31;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        String str = this.A06;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((i2 + hashCode) * 31) + this.A00) * 31) + this.A04.hashCode()) * 31) + this.A01;
    }
}
