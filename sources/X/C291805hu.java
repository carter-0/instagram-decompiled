package X;

/* renamed from: X.5hu  reason: invalid class name and case insensitive filesystem */
public final class C291805hu {
    public static final C291805hu A03 = new C291805hu(0.0f, 4278190080L << 32, 0);
    public final float A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C291805hu) {
                long j = this.A01;
                C291805hu r9 = (C291805hu) obj;
                long j2 = r9.A01;
                long j3 = AnonymousClass5RW.A01;
                if (!(j == j2 && this.A02 == r9.A02 && this.A00 == r9.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = AnonymousClass5RW.A01;
        long j3 = this.A02;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shadow(color=");
        sb.append(AnonymousClass5RW.A06(this.A01));
        sb.append(", offset=");
        sb.append(C289295dM.A08(this.A02));
        sb.append(", blurRadius=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C291805hu(float f, long j, long j2) {
        this.A01 = j;
        this.A02 = j2;
        this.A00 = f;
    }

    static {
        long j = AnonymousClass5RW.A01;
    }
}
