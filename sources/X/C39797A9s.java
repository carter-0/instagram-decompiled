package X;

/* renamed from: X.A9s  reason: case insensitive filesystem */
public final class C39797A9s {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C39797A9s a9s = (C39797A9s) obj;
            if (!(this.A04 == a9s.A04 && this.A03 == a9s.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((int) this.A04) * 31) + ((int) this.A03);
    }

    public final String toString() {
        String format = String.format("<S t=\"%d\" d=\"%d\"/>", new Object[]{Long.valueOf(this.A04), Long.valueOf(this.A03)});
        if (this.A05) {
            return 002.A0R(format, " (p) ");
        }
        return format;
    }

    public C39797A9s(int i, int i2, int i3, long j, long j2, boolean z) {
        this.A04 = j;
        this.A03 = j2;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = z;
        this.A00 = i3;
    }
}
