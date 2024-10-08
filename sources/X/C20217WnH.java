package X;

/* renamed from: X.WnH  reason: case insensitive filesystem */
public final class C20217WnH implements Runnable {
    public final /* synthetic */ AnonymousClass80D A00;
    public final /* synthetic */ C15290UZv A01;

    public C20217WnH(AnonymousClass80D r1, C15290UZv uZv) {
        this.A01 = uZv;
        this.A00 = r1;
    }

    public final void run() {
        C15290UZv uZv = this.A01;
        if (uZv.mView != null) {
            AnonymousClass80Q r1 = new AnonymousClass80Q(this.A00);
            uZv.A01 = r1;
            if (uZv.isResumed()) {
                r1.A01();
            }
        }
    }
}
