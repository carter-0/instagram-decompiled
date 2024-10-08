package X;

import android.os.Handler;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.5zo  reason: invalid class name and case insensitive filesystem */
public final class C301695zo implements Runnable {
    public final /* synthetic */ ShutterButton A00;

    public C301695zo(ShutterButton shutterButton) {
        this.A00 = shutterButton;
    }

    public final void run() {
        ShutterButton shutterButton = this.A00;
        float f = shutterButton.A01;
        if (f >= 1.0f) {
            shutterButton.A01 = 0.0f;
            f = 0.0f;
        } else if (f > 0.3f) {
            return;
        }
        shutterButton.A01 = f + 0.001f;
        shutterButton.invalidate();
        Handler handler = shutterButton.A0B;
        if (handler != null) {
            handler.postDelayed(this, 16);
        }
    }
}
