package X;

/* renamed from: X.0ts  reason: invalid class name and case insensitive filesystem */
public final class C62520ts {
    public float A00;
    public long A01;
    public long A02 = -1;

    public final long A00(long j) {
        long j2 = this.A02;
        if (j2 != -1) {
            return (this.A01 + j) - j2;
        }
        return this.A01;
    }

    public final boolean A01(float f, long j) {
        float f2 = this.A00;
        if (f >= f2 && this.A02 == -1) {
            this.A02 = j;
            return true;
        } else if (f >= f2) {
            return false;
        } else {
            long j2 = this.A02;
            if (j2 == -1) {
                return false;
            }
            this.A01 += j - j2;
            this.A02 = -1;
            return true;
        }
    }

    public final boolean A02(long j) {
        long j2 = this.A02;
        if (j2 == -1) {
            return false;
        }
        this.A01 += j - j2;
        this.A02 = -1;
        return true;
    }

    public C62520ts(C62520ts r3) {
        this.A02 = r3.A02;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
    }
}
