package X;

public final class N86 extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final NYR A00;
    public final C3266877t A01;
    public final AnonymousClass752 A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N86) {
                N86 n86 = (N86) obj;
                if (!0qQ.A0K(this.A03, n86.A03) || !0qQ.A0K(this.A00, n86.A00) || !0qQ.A0K(this.A02, n86.A02) || !0qQ.A0K(this.A01, n86.A01)) {
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
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A03))));
    }

    public N86(NYR nyr, C3266877t r2, AnonymousClass752 r3, String str) {
        C51974G9v.A1P(str, nyr, r3, r2);
        this.A03 = str;
        this.A00 = nyr;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ReelShareWithAnimatedStickerMessageViewModel(id=");
        C66583MXo.A1T(A1A, this.A03);
        C66583MXo.A1R(A1A, this.A00);
        C66583MXo.A1P(A1A, this.A02);
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
