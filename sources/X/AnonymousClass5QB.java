package X;

/* renamed from: X.5QB  reason: invalid class name */
public final class AnonymousClass5QB {
    public long A00;
    public AnonymousClass5QA A01;
    public C268024cd A02;
    public AnonymousClass5Q8 A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5QB) {
                AnonymousClass5QB r8 = (AnonymousClass5QB) obj;
                if (!0qQ.A0K(this.A02, r8.A02) || this.A03 != r8.A03 || !0qQ.A0K(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DrawParams(density=");
        sb.append(this.A02);
        sb.append(", layoutDirection=");
        sb.append(this.A03);
        sb.append(", canvas=");
        sb.append(this.A01);
        sb.append(", size=");
        sb.append(C288025bF.A03(this.A00));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        long j = this.A00;
        return (((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
