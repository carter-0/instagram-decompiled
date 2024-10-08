package X;

/* renamed from: X.UNu  reason: case insensitive filesystem */
public final class C15077UNu extends AnonymousClass0T0 implements C232262tL {
    public final C61084JwM A00;
    public final C18416VrL A01;
    public final String A02 = "header";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15077UNu) {
                C15077UNu uNu = (C15077UNu) obj;
                if (!0qQ.A0K(this.A02, uNu.A02) || !0qQ.A0K(this.A00, uNu.A00) || !0qQ.A0K(this.A01, uNu.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C15077UNu(C61084JwM jwM, C18416VrL vrL) {
        this.A00 = jwM;
        this.A01 = vrL;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02)));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61084JwM jwM;
        C15077UNu uNu = (C15077UNu) obj;
        C61084JwM jwM2 = this.A00;
        if (uNu != null) {
            jwM = uNu.A00;
        } else {
            jwM = null;
        }
        return 0qQ.A0K(jwM2, jwM);
    }
}
