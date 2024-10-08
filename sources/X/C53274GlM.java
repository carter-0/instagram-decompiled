package X;

/* renamed from: X.GlM  reason: case insensitive filesystem */
public final class C53274GlM extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C53274GlM(int i, int i2, String str, String str2) {
        0qQ.A0B(str2, 4);
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53274GlM) {
                C53274GlM glM = (C53274GlM) obj;
                if (this.A01 != glM.A01 || this.A00 != glM.A00 || !0qQ.A0K(this.A03, glM.A03) || !0qQ.A0K(this.A02, glM.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A03, ((this.A01 * 31) + this.A00) * 31));
    }
}
