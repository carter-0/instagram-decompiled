package X;

public final class M4R implements Runnable {
    public final /* synthetic */ C61941KSq A00;

    public M4R(C61941KSq kSq) {
        this.A00 = kSq;
    }

    public final void run() {
        0hq r0;
        C61941KSq kSq = this.A00;
        if (kSq.isResumed() && (r0 = kSq.mFragmentManager) != null) {
            r0.A13();
        }
    }
}
