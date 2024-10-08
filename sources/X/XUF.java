package X;

import android.view.Surface;

public abstract class XUF {
    public static void A00(Surface surface) {
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e) {
            STH.A04("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
