package X;

import android.os.SystemClock;
import android.view.Choreographer;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.5zq  reason: invalid class name and case insensitive filesystem */
public final class C301715zq implements Choreographer.FrameCallback {
    public final /* synthetic */ ShutterButton A00;

    public C301715zq(ShutterButton shutterButton) {
        this.A00 = shutterButton;
    }

    public final void doFrame(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ShutterButton shutterButton = this.A00;
        long j2 = elapsedRealtime - shutterButton.A09;
        long j3 = shutterButton.A08;
        if (j2 < j3) {
            shutterButton.setVideoRecordingProgress(((float) j2) / ((float) j3));
            shutterButton.A0f.postFrameCallback(this);
            return;
        }
        shutterButton.DnW("max_duration_reached");
    }
}
