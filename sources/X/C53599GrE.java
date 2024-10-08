package X;

/* renamed from: X.GrE  reason: case insensitive filesystem */
public final class C53599GrE extends AnonymousClass0T0 implements JNI {
    public final C266444Yx A00;
    public final String A01;

    public C53599GrE(C266444Yx r2, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53599GrE) {
                C53599GrE grE = (C53599GrE) obj;
                if (!0qQ.A0K(this.A01, grE.A01) || !0qQ.A0K(this.A00, grE.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }
}
