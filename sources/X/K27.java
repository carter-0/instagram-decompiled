package X;

public final class K27 extends C62706Kl6 {
    public final int A00;
    public final int A01;
    public final C61052Jvq A02;
    public final C59721JVf A03;
    public final N49 A04;
    public final C266444Yx A05;
    public final C266444Yx A06;
    public final C266444Yx A07;
    public final C266444Yx A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K27) {
                K27 k27 = (K27) obj;
                if (!0qQ.A0K(this.A0A, k27.A0A) || !0qQ.A0K(this.A08, k27.A08) || !0qQ.A0K(this.A06, k27.A06) || !0qQ.A0K(this.A07, k27.A07) || !0qQ.A0K(this.A05, k27.A05) || !0qQ.A0K(this.A04, k27.A04) || this.A0B != k27.A0B || this.A00 != k27.A00 || this.A01 != k27.A01 || !0qQ.A0K(this.A09, k27.A09) || !0qQ.A0K(this.A03, k27.A03) || !0qQ.A0K(this.A02, k27.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A08, AnonymousClass7TE.A0O(this.A0A))))));
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A09, (((AnonymousClass7TF.A09(this.A0B, A072) + this.A00) * 31) + this.A01) * 31)));
    }

    public K27(C61052Jvq jvq, C59721JVf jVf, N49 n49, C266444Yx r4, C266444Yx r5, C266444Yx r6, C266444Yx r7, String str, String str2, int i, int i2, boolean z) {
        this.A0A = str;
        this.A08 = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A05 = r7;
        this.A04 = n49;
        this.A0B = z;
        this.A00 = i;
        this.A01 = i2;
        this.A09 = str2;
        this.A03 = jVf;
        this.A02 = jvq;
    }
}
