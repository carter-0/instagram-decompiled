package X;

/* renamed from: X.6Dp  reason: invalid class name and case insensitive filesystem */
public final class C304476Dp {
    public long A00;
    public final AnonymousClass5b4 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C304476Dp) {
                C304476Dp r8 = (C304476Dp) obj;
                if (!0qQ.A0K(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (this.A01.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimData(anim=");
        sb.append(this.A01);
        sb.append(", startSize=");
        long j = this.A00;
        sb.append(002.A0P(" x ", (int) (j >> 32), C289005cr.A00(j)));
        sb.append(')');
        return sb.toString();
    }

    public C304476Dp(AnonymousClass5b4 r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
