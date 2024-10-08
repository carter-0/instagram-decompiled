package X;

/* renamed from: X.9c7  reason: invalid class name and case insensitive filesystem */
public final class C381659c7 extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public C381659c7(long j, long j2, long j3, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = j;
            this.A01 = j2;
        } else {
            this.A01 = j;
            this.A02 = j2;
        }
        this.A03 = j3;
    }

    public final boolean equals(Object obj) {
        C381659c7 r6;
        long j;
        long j2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C381659c7)) {
                return false;
            }
            r6 = (C381659c7) obj;
            if (r6.A00 != 1 || this.A02 != r6.A02) {
                return false;
            }
            j = this.A01;
            j2 = r6.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C381659c7)) {
                return false;
            }
            r6 = (C381659c7) obj;
            if (r6.A00 != 0 || this.A01 != r6.A01) {
                return false;
            }
            j = this.A02;
            j2 = r6.A02;
        }
        if (j == j2 && this.A03 == r6.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        char c;
        int i;
        long j;
        if (this.A00 != 0) {
            long j2 = this.A02;
            c = ' ';
            i = ((int) (j2 ^ (j2 >>> 32))) * 31;
            j = this.A01;
        } else {
            long j3 = this.A01;
            c = ' ';
            i = ((int) (j3 ^ (j3 >>> 32))) * 31;
            j = this.A02;
        }
        int A012 = AnonymousClass7TF.A01(j, i);
        long j4 = this.A03;
        return A012 + ((int) (j4 ^ (j4 >>> c)));
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SchedStats(timeOnCpu=");
        A1A.append(this.A01);
        A1A.append(", timeWaiting=");
        A1A.append(this.A02);
        A1A.append(", timeslicesCount=");
        A1A.append(this.A03);
        return AnonymousClass7TG.A0p(A1A);
    }
}
