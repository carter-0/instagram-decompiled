package X;

/* renamed from: X.Jur  reason: case insensitive filesystem */
public final class C60995Jur extends AnonymousClass0T0 {
    public final C299935wF A00;
    public final C48153EZv A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60995Jur) {
                C60995Jur jur = (C60995Jur) obj;
                if (!(this.A06 == jur.A06 && this.A04 == jur.A04 && 0qQ.A0K(this.A00, jur.A00) && 0qQ.A0K(this.A02, jur.A02) && this.A03 == jur.A03 && this.A01 == jur.A01 && this.A05 == jur.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = C51965G9l.A05(this.A06);
        boolean z = this.A03;
        return DbS.A06(this.A05, (AnonymousClass7TF.A09(z, (((AnonymousClass7TF.A09(this.A04, A052) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31);
    }

    public C60995Jur(C299935wF r1, C48153EZv eZv, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = z;
        this.A04 = z2;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = z3;
        this.A01 = eZv;
        this.A05 = z4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FacebookXpostUiState(shouldExist=");
        A1A.append(this.A06);
        A1A.append(", isConnected=");
        A1A.append(this.A04);
        A1A.append(", destination=");
        A1A.append(this.A00);
        A1A.append(C273654mx.A00(1126));
        A1A.append(this.A02);
        A1A.append(", currentPostOn=");
        A1A.append(this.A03);
        A1A.append(", fbSharingAccount=");
        A1A.append(this.A01);
        A1A.append(", needToConfirmAudience=");
        return G9t.A1C(A1A, this.A05);
    }
}
