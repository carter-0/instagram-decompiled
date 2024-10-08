package X;

/* renamed from: X.Jy9  reason: case insensitive filesystem */
public final class C61157Jy9 extends AnonymousClass0T0 implements C232262tL {
    public final C56078HsR A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61157Jy9) {
                C61157Jy9 jy9 = (C61157Jy9) obj;
                if (!0qQ.A0K(this.A01, jy9.A01) || !0qQ.A0K(this.A00, jy9.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public /* synthetic */ C61157Jy9(String str) {
        C56078HsR A0P = JTP.A0P(2131973820);
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = A0P;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
