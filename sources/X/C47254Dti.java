package X;

/* renamed from: X.Dti  reason: case insensitive filesystem */
public final class C47254Dti extends AnonymousClass0T0 implements C51860G4s {
    public final C266444Yx A00;
    public final C266444Yx A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47254Dti) {
                C47254Dti dti = (C47254Dti) obj;
                if (!0qQ.A0K(this.A01, dti.A01) || !0qQ.A0K(this.A00, dti.A00)) {
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

    public C47254Dti(C266444Yx r1, C266444Yx r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
