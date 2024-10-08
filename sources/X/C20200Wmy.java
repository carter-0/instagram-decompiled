package X;

/* renamed from: X.Wmy  reason: case insensitive filesystem */
public final class C20200Wmy implements Runnable {
    public final /* synthetic */ C15326UaZ A00;
    public final /* synthetic */ AnonymousClass80D A01;

    public C20200Wmy(C15326UaZ uaZ, AnonymousClass80D r2) {
        this.A00 = uaZ;
        this.A01 = r2;
    }

    public final void run() {
        C15326UaZ uaZ = this.A00;
        if (uaZ.mView != null) {
            AnonymousClass80Q r1 = new AnonymousClass80Q(this.A01);
            uaZ.A01 = r1;
            if (uaZ.isResumed()) {
                r1.A01();
            }
        }
    }
}
