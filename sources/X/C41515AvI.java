package X;

/* renamed from: X.AvI  reason: case insensitive filesystem */
public final class C41515AvI extends RuntimeException {
    public final int A00;

    public final String getMessage() {
        String str;
        int i = this.A00;
        if (i == 1) {
            str = "unknown";
        } else if (i == 2) {
            str = AnonymousClass000.A00(3073);
        } else if (i != 100) {
            str = 002.A0c("other(", ")", i);
        } else {
            str = "server_died";
        }
        return 002.A0g(str, ": ", super.getMessage());
    }

    public C41515AvI(int i, String str) {
        super(str);
        this.A00 = i;
    }
}
