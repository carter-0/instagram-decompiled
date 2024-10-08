package X;

public final class N5X extends AnonymousClass0T0 implements C232262tL {
    public final AnonymousClass7L2 A00;
    public final String A01;

    public N5X(AnonymousClass7L2 r2, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5X) {
                N5X n5x = (N5X) obj;
                if (!0qQ.A0K(this.A01, n5x.A01) || !0qQ.A0K(this.A00, n5x.A00)) {
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

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
