package X;

public final class N87 extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final C3266877t A00;
    public final C328707Fv A01;
    public final AnonymousClass752 A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N87) {
                N87 n87 = (N87) obj;
                if (!0qQ.A0K(this.A03, n87.A03) || !0qQ.A0K(this.A01, n87.A01) || !0qQ.A0K(this.A02, n87.A02) || !0qQ.A0K(this.A00, n87.A00)) {
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
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A03))));
    }

    public N87(C3266877t r1, C328707Fv r2, AnonymousClass752 r3, String str) {
        C51974G9v.A1P(str, r2, r3, r1);
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ReelShareWithGifMessageViewModel(id=");
        C66583MXo.A1T(A1A, this.A03);
        C66583MXo.A1R(A1A, this.A01);
        C66583MXo.A1P(A1A, this.A02);
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
