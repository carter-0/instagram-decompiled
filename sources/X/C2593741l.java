package X;

/* renamed from: X.41l  reason: invalid class name and case insensitive filesystem */
public final class C2593741l implements Runnable {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ AnonymousClass3JC A01;

    public C2593741l(1P0 r1, AnonymousClass3JC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3JC r2 = this.A01;
        boolean isOk = r2.isOk();
        1P0 r1 = this.A00;
        if (!isOk) {
            r1.onFail(new C268674do(r2));
        } else {
            r1.onSuccess(r2);
        }
        r1.onFinish();
    }
}
