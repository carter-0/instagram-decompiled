package X;

/* renamed from: X.N6p  reason: case insensitive filesystem */
public final class C68226N6p extends AnonymousClass0T0 implements C232262tL, AnonymousClass79P {
    public final C3266877t A00;
    public final C328667Fr A01;
    public final C328657Fq A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68226N6p) {
                C68226N6p n6p = (C68226N6p) obj;
                if (!0qQ.A0K(this.A03, n6p.A03) || !0qQ.A0K(this.A02, n6p.A02) || !0qQ.A0K(this.A01, n6p.A01) || !0qQ.A0K(this.A00, n6p.A00)) {
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

    public C68226N6p(C3266877t r1, C328667Fr r2, C328657Fq r3, String str) {
        C51974G9v.A1P(str, r3, r2, r1);
        this.A03 = str;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
