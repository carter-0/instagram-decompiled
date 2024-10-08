package X;

/* renamed from: X.I1q  reason: case insensitive filesystem */
public final class C56562I1q {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56562I1q) {
                C56562I1q i1q = (C56562I1q) obj;
                if (!(this.A03 == i1q.A03 && 0qQ.A0K(this.A01, i1q.A01) && 0qQ.A0K(this.A00, i1q.A00) && this.A04 == i1q.A04 && this.A02 == i1q.A02 && this.A05 == i1q.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A04, (((C51965G9l.A05(this.A03) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A00)) * 31)));
    }

    public C56562I1q(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = z;
        this.A01 = str;
        this.A00 = str2;
        this.A04 = z2;
        this.A02 = z3;
        this.A05 = z4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImagineFooterUiState(isDisabled=");
        A1A.append(this.A03);
        A1A.append(", prompt=");
        A1A.append(this.A01);
        A1A.append(", displayPrompt=");
        A1A.append(this.A00);
        A1A.append(", isTypedText=");
        A1A.append(this.A04);
        A1A.append(C273654mx.A00(1032));
        A1A.append(this.A02);
        A1A.append(C273654mx.A00(1144));
        return G9t.A1C(A1A, this.A05);
    }

    public C56562I1q() {
        this((String) null, (String) null, false, false, false, true);
    }
}
