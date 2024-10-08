package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: X.2nW  reason: invalid class name */
public final class AnonymousClass2nW {
    public static float A00 = -1.0f;
    public static int A01 = -1;
    public static Float A02;
    public static final AnonymousClass2nW A03 = new Object();
    public static final C262224Cq A04 = 19E.A02(AnonymousClass12T.A00.AOJ(276562401, 3));

    public final float A00(Context context, int i) {
        DisplayManager displayManager;
        Display display;
        0qQ.A0B(context, 0);
        Object systemService = context.getSystemService("display");
        if (!(systemService instanceof DisplayManager) || (displayManager = (DisplayManager) systemService) == null || (display = displayManager.getDisplay(0)) == null) {
            return 60.0f;
        }
        float refreshRate = display.getRefreshRate();
        if (refreshRate < 30.0f || refreshRate > ((float) i)) {
            return 60.0f;
        }
        return refreshRate;
    }

    public final float A01(Context context, int i) {
        0qQ.A0B(context, 0);
        Float f = A02;
        if (f == null) {
            f = Float.valueOf(A00(context, Integer.MAX_VALUE));
            A02 = f;
        }
        float floatValue = f.floatValue();
        if (floatValue < 30.0f || floatValue > ((float) i)) {
            return 60.0f;
        }
        return floatValue;
    }
}
