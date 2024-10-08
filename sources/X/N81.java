package X;

public final class N81 extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final C3266877t A00;
    public final C328667Fr A01;
    public final C328667Fr A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N81) {
                N81 n81 = (N81) obj;
                if (!0qQ.A0K(this.A03, n81.A03) || !0qQ.A0K(this.A02, n81.A02) || !0qQ.A0K(this.A01, n81.A01) || !0qQ.A0K(this.A00, n81.A00)) {
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
        int A0O = AnonymousClass7TE.A0O(this.A03);
        return AnonymousClass7TE.A0N(this.A00, (AnonymousClass7TF.A07(this.A02, A0O) + AnonymousClass7TG.A0C(this.A01)) * 31);
    }

    public N81(C3266877t r1, C328667Fr r2, C328667Fr r3, String str) {
        C51974G9v.A1L(str, r2, r1);
        this.A03 = str;
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("XmaReplyToNotesXmaViewModel(id=");
        C66583MXo.A1T(A1A, this.A03);
        C66583MXo.A1R(A1A, this.A02);
        C66583MXo.A1P(A1A, this.A01);
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
