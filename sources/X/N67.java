package X;

public final class N67 extends AnonymousClass0T0 implements C232262tL, C328627Fn {
    public final NYH A00;
    public final String A01;
    public final C328607Fl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N67) {
                N67 n67 = (N67) obj;
                if (!0qQ.A0K(this.A01, n67.A01) || !0qQ.A0K(this.A00, n67.A00) || !0qQ.A0K(this.A02, n67.A02)) {
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

    public N67(NYH nyh, C328607Fl r2, String str) {
        this.A01 = str;
        this.A00 = nyh;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
