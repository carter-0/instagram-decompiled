package X;

/* renamed from: X.4m6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C273174m6 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass3OV A02;

    public /* synthetic */ C273174m6(AnonymousClass3OV r1, long j, long j2) {
        this.A02 = r1;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void run() {
        AnonymousClass3OV r3 = this.A02;
        long j = this.A00;
        long j2 = this.A01;
        r3.A07(23410213, "MERGED_REQUEST", j);
        r3.A0R.markerAnnotate(23410213, r3.A0M, "TIME_SINCE_TASK_CREATED", j2);
    }
}
