package X;

public final class TRR extends Throwable {
    public final String A00;

    public TRR(String str) {
        super("Failed live location update due to expired session");
        this.A00 = str;
    }
}
