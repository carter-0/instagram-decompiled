package X;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;

public final class ALA implements SurfaceTexture.OnFrameAvailableListener {
    public final int A00;
    public final Object A01;

    public ALA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.A00 != 0) {
            C346267ut r0 = ((C378839Rk) this.A01).A04;
            if (r0 != null) {
                r0.DGm();
                return;
            }
            return;
        }
        C40097ARj aRj = (C40097ARj) this.A01;
        if (aRj.A02 != null) {
            aRj.A06.incrementAndGet();
            aRj.A00++;
            if (aRj.A01 == 0) {
                aRj.A01 = SystemClock.elapsedRealtimeNanos();
            }
            C365438n7 r02 = aRj.A0H;
            if (r02 != null) {
                r02.Crt(aRj);
            }
        }
    }
}
