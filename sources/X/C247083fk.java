package X;

/* renamed from: X.3fk  reason: invalid class name and case insensitive filesystem */
public final class C247083fk extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final C376529Ii A02;
    public final 1Xj A03;
    public final AnonymousClass3W1 A04;
    public final C247063fi A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C247083fk) {
                C247083fk r5 = (C247083fk) obj;
                if (this.A06 != r5.A06 || this.A00 != r5.A00 || this.A01 != r5.A01 || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return (((((((((((i * 31) + this.A00) * 31) + this.A01) * 31) + this.A05.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }

    public C247083fk(C376529Ii r1, 1Xj r2, AnonymousClass3W1 r3, C247063fi r4, int i, int i2, boolean z) {
        this.A06 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = r4;
        this.A04 = r3;
        this.A02 = r1;
        this.A03 = r2;
    }
}
