package X;

public final class N61 extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N61) {
                N61 n61 = (N61) obj;
                if (!0qQ.A0K(this.A01, n61.A01) || !0qQ.A0K(this.A02, n61.A02) || !0qQ.A0K(this.A03, n61.A03) || this.A00 != n61.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01))) + this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        N61 n61 = (N61) obj;
        String str2 = this.A01;
        if (n61 != null) {
            str = n61.A01;
        } else {
            str = null;
        }
        return 0qQ.A0K(str2, str);
    }

    public N61(String str, String str2, String str3, int i) {
        AnonymousClass7TG.A1O(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SourcesListItemModel(title=");
        A1A.append(this.A01);
        A1A.append(", url=");
        A1A.append(this.A02);
        A1A.append(", botResponseId=");
        A1A.append(this.A03);
        A1A.append(", position=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
