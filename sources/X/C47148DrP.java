package X;

/* renamed from: X.DrP  reason: case insensitive filesystem */
public final class C47148DrP extends AnonymousClass0T0 {
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47148DrP) {
                C47148DrP drP = (C47148DrP) obj;
                if (!0qQ.A0K(this.A01, drP.A01) || !0qQ.A0K(this.A00, drP.A00) || !0qQ.A0K(this.A02, drP.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A02);
    }

    public C47148DrP(Boolean bool, String str, String str2) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
    }
}
