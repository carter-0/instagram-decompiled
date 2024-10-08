package X;

/* renamed from: X.Dse  reason: case insensitive filesystem */
public final class C47192Dse extends AnonymousClass0T0 implements G8R {
    public final C47163Dre A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47192Dse) {
                C47192Dse dse = (C47192Dse) obj;
                if (!0qQ.A0K(this.A01, dse.A01) || !0qQ.A0K(this.A00, dse.A00) || !0qQ.A0K(this.A02, dse.A02)) {
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

    public C47192Dse(C47163Dre dre, String str, String str2) {
        this.A01 = str;
        this.A00 = dre;
        this.A02 = str2;
    }
}
