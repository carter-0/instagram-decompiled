package X;

/* renamed from: X.Aq9  reason: case insensitive filesystem */
public final /* synthetic */ class C41211Aq9 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass8HX A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C41211Aq9(AnonymousClass8HX r1, String str, long j, long j2) {
        this.A02 = r1;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void run() {
        AnonymousClass8HX r1 = this.A02;
        String str = this.A03;
        long j = this.A00;
        long j2 = this.A01;
        AnonymousClass8HF r12 = r1.A00;
        if (AnonymousClass8HF.A03(r12, str)) {
            r12.A0H.A00(((float) j) / ((float) j2));
        }
    }
}
