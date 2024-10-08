package X;

/* renamed from: X.N6h  reason: case insensitive filesystem */
public final class C68218N6h extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final C3266877t A00;
    public final C66838MdW A01;
    public final C328707Fv A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68218N6h) {
                C68218N6h n6h = (C68218N6h) obj;
                if (!0qQ.A0K(this.A03, n6h.A03) || !0qQ.A0K(this.A02, n6h.A02) || !0qQ.A0K(this.A01, n6h.A01) || !0qQ.A0K(this.A00, n6h.A00)) {
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

    public C68218N6h(C3266877t r1, C66838MdW mdW, C328707Fv r3, String str) {
        C51974G9v.A1P(str, r3, mdW, r1);
        this.A03 = str;
        this.A02 = r3;
        this.A01 = mdW;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
