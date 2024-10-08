package X;

/* renamed from: X.N6v  reason: case insensitive filesystem */
public final class C68232N6v extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final NYR A00;
    public final C3266877t A01;
    public final AnonymousClass79c A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68232N6v) {
                C68232N6v n6v = (C68232N6v) obj;
                if (!0qQ.A0K(this.A03, n6v.A03) || !0qQ.A0K(this.A00, n6v.A00) || !0qQ.A0K(this.A02, n6v.A02) || !0qQ.A0K(this.A01, n6v.A01)) {
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
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW BmF() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A03);
        return AnonymousClass7TE.A0N(this.A01, (AnonymousClass7TF.A07(this.A00, A0O) + AnonymousClass7TG.A0C(this.A02)) * 31);
    }

    public C68232N6v(NYR nyr, C3266877t r2, AnonymousClass79c r3, String str) {
        C51974G9v.A1L(str, nyr, r2);
        this.A03 = str;
        this.A00 = nyr;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
