package X;

/* renamed from: X.WSm  reason: case insensitive filesystem */
public final class C19279WSm implements C232262tL {
    public final UL9 A00;
    public final String A01;

    public C19279WSm(C56078HsR hsR, C56078HsR hsR2, String str) {
        0qQ.A0B(str, 1);
        UL9 ul9 = new UL9(hsR, hsR2);
        this.A01 = str;
        this.A00 = ul9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19279WSm) {
            C19279WSm wSm = (C19279WSm) obj;
            if (!0qQ.A0K(this.A01, wSm.A01) || !0qQ.A0K(this.A00, wSm.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A01, this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19279WSm wSm = (C19279WSm) obj;
        if (wSm == null || !0qQ.A0K(this.A00, wSm.A00)) {
            return false;
        }
        return true;
    }

    public C19279WSm() {
        String A0b = AnonymousClass7TF.A0b();
        UL9 ul9 = new UL9((C56078HsR) null, (C56078HsR) null);
        0qQ.A0B(A0b, 1);
        this.A01 = A0b;
        this.A00 = ul9;
    }
}
