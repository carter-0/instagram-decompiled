package X;

import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;

/* renamed from: X.Y1z  reason: case insensitive filesystem */
public final class C22393Y1z implements Runnable {
    public final /* synthetic */ Y56 A00;

    public C22393Y1z(Y56 y56) {
        this.A00 = y56;
    }

    public final void run() {
        Y56 y56 = this.A00;
        y56.A03.stopListening();
        y56.A02.onCapturerStopped();
        VirtualDisplay virtualDisplay = y56.A00;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            y56.A00 = null;
        }
        MediaProjection mediaProjection = y56.A01;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(y56.A0A);
            y56.A01.stop();
            y56.A01 = null;
        }
    }
}
