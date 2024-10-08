package X;

/* renamed from: X.9NL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9NL implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass3OV A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass9NL(AnonymousClass3OV r1, String str, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = str;
    }

    public final void run() {
        AnonymousClass3OV r5 = this.A01;
        long j = this.A00;
        AnonymousClass3OV.A06(r5, r5.A0W, this.A02, 23410213, j);
        AnonymousClass3OV.A01(r5, 23410213, j);
        02m r4 = r5.A0R;
        int i = r5.A0M;
        C246573ep r2 = r5.A0P;
        r4.markerAnnotate(23410213, i, "USER_SAMPLE_RATE", r2.A01);
        r4.markerAnnotate(23410213, i, "IG_FETCHED_SAMPLING_RATE", r2.A00);
        AnonymousClass3OV.A00(r5, 23410213);
    }
}
