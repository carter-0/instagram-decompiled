package X;

/* renamed from: X.N5r  reason: case insensitive filesystem */
public final class C68202N5r extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final N4t A01;
    public final Float A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68202N5r) {
                C68202N5r n5r = (C68202N5r) obj;
                if (!0qQ.A0K(this.A01, n5r.A01) || !0qQ.A0K(this.A03, n5r.A03) || !0qQ.A0K(this.A02, n5r.A02) || this.A00 != n5r.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        N4t n4t = this.A01;
        String str = n4t.A0A;
        if (str == null) {
            return N4t.A00(n4t);
        }
        return str;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31) + this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        N4t n4t;
        C68202N5r n5r = (C68202N5r) obj;
        N4t n4t2 = this.A01;
        if (n5r != null) {
            n4t = n5r.A01;
        } else {
            n4t = null;
        }
        return 0qQ.A0K(n4t2, n4t);
    }

    public C68202N5r(N4t n4t, Float f, String str, int i) {
        this.A01 = n4t;
        this.A03 = str;
        this.A02 = f;
        this.A00 = i;
    }
}
