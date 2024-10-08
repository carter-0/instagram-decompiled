package X;

public final class N7F extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final C3266877t A00;
    public final C328677Fs A01;
    public final C68819NYd A02;
    public final String A03;

    public N7F(C3266877t r2, C328677Fs r3, C68819NYd nYd, String str) {
        0qQ.A0B(r3, 2);
        this.A03 = str;
        this.A01 = r3;
        this.A02 = nYd;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N7F) {
                N7F n7f = (N7F) obj;
                if (!0qQ.A0K(this.A03, n7f.A03) || !0qQ.A0K(this.A01, n7f.A01) || !0qQ.A0K(this.A02, n7f.A02) || !0qQ.A0K(this.A00, n7f.A00)) {
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

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
