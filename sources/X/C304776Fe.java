package X;

/* renamed from: X.6Fe  reason: invalid class name and case insensitive filesystem */
public final class C304776Fe extends C304786Ff {
    public final long A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C304776Fe) {
                long j = this.A00;
                long j2 = ((C304776Fe) obj).A00;
                long j3 = AnonymousClass5RW.A01;
                if (j == j2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = AnonymousClass5RW.A01;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SolidColor(value=");
        sb.append(AnonymousClass5RW.A06(this.A00));
        sb.append(')');
        return sb.toString();
    }

    public C304776Fe(long j) {
        this.A00 = j;
    }
}
