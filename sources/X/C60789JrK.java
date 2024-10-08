package X;

/* renamed from: X.JrK  reason: case insensitive filesystem */
public final class C60789JrK extends C62697Kkx {
    public final String A00;

    public C60789JrK(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C60789JrK) && 0qQ.A0K(this.A00, ((C60789JrK) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return G9w.A0k("Network(message=", this.A00);
    }

    public C60789JrK() {
        this("Unknown");
    }
}
