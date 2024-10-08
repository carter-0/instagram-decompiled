package com.facebook.videolite.transcoder.resizer;

import X.0Sd;
import X.C7334Q4k;
import X.Q7u;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class DummySurface extends Surface {
    public static C7334Q4k A02;
    public boolean A00;
    public final Q7u A01;

    public DummySurface(SurfaceTexture surfaceTexture, Q7u q7u) {
        super(surfaceTexture);
        this.A01 = q7u;
    }

    public final void release() {
        super.release();
        Q7u q7u = this.A01;
        synchronized (q7u) {
            if (!this.A00) {
                0Sd.A00(q7u.A00);
                q7u.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
