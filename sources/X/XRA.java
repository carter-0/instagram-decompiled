package X;

public enum XRA {
    A04("client_action", 0),
    A05("execution_done", 1),
    A06("execution_failed", 2),
    A07("execution_start", 3),
    A08("fetching_cancelled", 4),
    A09("fetching_done", 5),
    A0A("fetching_failed", 6),
    A0B("fetching_start", 7),
    A0C("rendering_done", 8),
    A0D("rendering_failed", 9),
    A0E("screen_generated", 10);
    
    public final C21123XFn A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        XRA[] xraArr;
        A02 = 0oU.A00(xraArr);
    }

    /* access modifiers changed from: public */
    XRA(String str, int i) {
        this.A01 = str;
        this.A00 = r1;
    }
}
