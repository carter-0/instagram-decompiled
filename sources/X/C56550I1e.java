package X;

/* renamed from: X.I1e  reason: case insensitive filesystem */
public final class C56550I1e {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56550I1e) {
                C56550I1e i1e = (C56550I1e) obj;
                if (!(this.A01 == i1e.A01 && this.A00 == i1e.A00)) {
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

    public C56550I1e(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("InputComposerState(isVisible=");
        A1A.append(this.A01);
        A1A.append(", isDisabled=");
        return G9t.A1C(A1A, this.A00);
    }

    public C56550I1e() {
        this(true, true);
    }
}
