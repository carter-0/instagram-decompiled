package X;

import android.os.Handler;
import com.facebook.smartcapture.components.RectDetectionVisualizerView;

/* renamed from: X.M1e  reason: case insensitive filesystem */
public final class C65838M1e implements Runnable {
    public final /* synthetic */ RectDetectionVisualizerView A00;

    public C65838M1e(RectDetectionVisualizerView rectDetectionVisualizerView) {
        this.A00 = rectDetectionVisualizerView;
    }

    public final void run() {
        Handler handler = this.A00.A00;
        if (handler != null) {
            handler.postDelayed(this, 33);
        }
    }
}
