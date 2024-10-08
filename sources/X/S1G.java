package X;

public final class S1G {
    public final int A00;
    public final String A01;

    public S1G(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public final String toString() {
        return 002.A07(this.A00, "topic:", this.A01, " messageId:");
    }
}
