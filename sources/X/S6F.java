package X;

public abstract class S6F {
    public long A00 = -1;
    public Integer A01;
    public final String A02;
    public final long A03;

    public final int A00() {
        long j = this.A00;
        if (j != -1) {
            return (int) (j - this.A03);
        }
        throw AnonymousClass7TE.A0w("End timestamp not initialized yet.");
    }

    public final String A01() {
        return this.A02;
    }

    public final String A02() {
        switch (this.A01.intValue()) {
            case 2:
                return "failed";
            case 3:
                return "no_response";
            case 4:
                return "null";
            case 5:
                return "same";
            case 6:
                return "older";
            case 7:
                return "new";
            default:
                return "newer";
        }
    }

    public S6F(String str) {
        this.A02 = str;
        this.A01 = AnonymousClass05K.A0N;
        this.A03 = System.currentTimeMillis();
    }
}
