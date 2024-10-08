package X;

public final class N6Y extends AnonymousClass0T0 implements C232262tL, C328627Fn, AnonymousClass7FW {
    public final C328717Fw A00;
    public final String A01;
    public final C328607Fl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N6Y) {
                N6Y n6y = (N6Y) obj;
                if (!0qQ.A0K(this.A01, n6y.A01) || !0qQ.A0K(this.A00, n6y.A00) || !0qQ.A0K(this.A02, n6y.A02)) {
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

    public N6Y(C328717Fw r1, C328607Fl r2, String str) {
        this.A01 = str;
        this.A00 = r1;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
