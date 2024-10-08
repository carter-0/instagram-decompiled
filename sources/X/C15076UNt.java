package X;

/* renamed from: X.UNt  reason: case insensitive filesystem */
public final class C15076UNt extends AnonymousClass0T0 implements C232262tL {
    public final C61080JwI A00;
    public final C18415VrK A01;
    public final String A02 = "footer";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15076UNt) {
                C15076UNt uNt = (C15076UNt) obj;
                if (!0qQ.A0K(this.A02, uNt.A02) || !0qQ.A0K(this.A00, uNt.A00) || !0qQ.A0K(this.A01, uNt.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C15076UNt(C61080JwI jwI, C18415VrK vrK) {
        this.A00 = jwI;
        this.A01 = vrK;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02)));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61080JwI jwI;
        C15076UNt uNt = (C15076UNt) obj;
        C61080JwI jwI2 = this.A00;
        if (uNt != null) {
            jwI = uNt.A00;
        } else {
            jwI = null;
        }
        return 0qQ.A0K(jwI2, jwI);
    }
}
