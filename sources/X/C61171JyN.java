package X;

/* renamed from: X.JyN  reason: case insensitive filesystem */
public final class C61171JyN extends AnonymousClass0T0 implements C232262tL {
    public final C60996Jus A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61171JyN) {
                C61171JyN jyN = (C61171JyN) obj;
                if (!0qQ.A0K(this.A00, jyN.A00) || this.A01 != jyN.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A05;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61171JyN jyN = (C61171JyN) obj;
        0qQ.A0B(jyN, 0);
        if (!0qQ.A0K(this.A00, jyN.A00) || this.A01 != jyN.A01) {
            return false;
        }
        return true;
    }

    public C61171JyN(C60996Jus jus, boolean z) {
        this.A00 = jus;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewModel(project=");
        A1A.append(this.A00);
        A1A.append(", isSelected=");
        return G9t.A1C(A1A, this.A01);
    }
}
