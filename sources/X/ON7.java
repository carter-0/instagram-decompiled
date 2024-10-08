package X;

public final class ON7 {
    public final String A00;

    public final boolean equals(Object obj) {
        if (obj instanceof ON7) {
            return this.A00.equals(((ON7) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public ON7(String str) {
        this.A00 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StringHeaderFactory{value='");
        A1A.append(this.A00);
        A1A.append('\'');
        return C51967G9n.A0r(A1A, '}');
    }
}
