package X;

/* renamed from: X.TBt  reason: case insensitive filesystem */
public final class C12879TBt implements Runnable {
    public final /* synthetic */ 26B A00;

    public C12879TBt(26B r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass450 r1 = this.A00.A02;
        if (r1 != null) {
            synchronized (r1) {
                r1.A04.A01();
            }
        }
    }
}
