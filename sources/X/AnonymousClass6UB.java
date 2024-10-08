package X;

/* renamed from: X.6UB  reason: invalid class name */
public final class AnonymousClass6UB implements Runnable {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ 1PX A01;
    public final /* synthetic */ Object A02;

    public AnonymousClass6UB(1P0 r1, 1PX r2, Object obj) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = obj;
    }

    public final void run() {
        1P0 r1 = this.A00;
        r1.onFinish();
        r1.onSuccess(this.A02);
    }
}
