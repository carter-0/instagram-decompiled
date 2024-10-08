package X;

/* renamed from: X.N5e  reason: case insensitive filesystem */
public final class C68189N5e extends AnonymousClass0T0 implements C232262tL {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68189N5e) {
                C68189N5e n5e = (C68189N5e) obj;
                if (!0qQ.A0K(this.A00, n5e.A00) || this.A01 != n5e.A01) {
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
        return DbS.A06(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C68189N5e(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return 0qQ.A0K(obj, this);
    }
}
