package X;

/* renamed from: X.HHu  reason: case insensitive filesystem */
public final class C54533HHu extends HQ1 {
    public final C56107Hsu A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54533HHu) {
                C54533HHu hHu = (C54533HHu) obj;
                if (!0qQ.A0K(this.A00, hHu.A00) || this.A01 != hHu.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }

    public C54533HHu(C56107Hsu hsu, boolean z) {
        this.A00 = hsu;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NegativeFeedbackClicked(suggestionPreviewState=");
        A1A.append(this.A00);
        A1A.append(", isEditScreen=");
        return G9t.A1C(A1A, this.A01);
    }
}
