package X;

/* renamed from: X.7iJ  reason: invalid class name and case insensitive filesystem */
public final class C338657iJ implements Runnable {
    public boolean A00 = false;
    public final /* synthetic */ AnonymousClass81Z A01;
    public final /* synthetic */ Runnable A02;

    public C338657iJ(AnonymousClass81Z r2, Runnable runnable) {
        this.A01 = r2;
        this.A02 = runnable;
    }

    public final void run() {
        if (!this.A00) {
            this.A00 = true;
            this.A02.run();
        }
    }
}
