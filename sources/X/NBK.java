package X;

public final class NBK extends AnonymousClass45Y {
    public final /* synthetic */ C66957Mfq A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NBK(C66957Mfq mfq) {
        super("MultiInstanceManager.startBackgroundAccountsSync");
        this.A00 = mfq;
    }

    public final void run() {
        C66957Mfq mfq = this.A00;
        if (mfq.A01 == null && !mfq.A07.getAndSet(true)) {
            C66957Mfq.A00(mfq);
        }
    }
}
