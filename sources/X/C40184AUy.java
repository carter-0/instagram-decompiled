package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.AUy  reason: case insensitive filesystem */
public final class C40184AUy implements Y9N {
    public final /* synthetic */ C341057mG A00;

    public C40184AUy(C341057mG r1) {
        this.A00 = r1;
    }

    public final void Cvq(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null || surfaceTexture.getTimestamp() != 0) {
            C346267ut r0 = this.A00.A06;
            if (r0 != null) {
                r0.DGm();
                return;
            }
            return;
        }
        C341897nh r02 = this.A00.A01;
        r02.getClass();
        r02.update();
    }
}
