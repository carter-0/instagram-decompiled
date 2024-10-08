package X;

public final class PXA implements Runnable {
    public final /* synthetic */ PMU A00;

    public PXA(PMU pmu) {
        this.A00 = pmu;
    }

    public final void run() {
        PMU pmu = this.A00;
        if (AnonymousClass7TH.A06(pmu.A0t).getVisibility() == 0) {
            pmu.A0M.A05(POA.A00);
        }
    }
}
