package X;

/* renamed from: X.Dwj  reason: case insensitive filesystem */
public final class C47373Dwj extends C48159Ea1 {
    public final boolean A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47373Dwj) {
                C47373Dwj dwj = (C47373Dwj) obj;
                if (this.A00 != dwj.A00 || !0qQ.A0K(this.A01, dwj.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return C41845B3m.A01(this.A01, i * 31);
    }

    public C47373Dwj(boolean z, String str) {
        this.A00 = z;
        this.A01 = str;
    }
}
