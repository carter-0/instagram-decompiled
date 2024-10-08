package X;

/* renamed from: X.I1g  reason: case insensitive filesystem */
public final class C56552I1g {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56552I1g) {
                C56552I1g i1g = (C56552I1g) obj;
                if (!(this.A00 == i1g.A00 && this.A01 == i1g.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, (C51965G9l.A05(this.A00) + 1231) * 31);
    }

    public C56552I1g(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WriteWithAIUIConfig(forceDarkMode=");
        A1A.append(this.A00);
        A1A.append(", isPillVisible=");
        A1A.append(true);
        A1A.append(", isComposerVisible=");
        return G9t.A1C(A1A, this.A01);
    }

    public C56552I1g() {
        this(false, true);
    }
}
