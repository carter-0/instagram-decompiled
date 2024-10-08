package X;

public final class QPp extends RLX {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPp) {
                QPp qPp = (QPp) obj;
                if (!0qQ.A0K(this.A05, qPp.A05) || !0qQ.A0K(this.A03, qPp.A03) || this.A00 != qPp.A00 || !0qQ.A0K(this.A04, qPp.A04) || this.A01 != qPp.A01 || !0qQ.A0K(this.A02, qPp.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A05);
        String str = this.A04;
        return C41845B3m.A01(this.A02, (AnonymousClass7TF.A08(str, (AnonymousClass7TF.A08(this.A03, A0O) + this.A00) * 31) + this.A01) * 31);
    }

    public QPp(String str, String str2, int i, int i2, String str3, String str4) {
        C51974G9v.A1L(str, str2, str3);
        this.A05 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A04 = str3;
        this.A01 = i2;
        this.A02 = str4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MainThreadLayoutStateMismatch(root=");
        A1A.append(this.A05);
        A1A.append(", mainThreadLayoutStateSizeSpecs=");
        A1A.append(this.A03);
        A1A.append(", mainThreadLayoutRootId=");
        A1A.append(this.A00);
        A1A.append(", measureSizeSpecs=");
        A1A.append(this.A04);
        A1A.append(", rootId=");
        A1A.append(this.A01);
        A1A.append(", breadcrumb=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}
