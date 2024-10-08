package X;

public final class N7H extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final C3266877t A00;
    public final C328677Fs A01;
    public final C328657Fq A02;
    public final String A03;

    public N7H(C3266877t r2, C328677Fs r3, C328657Fq r4, String str) {
        0qQ.A0B(r3, 2);
        this.A03 = str;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N7H) {
                N7H n7h = (N7H) obj;
                if (!0qQ.A0K(this.A03, n7h.A03) || !0qQ.A0K(this.A01, n7h.A01) || !0qQ.A0K(this.A02, n7h.A02) || !0qQ.A0K(this.A00, n7h.A00)) {
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
