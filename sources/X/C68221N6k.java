package X;

/* renamed from: X.N6k  reason: case insensitive filesystem */
public final class C68221N6k extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final C3266877t A00;
    public final C66838MdW A01;
    public final NYP A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68221N6k) {
                C68221N6k n6k = (C68221N6k) obj;
                if (!0qQ.A0K(this.A03, n6k.A03) || !0qQ.A0K(this.A02, n6k.A02) || !0qQ.A0K(this.A01, n6k.A01) || !0qQ.A0K(this.A00, n6k.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqu() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C328617Fm Ar3() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW BmF() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A03))));
    }

    public C68221N6k(C3266877t r1, C66838MdW mdW, NYP nyp, String str) {
        C51974G9v.A1P(str, nyp, mdW, r1);
        this.A03 = str;
        this.A02 = nyp;
        this.A01 = mdW;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
