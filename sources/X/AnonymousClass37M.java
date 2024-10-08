package X;

/* renamed from: X.37M  reason: invalid class name */
public final class AnonymousClass37M extends 19W {
    public final /* synthetic */ AnonymousClass1Iw A00;

    public final void onRequestCallbackDone(1QS r6, 1QU r7) {
        0qQ.A0B(r7, 1);
        AnonymousClass1Iw r4 = this.A00;
        synchronized (r4.A02) {
            AnonymousClass1CF r2 = r4.A01;
            synchronized (r2) {
                if (r7.A09 != r2.A02) {
                    throw new IllegalStateException("Check failed.");
                } else if (AnonymousClass1RU.A00(r7)) {
                    r2.A01--;
                } else {
                    r2.A00--;
                }
            }
            AnonymousClass1Iw.A00(r4);
        }
    }

    public AnonymousClass37M(AnonymousClass1Iw r1) {
        this.A00 = r1;
    }
}
