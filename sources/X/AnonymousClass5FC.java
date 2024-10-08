package X;

/* renamed from: X.5FC  reason: invalid class name */
public final class AnonymousClass5FC implements Runnable {
    public final /* synthetic */ AnonymousClass5FA A00;
    public final /* synthetic */ AnonymousClass3W1 A01;

    public AnonymousClass5FC(AnonymousClass5FA r1, AnonymousClass3W1 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3W1 r2 = this.A01;
        if (!r2.A2P) {
            r2.A0m(true, false);
            r2.A1L = "dwell";
            this.A00.A00.remove(Integer.valueOf(r2.hashCode()));
        }
    }
}
