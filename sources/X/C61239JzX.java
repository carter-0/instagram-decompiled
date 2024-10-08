package X;

/* renamed from: X.JzX  reason: case insensitive filesystem */
public final class C61239JzX extends AnonymousClass0T0 implements C66459MSn {
    public final C61083JwL A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61239JzX) {
                C61239JzX jzX = (C61239JzX) obj;
                if (!0qQ.A0K(this.A01, jzX.A01) || !0qQ.A0K(this.A00, jzX.A00)) {
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
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C61239JzX(C61083JwL jwL, String str) {
        AnonymousClass7TG.A1O(str, jwL);
        this.A01 = str;
        this.A00 = jwL;
    }
}
