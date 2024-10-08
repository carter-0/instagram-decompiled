package X;

/* renamed from: X.7nN  reason: invalid class name and case insensitive filesystem */
public final class C341697nN implements Runnable {
    public final /* synthetic */ C341667nK A00;

    public C341697nN(C341667nK r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.9dU, X.9tX] */
    public final void run() {
        C349257zq.A03("checkIfAnySamplesReceived");
        C341667nK r6 = this.A00;
        C39676A4s a4s = r6.A00;
        if (r6.A0E && r6.A02.compareAndSet(false, true)) {
            r6.A0E = false;
            if (a4s != null) {
                ? r4 = new C391719tX("Timeout while waiting for first samples for muxing", (Throwable) null, 21003);
                r4.A00("muxer_first_samples_written", 002.A1C("v", "_a", r6.A0D, r6.A0C));
                r4.A00("muxer_has_started", String.valueOf(true));
                r6.A08.post(new C41115Aob(r4, a4s, r6));
            }
        }
    }
}
