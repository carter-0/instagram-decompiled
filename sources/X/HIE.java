package X;

public final class HIE extends HQ2 {
    public final JMR A00;
    public final HQ0 A01;
    public final HQ1 A02;
    public final C56146HtY A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HIE) {
                HIE hie = (HIE) obj;
                if (!0qQ.A0K(this.A03, hie.A03) || !0qQ.A0K(this.A04, hie.A04) || this.A07 != hie.A07 || this.A06 != hie.A06 || !0qQ.A0K(this.A01, hie.A01) || !0qQ.A0K(this.A00, hie.A00) || !0qQ.A0K(this.A02, hie.A02) || this.A05 != hie.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A07, ((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31)));
        return DbS.A06(this.A05, (AnonymousClass7TF.A07(this.A00, A072) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }

    public HIE(JMR jmr, HQ0 hq0, HQ1 hq1, C56146HtY htY, String str, boolean z, boolean z2, boolean z3) {
        this.A03 = htY;
        this.A04 = str;
        this.A07 = z;
        this.A06 = z2;
        this.A01 = hq0;
        this.A00 = jmr;
        this.A02 = hq1;
        this.A05 = z3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EditScreen(currentMedia=");
        A1A.append(this.A03);
        A1A.append(", currentEditSuggestion=");
        A1A.append(this.A04);
        A1A.append(", isUndoAvailable=");
        A1A.append(this.A07);
        A1A.append(", isRedoAvailable=");
        A1A.append(this.A06);
        A1A.append(", navigationState=");
        A1A.append(this.A01);
        A1A.append(", screenState=");
        A1A.append(this.A00);
        A1A.append(", lastAction=");
        A1A.append(this.A02);
        A1A.append(", actionButtonEnabled=");
        return G9t.A1C(A1A, this.A05);
    }

    public HIE() {
        this(C57568Icv.A00, C54520HHg.A00, (HQ1) null, (C56146HtY) null, (String) null, false, false, true);
    }
}
