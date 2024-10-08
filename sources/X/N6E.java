package X;

public final class N6E extends AnonymousClass0T0 implements C232262tL, C328627Fn {
    public final C328707Fv A00;
    public final String A01;
    public final C328607Fl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N6E) {
                N6E n6e = (N6E) obj;
                if (!0qQ.A0K(this.A01, n6e.A01) || !0qQ.A0K(this.A00, n6e.A00) || !0qQ.A0K(this.A02, n6e.A02)) {
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

    public N6E(C328607Fl r1, C328707Fv r2, String str) {
        this.A01 = str;
        this.A00 = r2;
        this.A02 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
