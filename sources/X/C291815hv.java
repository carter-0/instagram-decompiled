package X;

/* renamed from: X.5hv  reason: invalid class name and case insensitive filesystem */
public final class C291815hv {
    public static final C291815hv A02 = new C291815hv(AnonymousClass5Z7.A01(0), AnonymousClass5Z7.A01(0));
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C291815hv) {
                long j = this.A00;
                C291815hv r8 = (C291815hv) obj;
                long j2 = r8.A00;
                AnonymousClass5Z6[] r0 = AnonymousClass5Z5.A02;
                if (!(j == j2 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        AnonymousClass5Z6[] r0 = AnonymousClass5Z5.A02;
        long j2 = this.A01;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextIndent(firstLine=");
        sb.append(AnonymousClass5Z5.A02(this.A00));
        sb.append(", restLine=");
        sb.append(AnonymousClass5Z5.A02(this.A01));
        sb.append(')');
        return sb.toString();
    }

    public C291815hv(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}
