package X;

public final class TEC implements Runnable {
    public final /* synthetic */ C62320sa A00;

    public TEC(C62320sa r1) {
        this.A00 = r1;
    }

    public final void run() {
        C60340gF r0;
        C11104SAf sAf = C8834RBs.A00;
        try {
            this.A00.invoke();
            r0 = C60340gF.A00;
        } catch (Throwable th) {
            r0 = JTO.A1B(th);
        }
        Throwable A002 = 0eR.A00(r0);
        if (A002 != null) {
            0KC.A0F("VideoRenderLatencyMarkerLoggerAsync", "error", A002);
            AnonymousClass7TG.A1I(0wj.A01, "video_latency_qpl_event_error", A002, 817901174);
        }
    }
}
