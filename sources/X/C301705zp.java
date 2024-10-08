package X;

import android.os.Handler;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.5zp  reason: invalid class name and case insensitive filesystem */
public final class C301705zp implements Runnable {
    public final /* synthetic */ ShutterButton A00;

    public C301705zp(ShutterButton shutterButton) {
        this.A00 = shutterButton;
    }

    public final void run() {
        ShutterButton shutterButton = this.A00;
        float f = shutterButton.A00;
        if (f >= 1.0f) {
            shutterButton.A00 = 0.0f;
            f = 0.0f;
        }
        shutterButton.A00 = f + 0.02f;
        shutterButton.invalidate();
        Handler handler = shutterButton.A0B;
        if (handler != null) {
            handler.postDelayed(this, 16);
        }
    }
}
