package X;

/* renamed from: X.Wn5  reason: case insensitive filesystem */
public final class C20205Wn5 implements Runnable {
    public final /* synthetic */ AnonymousClass80D A00;
    public final /* synthetic */ C15288UZt A01;

    public C20205Wn5(AnonymousClass80D r1, C15288UZt uZt) {
        this.A01 = uZt;
        this.A00 = r1;
    }

    public final void run() {
        C15288UZt uZt = this.A01;
        if (uZt.mView != null) {
            AnonymousClass80Q r1 = new AnonymousClass80Q(this.A00);
            uZt.A01 = r1;
            if (uZt.isResumed()) {
                r1.A01();
            }
        }
    }
}
