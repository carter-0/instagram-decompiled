package X;

/* renamed from: X.AUp  reason: case insensitive filesystem */
public final class C40175AUp implements C346347v1 {
    public final /* synthetic */ C40183AUx A00;

    public C40175AUp(C40183AUx aUx) {
        this.A00 = aUx;
    }

    public final void DGo(C343187po r4) {
        C40183AUx aUx = this.A00;
        aUx.A01 = r4;
        C340757lm r0 = aUx.A02;
        if (r0 == null) {
            return;
        }
        if (r0.A09()) {
            C40183AUx.A01(aUx);
        } else if (aUx.A00 != null) {
            try {
                aUx.A02.A07("onFrameCaptured", aUx.A08);
            } catch (Exception unused) {
            }
        }
    }
}
