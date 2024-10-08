package X;

public final class N7R extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final C3266877t A00;
    public final AnonymousClass79c A01;
    public final C68819NYd A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N7R) {
                N7R n7r = (N7R) obj;
                if (!0qQ.A0K(this.A03, n7r.A03) || !0qQ.A0K(this.A01, n7r.A01) || !0qQ.A0K(this.A02, n7r.A02) || !0qQ.A0K(this.A00, n7r.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqu() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ C328617Fm Ar3() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW BmF() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A03);
        return AnonymousClass7TE.A0N(this.A00, (AnonymousClass7TF.A07(this.A01, A0O) + AnonymousClass7TG.A0C(this.A02)) * 31);
    }

    public N7R(C3266877t r1, AnonymousClass79c r2, C68819NYd nYd, String str) {
        C51974G9v.A1L(str, r2, r1);
        this.A03 = str;
        this.A01 = r2;
        this.A02 = nYd;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
