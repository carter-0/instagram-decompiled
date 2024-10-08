package X;

/* renamed from: X.3en  reason: invalid class name and case insensitive filesystem */
public final class C246553en extends AnonymousClass0T0 {
    public final long A00;
    public final long A01;
    public final AnonymousClass9IV A02;
    public final C246543em A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C246553en) {
                C246553en r8 = (C246553en) obj;
                if (!(this.A04 == r8.A04 && this.A03 == r8.A03 && this.A01 == r8.A01 && this.A00 == r8.A00 && 0qQ.A0K(this.A02, r8.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        long j = this.A01;
        long j2 = this.A00;
        return (((((((i * 31) + this.A03.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A02.hashCode();
    }

    public C246553en(AnonymousClass9IV r1, C246543em r2, long j, long j2, boolean z) {
        this.A04 = z;
        this.A03 = r2;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = r1;
    }
}
