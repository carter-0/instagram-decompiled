package X;

/* renamed from: X.NaF  reason: case insensitive filesystem */
public final class C68878NaF extends C71986OuK {
    public final C328687Ft A00;
    public final C328607Fl A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68878NaF) {
                C68878NaF naF = (C68878NaF) obj;
                if (!0qQ.A0K(this.A02, naF.A02) || !0qQ.A0K(this.A00, naF.A00) || !0qQ.A0K(this.A01, naF.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C328607Fl ApX() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqp() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02)));
    }

    public C68878NaF(C328607Fl r1, C328687Ft r2, String str) {
        super(r1, r2, str);
        this.A02 = str;
        this.A00 = r2;
        this.A01 = r1;
    }
}
