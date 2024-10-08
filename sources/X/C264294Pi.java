package X;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.4Pi  reason: invalid class name and case insensitive filesystem */
public final class C264294Pi implements C264304Pj, DisplayManager.DisplayListener {
    public X31 A00;
    public final DisplayManager A01;

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void EBL(X31 x31) {
        this.A00 = x31;
        DisplayManager displayManager = this.A01;
        Looper myLooper = Looper.myLooper();
        C256703wD.A01(myLooper);
        displayManager.registerDisplayListener(this, new Handler(myLooper, (Handler.Callback) null));
        x31.D83(displayManager.getDisplay(0));
    }

    public final void FIq() {
        this.A01.unregisterDisplayListener(this);
        this.A00 = null;
    }

    public final void onDisplayChanged(int i) {
        X31 x31 = this.A00;
        if (x31 != null && i == 0) {
            x31.D83(this.A01.getDisplay(0));
        }
    }

    public C264294Pi(DisplayManager displayManager) {
        this.A01 = displayManager;
    }
}
