package X;

/* renamed from: X.Wo3  reason: case insensitive filesystem */
public final /* synthetic */ class C20264Wo3 implements Runnable {
    public final /* synthetic */ AnonymousClass80D A00;
    public final /* synthetic */ C15291UZw A01;

    public /* synthetic */ C20264Wo3(AnonymousClass80D r1, C15291UZw uZw) {
        this.A01 = uZw;
        this.A00 = r1;
    }

    public final void run() {
        C15291UZw uZw = this.A01;
        AnonymousClass80D r2 = this.A00;
        if (uZw.mView != null) {
            AnonymousClass80Q r1 = new AnonymousClass80Q(r2);
            uZw.A01 = r1;
            if (uZw.isResumed()) {
                r1.A01();
            }
        }
    }
}
