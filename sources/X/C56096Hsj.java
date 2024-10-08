package X;

/* renamed from: X.Hsj  reason: case insensitive filesystem */
public final class C56096Hsj {
    public final int A00;
    public final C56097Hsk A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56096Hsj) {
                C56096Hsj hsj = (C56096Hsj) obj;
                if (this.A00 != hsj.A00 || !0qQ.A0K(this.A01, hsj.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, this.A00 * 31);
    }

    public C56096Hsj(C56097Hsk hsk, int i) {
        this.A00 = i;
        this.A01 = hsk;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SuggestionStream(index=");
        A1A.append(this.A00);
        A1A.append(", suggestion=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
