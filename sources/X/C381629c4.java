package X;

/* renamed from: X.9c4  reason: invalid class name and case insensitive filesystem */
public final class C381629c4 extends AnonymousClass0T0 {
    public long A00;
    public long A01;
    public final int A02;

    public C381629c4(long j, long j2, int i) {
        this.A02 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = j;
                this.A00 = j2;
                return;
            default:
                this.A00 = j;
                this.A01 = j2;
                return;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        long j;
        long j2;
        switch (this.A02) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C381629c4) {
                    C381629c4 r6 = (C381629c4) obj;
                    if (r6.A02 == 2 && this.A00 == r6.A00) {
                        j = this.A01;
                        j2 = r6.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!(obj instanceof C381629c4)) {
            return false;
        }
        C381629c4 r62 = (C381629c4) obj;
        if (r62.A02 != i || this.A01 != r62.A01) {
            return false;
        }
        j = this.A00;
        j2 = r62.A00;
        if (j != j2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        char c;
        int i;
        long j;
        if (2 - this.A02 != 0) {
            long j2 = this.A01;
            c = ' ';
            i = ((int) (j2 ^ (j2 >>> 32))) * 31;
            j = this.A00;
        } else {
            long j3 = this.A00;
            c = ' ';
            i = ((int) (j3 ^ (j3 >>> 32))) * 31;
            j = this.A01;
        }
        return i + ((int) (j ^ (j >>> c)));
    }

    public final String toString() {
        if (this.A02 != 0) {
            return super.toString();
        }
        return 002.A0Y("ScreenTimeInterval(startTime=", ", endTime=", ')', this.A01, this.A00);
    }
}
