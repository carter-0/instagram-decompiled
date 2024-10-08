package X;

/* renamed from: X.Wn4  reason: case insensitive filesystem */
public final class C20204Wn4 implements Runnable {
    public final /* synthetic */ AnonymousClass80D A00;
    public final /* synthetic */ C15287UZs A01;

    public C20204Wn4(AnonymousClass80D r1, C15287UZs uZs) {
        this.A01 = uZs;
        this.A00 = r1;
    }

    public final void run() {
        C15287UZs uZs = this.A01;
        if (uZs.mView != null) {
            AnonymousClass80Q r1 = new AnonymousClass80Q(this.A00);
            uZs.A01 = r1;
            if (uZs.isResumed()) {
                r1.A01();
            }
        }
    }
}
