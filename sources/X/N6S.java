package X;

public final class N6S extends AnonymousClass0T0 implements C232262tL, C328627Fn {
    public final N8K A00;
    public final String A01;
    public final C328607Fl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N6S) {
                N6S n6s = (N6S) obj;
                if (!0qQ.A0K(this.A01, n6s.A01) || !0qQ.A0K(this.A00, n6s.A00) || !0qQ.A0K(this.A02, n6s.A02)) {
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

    public N6S(C328607Fl r1, N8K n8k, String str) {
        this.A01 = str;
        this.A00 = n8k;
        this.A02 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GenericHscrollXmaMessageViewModel(id=");
        C66583MXo.A1S(A1A, this.A01);
        C66583MXo.A1Q(A1A, this.A00);
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
