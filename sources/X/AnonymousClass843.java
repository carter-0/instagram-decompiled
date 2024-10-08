package X;

/* renamed from: X.843  reason: invalid class name */
public final class AnonymousClass843 extends 0ng {
    public final /* synthetic */ 0lg A00;
    public final /* synthetic */ PyB A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass843(0lg r5, PyB pyB) {
        super(142, 3, false, true);
        this.A00 = r5;
        this.A01 = pyB;
    }

    public final void run() {
        try {
            0lg r0 = this.A00;
            PyB pyB = this.A01;
            if (1RH.A01(r0, pyB)) {
                for (1US r02 : pyB.A05) {
                    0g7.A00().A05(r02.A00, AnonymousClass05K.A0C);
                }
            }
        } catch (Exception e) {
            0KC.A0L("IgDownloadableModulesPluginImpl", "Interrupted while waiting for download. %s", e, new Object[]{e});
        }
    }
}
