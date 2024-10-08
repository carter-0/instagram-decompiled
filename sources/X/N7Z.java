package X;

public final class N7Z extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final C3266877t A00;
    public final C66851Mdk A01;
    public final C328657Fq A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N7Z) {
                N7Z n7z = (N7Z) obj;
                if (!0qQ.A0K(this.A03, n7z.A03) || !0qQ.A0K(this.A01, n7z.A01) || !0qQ.A0K(this.A02, n7z.A02) || !0qQ.A0K(this.A00, n7z.A00)) {
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

    public N7Z(C3266877t r1, C66851Mdk mdk, C328657Fq r3, String str) {
        C51974G9v.A1L(str, mdk, r1);
        this.A03 = str;
        this.A01 = mdk;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
