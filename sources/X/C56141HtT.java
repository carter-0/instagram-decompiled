package X;

/* renamed from: X.HtT  reason: case insensitive filesystem */
public final class C56141HtT {
    public final C56550I1e A00;
    public final C54721HQa A01;
    public final C56557I1l A02;
    public final C56551I1f A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56141HtT) {
                C56141HtT htT = (C56141HtT) obj;
                if (!0qQ.A0K(this.A06, htT.A06) || !0qQ.A0K(this.A05, htT.A05) || !0qQ.A0K(this.A04, htT.A04) || !0qQ.A0K(this.A01, htT.A01) || !0qQ.A0K(this.A02, htT.A02) || !0qQ.A0K(this.A00, htT.A00) || !0qQ.A0K(this.A03, htT.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, ((((AnonymousClass7TG.A0E(this.A06) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A04)) * 31))));
    }

    public C56141HtT(C56550I1e i1e, C54721HQa hQa, C56557I1l i1l, C56551I1f i1f, String str, String str2, String str3) {
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = hQa;
        this.A02 = i1l;
        this.A00 = i1e;
        this.A03 = i1f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UIState(prompt=");
        A1A.append(this.A06);
        A1A.append(", initialContent=");
        A1A.append(this.A05);
        A1A.append(", everstoreId=");
        A1A.append(this.A04);
        A1A.append(", suggestionState=");
        A1A.append(this.A01);
        A1A.append(", writeTonesState=");
        A1A.append(this.A02);
        A1A.append(", inputComposerState=");
        A1A.append(this.A00);
        A1A.append(", errorInfo=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }
}
