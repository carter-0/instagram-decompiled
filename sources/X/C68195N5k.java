package X;

/* renamed from: X.N5k  reason: case insensitive filesystem */
public final class C68195N5k extends AnonymousClass0T0 implements C232262tL {
    public final C61077JwF A00;
    public final C61064Jw2 A01;
    public final C68137N2b A02;

    public C68195N5k(C61077JwF jwF, C61064Jw2 jw2, C68137N2b n2b) {
        0qQ.A0B(n2b, 1);
        this.A02 = n2b;
        this.A01 = jw2;
        this.A00 = jwF;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68195N5k) {
                C68195N5k n5k = (C68195N5k) obj;
                if (!0qQ.A0K(this.A02, n5k.A02) || !0qQ.A0K(this.A01, n5k.A01) || !0qQ.A0K(this.A00, n5k.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A01.A05;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02)) + AnonymousClass7TG.A0C(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
