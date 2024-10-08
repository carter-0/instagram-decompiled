package X;

/* renamed from: X.3az  reason: invalid class name and case insensitive filesystem */
public final class C244313az implements Runnable {
    public final /* synthetic */ C244303ay A00;

    public C244313az(C244303ay r1) {
        this.A00 = r1;
    }

    public final void run() {
        C244303ay r1 = this.A00;
        r1.A00 = true;
        r1.invalidateSelf();
    }
}
