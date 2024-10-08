package X;

/* renamed from: X.H3m  reason: case insensitive filesystem */
public final class C54217H3m extends C333827aD {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54217H3m) {
                C54217H3m h3m = (C54217H3m) obj;
                if (!0qQ.A0K(this.A02, h3m.A02) || this.A00 != h3m.A00 || this.A03 != h3m.A03 || !0qQ.A0K(this.A01, h3m.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C54217H3m(String str, String str2, int i, boolean z) {
        super(002.A0c("feedback_from_threads_row", str, i));
        this.A02 = str;
        this.A00 = i;
        this.A03 = z;
        this.A01 = str2;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A09(this.A03, (AnonymousClass7TE.A0O(this.A02) + this.A00) * 31));
    }
}
