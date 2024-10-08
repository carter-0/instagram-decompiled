package X;

/* renamed from: X.5De  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C282465De implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass3OV A02;

    public /* synthetic */ C282465De(AnonymousClass3OV r1, int i, long j) {
        this.A02 = r1;
        this.A01 = j;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass3OV r5 = this.A02;
        long j = this.A01;
        int i = this.A00;
        r5.A07(23410213, "REQUEST_SENT_TO_NETWORK_INFRA", j);
        r5.A0R.markerAnnotate(23410213, r5.A0M, "NETWORK_REQUEST_ID", String.valueOf(i));
    }
}
