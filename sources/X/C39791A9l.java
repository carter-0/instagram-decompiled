package X;

/* renamed from: X.A9l  reason: case insensitive filesystem */
public final class C39791A9l {
    public C291665hg A00 = null;
    public String A01;
    public boolean A02 = false;
    public final String A03;

    public C39791A9l(String str, String str2) {
        this.A03 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39791A9l) {
                C39791A9l a9l = (C39791A9l) obj;
                if (!0qQ.A0K(this.A03, a9l.A03) || !0qQ.A0K(this.A01, a9l.A01) || this.A02 != a9l.A02 || !0qQ.A0K(this.A00, a9l.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A03))) + AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TextSubstitution(layoutCache=");
        A1A.append(this.A00);
        A1A.append(", isShowingSubstitution=");
        A1A.append(this.A02);
        return AnonymousClass7TG.A0p(A1A);
    }
}
