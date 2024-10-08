package X;

/* renamed from: X.7ez  reason: invalid class name and case insensitive filesystem */
public final class C336667ez extends C333827aD {
    public final String A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C336667ez(String str, boolean z) {
        super(002.A0R("xar_disclosure_banner_row", str));
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C336667ez) {
                C336667ez r5 = (C336667ez) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}
