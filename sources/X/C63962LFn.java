package X;

/* renamed from: X.LFn  reason: case insensitive filesystem */
public final class C63962LFn {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63962LFn) {
                C63962LFn lFn = (C63962LFn) obj;
                if (!(this.A02 == lFn.A02 && this.A01 == lFn.A01 && this.A00 == lFn.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + this.A00;
    }

    public C63962LFn(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiOutputColor(r=");
        A1A.append(this.A02);
        A1A.append(", g=");
        A1A.append(this.A01);
        A1A.append(", b=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
