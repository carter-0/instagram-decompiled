package X;

/* renamed from: X.9Qq  reason: invalid class name and case insensitive filesystem */
public final class C378649Qq implements Runnable {
    public final /* synthetic */ AnonymousClass80D A00;
    public final /* synthetic */ C378609Qm A01;

    public C378649Qq(AnonymousClass80D r1, C378609Qm r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C378609Qm r2 = this.A01;
        if (r2.mView != null) {
            AnonymousClass80Q r1 = new AnonymousClass80Q(this.A00);
            r2.A02 = r1;
            if (r2.isResumed()) {
                r1.A01();
            }
        }
    }
}
