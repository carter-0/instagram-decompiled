package X;

public final class PW5 implements Runnable {
    public final /* synthetic */ AnonymousClass6AI A00;

    public PW5(AnonymousClass6AI r1) {
        this.A00 = r1;
    }

    public final void run() {
        try {
            0KC.A0C("IgMsysLogcatDumper", 002.A0O("Logcat process exited unexpectedly with code: ", this.A00.A01.waitFor()));
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.A00.A01.destroy();
            throw th;
        }
        this.A00.A01.destroy();
    }
}
