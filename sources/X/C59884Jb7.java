package X;

import android.hardware.Sensor;
import android.os.Handler;
import android.os.Message;
import com.instagram.creation.capture.MediaCaptureFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.Jb7  reason: case insensitive filesystem */
public final class C59884Jb7 extends Handler {
    public final WeakReference A00;

    public final void handleMessage(Message message) {
        MediaCaptureFragment mediaCaptureFragment;
        if (message.what == 1 && (mediaCaptureFragment = (MediaCaptureFragment) this.A00.get()) != null) {
            C59863Jag jag = mediaCaptureFragment.A03;
            Sensor sensor = jag.A06;
            if (sensor == null) {
                0KC.A0D("PreciseOrientationEventListener", "Cannot detect sensors. Not enabled");
            } else if (!jag.A05) {
                C60240fb.A01(sensor, jag.A04, jag.A07, 3);
                jag.A05 = true;
            }
        }
    }

    public C59884Jb7(MediaCaptureFragment mediaCaptureFragment) {
        this.A00 = C51965G9l.A0v(mediaCaptureFragment);
    }
}
