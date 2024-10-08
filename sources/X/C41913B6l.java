package X;

/* renamed from: X.B6l  reason: case insensitive filesystem */
public final class C41913B6l extends AnonymousClass0T0 {
    public final boolean A00;
    public final String A01;

    public C41913B6l(String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41913B6l) {
                C41913B6l b6l = (C41913B6l) obj;
                if (!0qQ.A0K(this.A01, b6l.A01) || this.A00 != b6l.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A01);
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return A0O + i;
    }
}
