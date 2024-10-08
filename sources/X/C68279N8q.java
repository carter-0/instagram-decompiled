package X;

/* renamed from: X.N8q  reason: case insensitive filesystem */
public final class C68279N8q extends AnonymousClass0T0 implements JM9 {
    public final N4t A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68279N8q) {
                C68279N8q n8q = (C68279N8q) obj;
                if (!0qQ.A0K(this.A00, n8q.A00) || !0qQ.A0K(this.A01, n8q.A01) || this.A03 != n8q.A03 || this.A02 != n8q.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A08(this.A01, AnonymousClass7TG.A0C(this.A00) * 31)));
    }

    public C68279N8q(N4t n4t, String str, boolean z, boolean z2) {
        this.A00 = n4t;
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
    }

    public C68279N8q() {
        this((N4t) null, "", false, false);
    }
}
