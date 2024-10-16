package X;

import android.view.Choreographer;
import android.view.View;
import java.lang.ref.WeakReference;

public final class LWV implements Choreographer.FrameCallback {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public long A02 = -1;
    public final Choreographer A03;
    public final WeakReference A04;

    public LWV(View view) {
        this.A04 = C51965G9l.A0v(view);
        this.A03 = Choreographer.getInstance();
    }

    public final void doFrame(long j) {
        float max;
        long j2 = j / 1000000;
        WeakReference weakReference = this.A04;
        if (weakReference.get() != null) {
            float f = this.A00;
            float f2 = this.A01;
            if (f != f2) {
                long j3 = this.A02;
                if (j3 == -1) {
                    this.A02 = j2;
                    j3 = j2;
                }
                float f3 = ((float) (j2 - j3)) / 100.0f;
                if (f2 > f) {
                    max = Math.min(1.0f, f + f3);
                } else {
                    max = Math.max(0.0f, f - f3);
                }
                this.A00 = max;
                ((View) weakReference.get()).invalidate();
                this.A02 = j2;
                this.A03.postFrameCallback(this);
                return;
            }
        }
        this.A03.removeFrameCallback(this);
        this.A02 = -1;
    }
}
