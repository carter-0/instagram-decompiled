package X;

/* renamed from: X.Hsk  reason: case insensitive filesystem */
public final class C56097Hsk {
    public final String A00;
    public final String A01;

    public C56097Hsk(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56097Hsk) {
                C56097Hsk hsk = (C56097Hsk) obj;
                if (!0qQ.A0K(this.A01, hsk.A01) || !0qQ.A0K(this.A00, hsk.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("WriteSuggestion(text=", this.A01, ", suggestionId=", this.A00, ')');
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A00);
    }
}
