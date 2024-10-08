package X;

/* renamed from: X.N6s  reason: case insensitive filesystem */
public final class C68229N6s extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final NYR A00;
    public final NYR A01;
    public final C3266877t A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68229N6s) {
                C68229N6s n6s = (C68229N6s) obj;
                if (!0qQ.A0K(this.A03, n6s.A03) || !0qQ.A0K(this.A01, n6s.A01) || !0qQ.A0K(this.A00, n6s.A00) || !0qQ.A0K(this.A02, n6s.A02)) {
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
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW BmF() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A03);
        return AnonymousClass7TE.A0N(this.A02, (AnonymousClass7TF.A07(this.A01, A0O) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public C68229N6s(NYR nyr, NYR nyr2, C3266877t r3, String str) {
        C51974G9v.A1L(str, nyr, r3);
        this.A03 = str;
        this.A01 = nyr;
        this.A00 = nyr2;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
