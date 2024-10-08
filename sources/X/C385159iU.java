package X;

/* renamed from: X.9iU  reason: invalid class name and case insensitive filesystem */
public final class C385159iU extends C333827aD {
    public final AnonymousClass3QO A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C385159iU) {
                C385159iU r5 = (C385159iU) obj;
                if (!(this.A02 == r5.A02 && 0qQ.A0K(this.A01, r5.A01) && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C385159iU(AnonymousClass3QO r3, String str, boolean z) {
        super(002.A1A("audience_disclosure_banner_row", str, r3.name(), z));
        this.A02 = z;
        this.A01 = str;
        this.A00 = r3;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A01, i * 31));
    }
}
