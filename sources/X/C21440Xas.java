package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;

/* renamed from: X.Xas  reason: case insensitive filesystem */
public final class C21440Xas {
    public float A00;
    public int A01;
    public Surface A02;
    public final C21374XZh A03 = new C21374XZh();
    public final C22036XuK A04;
    public final C22040XuO A05;

    public C21440Xas(Context context) {
        C22040XuO xuO;
        DisplayManager displayManager;
        C22036XuK xuK = null;
        if (!(context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null)) {
            xuK = new C22036XuK(displayManager, this);
        }
        this.A04 = xuK;
        if (xuK != null) {
            xuO = C22040XuO.A04;
        } else {
            xuO = null;
        }
        this.A05 = xuO;
        this.A00 = 1.0f;
        this.A01 = 0;
    }
}
