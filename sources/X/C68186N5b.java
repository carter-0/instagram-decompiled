package X;

/* renamed from: X.N5b  reason: case insensitive filesystem */
public final class C68186N5b extends AnonymousClass0T0 implements C232262tL {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68186N5b) {
                C68186N5b n5b = (C68186N5b) obj;
                if (!0qQ.A0K(this.A00, n5b.A00) || !0qQ.A0K(this.A01, n5b.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C68186N5b(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
