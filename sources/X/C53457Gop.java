package X;

/* renamed from: X.Gop  reason: case insensitive filesystem */
public final class C53457Gop extends AnonymousClass0T0 implements JSD {
    public final int A00;
    public final String A01;

    public C53457Gop(String str, int i) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public final C53457Gop F76() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53457Gop) {
                C53457Gop gop = (C53457Gop) obj;
                if (!0qQ.A0K(this.A01, gop.A01) || this.A00 != gop.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Ayq() {
        return this.A01;
    }

    public final int B1y() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + this.A00;
    }
}
