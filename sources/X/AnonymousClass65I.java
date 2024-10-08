package X;

/* renamed from: X.65I  reason: invalid class name */
public final /* synthetic */ class AnonymousClass65I implements Runnable {
    public final /* synthetic */ AnonymousClass4MM A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ AnonymousClass65I(AnonymousClass4MM r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void run() {
        AnonymousClass4MM r0 = this.A00;
        Runnable runnable = this.A01;
        AnonymousClass4MM.A02(r0);
        r0.A0d.post(runnable);
    }
}
