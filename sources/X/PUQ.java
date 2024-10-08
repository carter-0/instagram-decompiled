package X;

public final class PUQ implements Runnable {
    public final /* synthetic */ AnonymousClass18h A00;

    public PUQ(AnonymousClass18h r1) {
        this.A00 = r1;
    }

    public final void run() {
        try {
            0di.A01("xanalyticsadapter-jni");
        } catch (Throwable th) {
            AnonymousClass18h r1 = this.A00;
            boolean z = AnonymousClass18h.A0E;
            r1.A0C(th);
        }
    }
}
