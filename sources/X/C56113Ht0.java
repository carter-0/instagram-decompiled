package X;

/* renamed from: X.Ht0  reason: case insensitive filesystem */
public final class C56113Ht0 {
    public final int A00;
    public final int A01;
    public final String A02;

    public C56113Ht0(int i, int i2, String str) {
        0qQ.A0B(str, 3);
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56113Ht0) {
                C56113Ht0 ht0 = (C56113Ht0) obj;
                if (!(this.A01 == ht0.A01 && this.A00 == ht0.A00 && 0qQ.A0K(this.A02, ht0.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Mention(startIndex=");
        A1A.append(this.A01);
        A1A.append(", endIndex=");
        A1A.append(this.A00);
        A1A.append(", name=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}
