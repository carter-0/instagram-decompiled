package X;

/* renamed from: X.BAz  reason: case insensitive filesystem */
public final class C42024BAz extends AnonymousClass0T0 {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42024BAz) {
                C42024BAz bAz = (C42024BAz) obj;
                if (!0qQ.A0K(this.A00, bAz.A00) || this.A01 != bAz.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0E = AnonymousClass7TG.A0E(this.A00) * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return A0E + i;
    }

    public C42024BAz(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
