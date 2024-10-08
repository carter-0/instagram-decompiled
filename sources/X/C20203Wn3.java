package X;

/* renamed from: X.Wn3  reason: case insensitive filesystem */
public final class C20203Wn3 implements Runnable {
    public final /* synthetic */ AnonymousClass80D A00;
    public final /* synthetic */ UZr A01;

    public C20203Wn3(AnonymousClass80D r1, UZr uZr) {
        this.A01 = uZr;
        this.A00 = r1;
    }

    public final void run() {
        UZr uZr = this.A01;
        if (uZr.mView != null) {
            AnonymousClass80Q r1 = new AnonymousClass80Q(this.A00);
            uZr.A01 = r1;
            if (uZr.isResumed()) {
                r1.A01();
            }
        }
    }
}
