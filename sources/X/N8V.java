package X;

public final class N8V extends AnonymousClass0T0 implements C74247Prb {
    public static final N8V A04 = new N8V((C68319NAg) null, "", 0, false);
    public final int A00;
    public final C68319NAg A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8V) {
                N8V n8v = (N8V) obj;
                if (!0qQ.A0K(this.A02, n8v.A02) || this.A00 != n8v.A00 || this.A03 != n8v.A03 || !0qQ.A0K(this.A01, n8v.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, (AnonymousClass7TE.A0O(this.A02) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A01);
    }

    public N8V(C68319NAg nAg, String str, int i, boolean z) {
        this.A02 = str;
        this.A00 = i;
        this.A03 = z;
        this.A01 = nAg;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TAMSearchLoadingState(query=");
        A1A.append(this.A02);
        A1A.append(", count=");
        A1A.append(this.A00);
        A1A.append(", isLoading=");
        A1A.append(this.A03);
        A1A.append(", searchResults=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
