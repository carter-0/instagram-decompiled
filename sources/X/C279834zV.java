package X;

/* renamed from: X.4zV  reason: invalid class name and case insensitive filesystem */
public final class C279834zV extends AnonymousClass0T0 implements Comparable {
    public final long A00;
    public final long A01;
    public final 1CS A02;

    public C279834zV(1CS r2, long j, long j2) {
        0qQ.A0B(r2, 1);
        this.A02 = r2;
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C279834zV) {
                C279834zV r8 = (C279834zV) obj;
                if (!(this.A02 == r8.A02 && this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C279834zV r5 = (C279834zV) obj;
        0qQ.A0B(r5, 0);
        return 0qQ.A01(this.A01, r5.A01);
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = this.A00;
        return (((this.A02.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02.ordinal());
        sb.append(":");
        sb.append(this.A01);
        sb.append(":");
        sb.append(this.A00);
        return sb.toString();
    }
}
