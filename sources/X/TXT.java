package X;

public final class TXT extends 0Yg implements 0sP {
    public static final TXT A00 = new TXT();

    public TXT() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        0qQ.A0B(th, 0);
        String message = th.getMessage();
        if (message == null) {
            return "UNKNOWN";
        }
        return message;
    }
}
