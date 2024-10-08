package X;

/* renamed from: X.BEh  reason: case insensitive filesystem */
public final class C42032BEh extends AnonymousClass0T0 implements JRY {
    public final C241303Or A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42032BEh) {
                C42032BEh bEh = (C42032BEh) obj;
                if (!0qQ.A0K(this.A01, bEh.A01) || !0qQ.A0K(this.A00, bEh.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C42032BEh(C241303Or r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
