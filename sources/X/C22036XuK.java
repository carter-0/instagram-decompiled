package X;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: X.XuK  reason: case insensitive filesystem */
public final class C22036XuK implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C21440Xas A01;

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayRemoved(int i) {
    }

    public C22036XuK(DisplayManager displayManager, C21440Xas xas) {
        this.A01 = xas;
        this.A00 = displayManager;
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            Display display = this.A00.getDisplay(0);
            if (display != null) {
                display.getRefreshRate();
            } else {
                STH.A03("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            }
        }
    }
}
