package X;

/* renamed from: X.IdM  reason: case insensitive filesystem */
public final class C57595IdM implements JMY {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57595IdM) {
                C57595IdM idM = (C57595IdM) obj;
                if (!0qQ.A0K(this.A00, idM.A00) || !0qQ.A0K(this.A01, idM.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("IGStoriesCreationInput(mediaUrl=", this.A00, ", text=", this.A01, ')');
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C57595IdM(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
