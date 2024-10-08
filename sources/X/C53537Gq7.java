package X;

/* renamed from: X.Gq7  reason: case insensitive filesystem */
public final class C53537Gq7 extends AnonymousClass0T0 implements JM3 {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53537Gq7) {
                C53537Gq7 gq7 = (C53537Gq7) obj;
                if (this.A00 != gq7.A00 || !0qQ.A0K(this.A01, gq7.A01)) {
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

    public C53537Gq7(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
