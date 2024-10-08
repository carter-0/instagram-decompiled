package X;

public final class Na6 extends C71983OuF {
    public final NYY A00;
    public final String A01;
    public final C328607Fl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Na6) {
                Na6 na6 = (Na6) obj;
                if (!0qQ.A0K(this.A01, na6.A01) || !0qQ.A0K(this.A00, na6.A00) || !0qQ.A0K(this.A02, na6.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C328607Fl ApX() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqp() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public Na6(C328607Fl r1, NYY nyy, String str) {
        super(r1, nyy);
        this.A01 = str;
        this.A00 = nyy;
        this.A02 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
