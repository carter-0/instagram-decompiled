package X;

/* renamed from: X.N5d  reason: case insensitive filesystem */
public final class C68188N5d extends AnonymousClass0T0 implements C232262tL {
    public final C69618Np0 A00;
    public final String A01;

    public C68188N5d(C69618Np0 np0, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = np0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68188N5d) {
                C68188N5d n5d = (C68188N5d) obj;
                if (!0qQ.A0K(this.A01, n5d.A01) || !0qQ.A0K(this.A00, n5d.A00)) {
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
