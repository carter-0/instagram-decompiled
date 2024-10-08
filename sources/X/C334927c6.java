package X;

/* renamed from: X.7c6  reason: invalid class name and case insensitive filesystem */
public final class C334927c6 extends AnonymousClass0T0 implements C334127ai {
    public final int A00;
    public final int A01;
    public final 1Xl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334927c6) {
                C334927c6 r5 = (C334927c6) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && 0qQ.A0K(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + this.A02.hashCode();
    }

    public C334927c6(1Xl r1, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
    }
}
