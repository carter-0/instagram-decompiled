package X;

/* renamed from: X.7bk  reason: invalid class name and case insensitive filesystem */
public final class C334707bk extends AnonymousClass0T0 implements C334127ai {
    public final int A00;
    public final C61084JwM A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334707bk) {
                C334707bk r5 = (C334707bk) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    public C334707bk(C61084JwM jwM, int i) {
        this.A00 = i;
        this.A01 = jwM;
    }
}
