package X;

public final class TEt implements Runnable {
    public final /* synthetic */ C283035Fv A00;
    public final /* synthetic */ C2379539x A01;

    public TEt(C283035Fv r1, C2379539x r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C283035Fv r5 = this.A00;
        C2379539x r4 = r5.A04;
        if (!r4.isCancelled()) {
            try {
                C7325Q4b q4b = (C7325Q4b) this.A01.get();
                if (q4b != null) {
                    AnonymousClass389.A00();
                    r4.A06(r5.A01.EX9(r5.A00, q4b, r5.A02.mWorkerParams.A09));
                    return;
                }
                throw Pxg.A0e("Worker was marked important (", r5.A03.A0I, ") but did not provide ForegroundInfo");
            } catch (Throwable th) {
                r4.A08(th);
            }
        }
    }
}
