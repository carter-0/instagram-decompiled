package X;

/* renamed from: X.NXi  reason: case insensitive filesystem */
public final class C68798NXi extends AnonymousClass7PJ {
    public final NO3 A00;
    public final C68049MzG A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68798NXi(NO3 no3, C68049MzG mzG) {
        super(mzG, no3);
        0qQ.A0B(no3, 2);
        this.A01 = mzG;
        this.A00 = no3;
    }

    public final boolean A02() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68798NXi) {
                C68798NXi nXi = (C68798NXi) obj;
                if (!0qQ.A0K(this.A01, nXi.A01) || !0qQ.A0K(this.A00, nXi.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }
}
