package X;

public final class Gq8 extends AnonymousClass0T0 implements JM3 {
    public final String A00 = "creator_ai_deletion_progress";
    public final String A01;
    public final boolean A02 = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Gq8) {
                Gq8 gq8 = (Gq8) obj;
                if (!0qQ.A0K(this.A01, gq8.A01) || !0qQ.A0K(this.A00, gq8.A00) || this.A02 != gq8.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Gq8(String str) {
        this.A01 = str;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }
}
