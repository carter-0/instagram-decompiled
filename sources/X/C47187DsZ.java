package X;

/* renamed from: X.DsZ  reason: case insensitive filesystem */
public final class C47187DsZ extends AnonymousClass0T0 implements G8O {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47187DsZ) {
                C47187DsZ dsZ = (C47187DsZ) obj;
                if (!0qQ.A0K(this.A00, dsZ.A00) || !0qQ.A0K(this.A01, dsZ.A01) || this.A02 != dsZ.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00)));
    }

    public C47187DsZ(String str, String str2, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }
}
