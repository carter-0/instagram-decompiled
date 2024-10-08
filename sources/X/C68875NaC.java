package X;

/* renamed from: X.NaC  reason: case insensitive filesystem */
public final class C68875NaC extends C331577Rn {
    public final C3266877t A00;
    public final AnonymousClass752 A01;
    public final AnonymousClass79c A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68875NaC) {
                C68875NaC naC = (C68875NaC) obj;
                if (!0qQ.A0K(this.A03, naC.A03) || !0qQ.A0K(this.A02, naC.A02) || !0qQ.A0K(this.A01, naC.A01) || !0qQ.A0K(this.A00, naC.A00)) {
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

    public final String ArN() {
        return this.A04;
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
    public C68875NaC(C3266877t r2, AnonymousClass752 r3, AnonymousClass79c r4, String str) {
        super(r2, r3, r4);
        C51974G9v.A1L(str, r4, r2);
        this.A03 = str;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r4.A05;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
