package X;

/* renamed from: X.9cs  reason: invalid class name and case insensitive filesystem */
public final class C381969cs extends AnonymousClass0T0 implements MQQ {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381969cs) {
                C381969cs r5 = (C381969cs) obj;
                if (!(0qQ.A0K(this.A01, r5.A01) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0E = ((AnonymousClass7TG.A0E(this.A01) * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return A0E + i;
    }

    public C381969cs(String str, int i, boolean z) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }
}
