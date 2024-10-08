package X;

public final class N7T extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final NYR A00;
    public final C3266877t A01;
    public final C66851Mdk A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N7T) {
                N7T n7t = (N7T) obj;
                if (!0qQ.A0K(this.A03, n7t.A03) || !0qQ.A0K(this.A02, n7t.A02) || !0qQ.A0K(this.A00, n7t.A00) || !0qQ.A0K(this.A01, n7t.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqu() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C328617Fm Ar3() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW BmF() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A03);
        return AnonymousClass7TE.A0N(this.A01, (AnonymousClass7TF.A07(this.A02, A0O) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public N7T(NYR nyr, C3266877t r2, C66851Mdk mdk, String str) {
        C51974G9v.A1L(str, mdk, r2);
        this.A03 = str;
        this.A02 = mdk;
        this.A00 = nyr;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
