package X;

public final class N6F extends AnonymousClass0T0 implements C232262tL, C328627Fn {
    public final NYN A00;
    public final String A01;
    public final C328607Fl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N6F) {
                N6F n6f = (N6F) obj;
                if (!0qQ.A0K(this.A01, n6f.A01) || !0qQ.A0K(this.A00, n6f.A00) || !0qQ.A0K(this.A02, n6f.A02)) {
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

    public N6F(C328607Fl r1, NYN nyn, String str) {
        this.A01 = str;
        this.A00 = nyn;
        this.A02 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
