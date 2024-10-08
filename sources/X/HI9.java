package X;

public final class HI9 extends HQ2 {
    public final C56123HtB A00;
    public final C56565I1t A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HI9) {
                HI9 hi9 = (HI9) obj;
                if (!0qQ.A0K(this.A00, hi9.A00) || this.A04 != hi9.A04 || !0qQ.A0K(this.A02, hi9.A02) || !0qQ.A0K(this.A01, hi9.A01) || this.A03 != hi9.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A00) * 31;
        return DbS.A06(this.A03, (((AnonymousClass7TF.A09(this.A04, A0C) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31);
    }

    public HI9(C56123HtB htB, C56565I1t i1t, String str, boolean z, boolean z2) {
        this.A00 = htB;
        this.A04 = z;
        this.A02 = str;
        this.A01 = i1t;
        this.A03 = z2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ResultScreen(generatedImageResponse=");
        A1A.append(this.A00);
        A1A.append(", useGridLayout=");
        A1A.append(this.A04);
        A1A.append(", displayPromptOverride=");
        A1A.append(this.A02);
        A1A.append(", suggestionsPromptMetadata=");
        A1A.append(this.A01);
        A1A.append(", actionButtonEnabled=");
        return G9t.A1C(A1A, this.A03);
    }
}
