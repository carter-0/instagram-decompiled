package X;

/* renamed from: X.5Dc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C282445Dc implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass3OV A02;

    public /* synthetic */ C282445Dc(AnonymousClass3OV r1, double d, long j) {
        this.A02 = r1;
        this.A01 = j;
        this.A00 = d;
    }

    public final void run() {
        AnonymousClass3OV r4 = this.A02;
        long j = this.A01;
        double d = this.A00;
        r4.A07(23410213, "DID_SEND_REQUEST", j);
        02m r5 = r4.A0R;
        int i = r4.A0M;
        r5.markerAnnotate(23410213, i, "BANDWIDTH_KBPS", d);
        r5.markerAnnotate(23410213, i, "TRACE_TOKEN", "Stub");
    }
}
