package X;

public final class LKF {
    public static final void A00(Throwable th) {
        if (th != null) {
            0wb r3 = 0wb.A01;
            String message = th.getMessage();
            if (message == null) {
                message = "null_message";
            }
            r3.Ew6("ig_media_creation_broadcast_trace", message, 1, th);
        }
    }
}
