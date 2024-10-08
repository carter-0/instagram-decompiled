package X;

/* renamed from: X.5Zc  reason: invalid class name and case insensitive filesystem */
public final class C287125Zc implements AnonymousClass5ZA {
    public final long A00;

    public final C304786Ff AiJ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C287125Zc) {
                long j = this.A00;
                long j2 = ((C287125Zc) obj).A00;
                long j3 = AnonymousClass5RW.A01;
                if (j == j2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorStyle(value=");
        sb.append(AnonymousClass5RW.A06(this.A00));
        sb.append(')');
        return sb.toString();
    }

    public final float AbF() {
        return AnonymousClass5RW.A00(this.A00);
    }

    public final long Aoz() {
        return this.A00;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = AnonymousClass5RW.A01;
        return (int) (j ^ (j >>> 32));
    }

    public C287125Zc(long j) {
        this.A00 = j;
        if (j == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
