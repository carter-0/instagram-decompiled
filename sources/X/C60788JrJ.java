package X;

/* renamed from: X.JrJ  reason: case insensitive filesystem */
public final class C60788JrJ extends C62697Kkx {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C60788JrJ) && 0qQ.A0K(this.A00, ((C60788JrJ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return G9w.A0k("InvalidResponse(message=", this.A00);
    }

    public C60788JrJ(String str) {
        this.A00 = str;
    }

    public C60788JrJ() {
        this("Unknown");
    }
}
