package X;

/* renamed from: X.4ML  reason: invalid class name */
public final class AnonymousClass4ML implements Runnable {
    public final /* synthetic */ AnonymousClass4MI A00;

    public AnonymousClass4ML(AnonymousClass4MI r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass4MI r5 = this.A00;
        long j = r5.A04;
        if (j >= 0) {
            r5.A00();
            AnonymousClass4MI.A0D.postDelayed(this, j);
        }
    }
}
