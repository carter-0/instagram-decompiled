package X;

/* renamed from: X.Jxo  reason: case insensitive filesystem */
public final class C61138Jxo extends AnonymousClass0T0 implements C66384MPq {
    public final C56078HsR A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61138Jxo) {
                C61138Jxo jxo = (C61138Jxo) obj;
                if (!0qQ.A0K(this.A00, jxo.A00) || this.A01 != jxo.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C61138Jxo(C56078HsR hsR, boolean z) {
        this.A00 = hsR;
        this.A01 = z;
    }
}
