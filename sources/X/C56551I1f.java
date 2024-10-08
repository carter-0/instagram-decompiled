package X;

/* renamed from: X.I1f  reason: case insensitive filesystem */
public final class C56551I1f {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56551I1f) {
                C56551I1f i1f = (C56551I1f) obj;
                if (!0qQ.A0K(this.A00, i1f.A00) || this.A01 != i1f.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0m("ErrorInfo(errorMessage=", this.A00, ", canRetry=", ')', this.A01);
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TG.A0E(this.A00) * 31);
    }

    public C56551I1f(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public C56551I1f() {
        this((String) null, true);
    }
}
