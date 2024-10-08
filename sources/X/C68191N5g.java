package X;

/* renamed from: X.N5g  reason: case insensitive filesystem */
public final class C68191N5g extends AnonymousClass0T0 implements C232262tL {
    public final C69359Njz A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68191N5g) {
                C68191N5g n5g = (C68191N5g) obj;
                if (!0qQ.A0K(this.A01, n5g.A01) || this.A00 != n5g.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        0qQ.A0B(obj, 0);
        return obj.equals(this);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C68191N5g(C69359Njz njz, String str) {
        this.A01 = str;
        this.A00 = njz;
    }
}
