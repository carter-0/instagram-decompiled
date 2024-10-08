package X;

/* renamed from: X.NaG  reason: case insensitive filesystem */
public final class C68879NaG extends C71986OuK {
    public final C328607Fl A00;
    public final C328687Ft A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68879NaG) {
                C68879NaG naG = (C68879NaG) obj;
                if (!0qQ.A0K(this.A02, naG.A02) || !0qQ.A0K(this.A01, naG.A01) || !0qQ.A0K(this.A00, naG.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C328607Fl ApX() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqp() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A02)));
    }

    public C68879NaG(C328607Fl r1, C328687Ft r2, String str) {
        super(r1, r2, str);
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }
}
