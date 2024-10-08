package X;

public final class M1X implements Comparable {
    public final String A00;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00.compareTo(((M1X) obj).A00);
    }

    public M1X(String str) {
        this.A00 = str;
    }
}
