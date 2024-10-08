package X;

/* renamed from: X.Jt9  reason: case insensitive filesystem */
public final class C60889Jt9 extends AnonymousClass0T0 {
    public int A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60889Jt9) {
                C60889Jt9 jt9 = (C60889Jt9) obj;
                if (!(0qQ.A0K(this.A01, jt9.A01) && this.A03 == jt9.A03 && this.A00 == jt9.A00 && this.A02 == jt9.A02 && this.A04 == jt9.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A01);
        return DbS.A06(this.A04, AnonymousClass7TF.A09(this.A02, (AnonymousClass7TF.A09(this.A03, A0O) + this.A00) * 31));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Builder(queryText=");
        A1A.append(this.A01);
        A1A.append(", isTypeaheadQuery=");
        A1A.append(this.A03);
        A1A.append(", keywordCount=");
        A1A.append(this.A00);
        A1A.append(", isFirstPage=");
        A1A.append(this.A02);
        A1A.append(", isUserSearchAction=");
        return G9t.A1C(A1A, this.A04);
    }
}
