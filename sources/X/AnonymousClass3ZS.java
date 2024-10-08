package X;

/* renamed from: X.3ZS  reason: invalid class name */
public final class AnonymousClass3ZS extends AnonymousClass0T0 {
    public final long A00;
    public final C62320sa A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3ZS) {
                AnonymousClass3ZS r8 = (AnonymousClass3ZS) obj;
                if (!(this.A02 == r8.A02 && this.A00 == r8.A00 && 0qQ.A0K(this.A01, r8.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        long j = this.A00;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A01.hashCode();
    }

    public AnonymousClass3ZS(C62320sa r1, long j, boolean z) {
        this.A02 = z;
        this.A00 = j;
        this.A01 = r1;
    }
}
