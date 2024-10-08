package X;

/* renamed from: X.3g4  reason: invalid class name and case insensitive filesystem */
public final class C247273g4 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final AnonymousClass9IE A02;
    public final AnonymousClass3W1 A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C247273g4) {
                C247273g4 r5 = (C247273g4) obj;
                if (!(0qQ.A0K(this.A03, r5.A03) && this.A04 == r5.A04 && this.A00 == r5.A00 && this.A01 == r5.A01 && 0qQ.A0K(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A03.hashCode() * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        return ((((((hashCode + i) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02.hashCode();
    }

    public C247273g4(AnonymousClass9IE r1, AnonymousClass3W1 r2, int i, int i2, boolean z) {
        this.A03 = r2;
        this.A04 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
    }
}
