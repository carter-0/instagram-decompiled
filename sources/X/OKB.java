package X;

public final class OKB {
    public final int A00;
    public final String A01;

    public final String toString() {
        return 002.A08(this.A00, "Error{errorCode=", ", errorMessage='", this.A01, "'}");
    }

    public OKB(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
