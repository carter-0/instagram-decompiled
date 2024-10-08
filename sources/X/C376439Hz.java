package X;

/* renamed from: X.9Hz  reason: invalid class name and case insensitive filesystem */
public final class C376439Hz extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C376439Hz(int i, long j, long j2, long j3, long j4) {
        this.A00 = i;
        this.A04 = j;
        if (i != 0) {
            this.A02 = j2;
            this.A03 = j3;
        } else {
            this.A03 = j2;
            this.A02 = j3;
        }
        this.A01 = j4;
    }

    public final boolean equals(Object obj) {
        C376439Hz r6;
        long j;
        long j2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C376439Hz)) {
                return false;
            }
            r6 = (C376439Hz) obj;
            if (r6.A00 != 1 || this.A04 != r6.A04 || this.A02 != r6.A02) {
                return false;
            }
            j = this.A03;
            j2 = r6.A03;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C376439Hz)) {
                return false;
            }
            r6 = (C376439Hz) obj;
            if (r6.A00 != 0 || this.A04 != r6.A04 || this.A03 != r6.A03) {
                return false;
            }
            j = this.A02;
            j2 = r6.A02;
        }
        if (j == j2 && this.A01 == r6.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        char c;
        int i;
        long j;
        if (this.A00 != 0) {
            long j2 = this.A04;
            c = ' ';
            long j3 = this.A02;
            i = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            j = this.A03;
        } else {
            long j4 = this.A04;
            c = ' ';
            long j5 = this.A03;
            i = ((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            j = this.A02;
        }
        long j6 = this.A01;
        return ((i + ((int) (j ^ (j >>> c)))) * 31) + ((int) (j6 ^ (j6 >>> c)));
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        if (this.A00 != 0) {
            sb.append("Interval(startTime=");
            sb.append(this.A04);
            sb.append(", endTime=");
            sb.append(this.A02);
            sb.append(", startMtime=");
            sb.append(this.A03);
            str = ", endMtime=";
        } else {
            sb = new StringBuilder();
            sb.append("CurrentInterval(startTime=");
            sb.append(this.A04);
            sb.append(", startMtime=");
            sb.append(this.A03);
            sb.append(", lastActiveTime=");
            sb.append(this.A02);
            str = ", lastActiveMTime=";
        }
        sb.append(str);
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
