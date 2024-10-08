package X;

/* renamed from: X.NZm  reason: case insensitive filesystem */
public final class C68854NZm extends C71988OuM {
    public final C3266877t A00;
    public final C328667Fr A01;
    public final AnonymousClass79c A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68854NZm) {
                C68854NZm nZm = (C68854NZm) obj;
                if (!0qQ.A0K(this.A03, nZm.A03) || !0qQ.A0K(this.A02, nZm.A02) || !0qQ.A0K(this.A01, nZm.A01) || !0qQ.A0K(this.A00, nZm.A00)) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68854NZm(C3266877t r1, C328667Fr r2, AnonymousClass79c r3, String str) {
        super(r1, r2, r3);
        C51974G9v.A1L(str, r3, r1);
        this.A03 = str;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
