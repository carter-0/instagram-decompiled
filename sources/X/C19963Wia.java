package X;

/* renamed from: X.Wia  reason: case insensitive filesystem */
public final class C19963Wia implements Runnable {
    public final /* synthetic */ C18472VsO A00;

    public C19963Wia(C18472VsO vsO) {
        this.A00 = vsO;
    }

    public final void run() {
        try {
            C18472VsO vsO = this.A00;
            C17823Vgc vgc = vsO.A03;
            AnonymousClass507 r5 = vgc.A02;
            V3N v3n = r5.A03;
            long now = v3n.A01.now();
            vgc.A00 = now;
            r5.A02(vsO.A01, now + v3n.A00);
        } catch (Exception e) {
            0KC.A0K("ZeroCarrierSignalControllerBase", Pxd.A00(68), e);
        } catch (Throwable th) {
            C18472VsO.A00(this.A00);
            throw th;
        }
        C18472VsO.A00(this.A00);
    }
}
