package X;

/* renamed from: X.M2a  reason: case insensitive filesystem */
public final class C65859M2a implements Runnable {
    public final /* synthetic */ C59728JVm A00;

    public C65859M2a(C59728JVm jVm) {
        this.A00 = jVm;
    }

    public final void run() {
        C59728JVm jVm = this.A00;
        29E r3 = jVm.A04;
        if (r3.A0E(585177486, jVm.A00)) {
            jVm.A00 = r3.A07("Failed to create QuickCaptureFragment", "", 585177486, jVm.A00);
        }
    }
}
