package X;

/* renamed from: X.Dct  reason: case insensitive filesystem */
public final class C46350Dct {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final int A05;

    public C46350Dct(String str, String str2, String str3, String str4, int i, long j) {
        AnonymousClass7TG.A0w(2, str, str2, str3);
        this.A05 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C46350Dct) {
            C46350Dct dct = (C46350Dct) obj;
            if (!0qQ.A0K(dct.A04, this.A04) || !0qQ.A0K(dct.A03, this.A03) || !0qQ.A0K(dct.A01, this.A01) || dct.A05 != this.A05) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OnClickListener");
        A1A.append(" on ");
        A1A.append(this.A03);
        A1A.append('#');
        A1A.append(this.A05);
        A1A.append(" with ViewID: ");
        A1A.append(this.A04);
        A1A.append(", with handler class: ");
        return AnonymousClass7TF.A0l(this.A01, A1A);
    }
}
