package X;

/* renamed from: X.8zx  reason: invalid class name and case insensitive filesystem */
public final class C372208zx extends AnonymousClass45Y {
    public final /* synthetic */ C372178zu A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C372208zx(C372178zu r2) {
        super("IgMsysMultiInstancesManager.startBackgroundAccountsSync");
        this.A00 = r2;
    }

    public final void run() {
        C372178zu r2 = this.A00;
        if (r2.A02 == null && !r2.A08.getAndSet(true)) {
            C372178zu.A01(r2);
        }
    }
}
