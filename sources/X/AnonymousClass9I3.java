package X;

/* renamed from: X.9I3  reason: invalid class name */
public final class AnonymousClass9I3 extends AnonymousClass0T0 implements C334127ai {
    public final int A00;
    public final boolean A01;

    public AnonymousClass9I3(boolean z, int i) {
        this.A00 = i;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof AnonymousClass9I3)) {
            return false;
        }
        AnonymousClass9I3 r3 = (AnonymousClass9I3) obj;
        if (r3.A00 == i && this.A01 == r3.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A01) {
            return 1231;
        }
        return 1237;
    }
}
