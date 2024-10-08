package X;

/* renamed from: X.3gj  reason: invalid class name and case insensitive filesystem */
public final class C247673gj extends AnonymousClass0T0 {
    public final C376539Ij A00;
    public final C247663gi A01;
    public final C247613gd A02;
    public final C247493gQ A03;
    public final C247523gT A04;
    public final AnonymousClass3ZH A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C247673gj(C376539Ij r2, C247663gi r3, C247613gd r4, C247493gQ r5, C247523gT r6, AnonymousClass3ZH r7, String str, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r5, 2);
        0qQ.A0B(r4, 11);
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = str;
        this.A09 = z;
        this.A08 = z2;
        this.A01 = r3;
        this.A00 = r2;
        this.A07 = z3;
        this.A02 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C247673gj) {
                C247673gj r5 = (C247673gj) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A06, r5.A06) || this.A09 != r5.A09 || this.A08 != r5.A08 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || this.A07 != r5.A07 || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.A05.hashCode() * 31) + this.A03.hashCode()) * 31) + C54732HQn.A00()) * 31) + this.A04.hashCode()) * 31) + this.A06.hashCode()) * 31;
        int i = 1237;
        if (this.A09) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int hashCode2 = (((((i2 + i3) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode()) * 31;
        int i4 = 1237;
        if (this.A07) {
            i4 = 1231;
        }
        return ((hashCode2 + i4) * 31) + this.A02.hashCode();
    }
}
