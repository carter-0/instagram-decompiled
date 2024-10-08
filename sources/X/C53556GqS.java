package X;

/* renamed from: X.GqS  reason: case insensitive filesystem */
public final class C53556GqS extends AnonymousClass0T0 implements C66459MSn {
    public final C61083JwL A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53556GqS) {
                C53556GqS gqS = (C53556GqS) obj;
                if (!0qQ.A0K(this.A02, gqS.A02) || !0qQ.A0K(this.A00, gqS.A00) || !0qQ.A0K(this.A01, gqS.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C61083JwL C4l() {
        return this.A00;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02)));
    }

    public C53556GqS(C61083JwL jwL, String str, String str2) {
        AnonymousClass7TG.A1U(str, jwL, str2);
        this.A02 = str;
        this.A00 = jwL;
        this.A01 = str2;
    }
}
