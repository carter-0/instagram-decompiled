package X;

/* renamed from: X.N8z  reason: case insensitive filesystem */
public final class C68286N8z extends AnonymousClass0T0 implements C74269Prx {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68286N8z) {
                C68286N8z n8z = (C68286N8z) obj;
                if (!(this.A01 == n8z.A01 && this.A00 == n8z.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A00, C51965G9l.A05(this.A01));
    }

    public C68286N8z(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
