package X;

/* renamed from: X.3Ou  reason: invalid class name and case insensitive filesystem */
public final class C241333Ou implements Runnable {
    public final /* synthetic */ 1FS A00;
    public final /* synthetic */ C228492ll A01;

    public C241333Ou(1FS r1, C228492ll r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C228492ll r1 = this.A01;
        1FS r0 = this.A00;
        1QP r3 = r1.A04;
        long generateFlowId = r3.generateFlowId(974460658, r0.A01);
        if (r3.isOngoingFlow(generateFlowId)) {
            r3.flowEndTimeout(generateFlowId);
        }
    }
}
