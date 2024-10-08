package X;

/* renamed from: X.N6l  reason: case insensitive filesystem */
public final class C68222N6l extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final C3266877t A00;
    public final C66838MdW A01;
    public final AnonymousClass79c A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68222N6l) {
                C68222N6l n6l = (C68222N6l) obj;
                if (!0qQ.A0K(this.A03, n6l.A03) || !0qQ.A0K(this.A02, n6l.A02) || !0qQ.A0K(this.A01, n6l.A01) || !0qQ.A0K(this.A00, n6l.A00)) {
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

    public C68222N6l(C3266877t r1, C66838MdW mdW, AnonymousClass79c r3, String str) {
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
