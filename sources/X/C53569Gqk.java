package X;

/* renamed from: X.Gqk  reason: case insensitive filesystem */
public final class C53569Gqk extends AnonymousClass0T0 implements C59506JMe {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53569Gqk) {
                C53569Gqk gqk = (C53569Gqk) obj;
                if (this.A00 != gqk.A00 || !0qQ.A0K(this.A01, gqk.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AnonymousClass7TG.A0E(this.A01);
    }

    public C53569Gqk(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
