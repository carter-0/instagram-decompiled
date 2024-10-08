package X;

/* renamed from: X.Q1b  reason: case insensitive filesystem */
public final class C7254Q1b {
    public Throwable A00;
    public Throwable A01;

    public static void A00(C7254Q1b q1b, Throwable th) {
        String str;
        Throwable th2 = q1b.A01;
        if (th2 == null) {
            th2 = th;
        }
        q1b.A01 = th2;
        if (q1b.A00 != null) {
            if (th.getMessage() != null) {
                str = th.getMessage();
            } else {
                str = "";
            }
            th = new Throwable(002.A0R(" Exception2: ", str), new Throwable("exception1", q1b.A00));
        }
        q1b.A00 = th;
    }

    public final void A01() {
        Throwable th = this.A01;
        if (th != null) {
            throw th;
        }
    }
}
