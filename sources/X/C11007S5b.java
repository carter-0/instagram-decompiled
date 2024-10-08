package X;

/* renamed from: X.S5b  reason: case insensitive filesystem */
public final class C11007S5b {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11007S5b) {
                C11007S5b s5b = (C11007S5b) obj;
                if (!0qQ.A0K(this.A01, s5b.A01) || !0qQ.A0K(this.A00, s5b.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("UpdateContactIdParams(oldId=", this.A01, ", newId=", this.A00, ')');
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C11007S5b(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
