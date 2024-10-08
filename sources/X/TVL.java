package X;

import android.hardware.display.DisplayManager;
import android.view.Display;

public final class TVL extends 0Yg implements C62320sa {
    public static final TVL A00 = new TVL();

    public TVL() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        DisplayManager displayManager;
        Display display;
        Object systemService = C60960kU.A00.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            displayManager = (DisplayManager) systemService;
        } else {
            displayManager = null;
        }
        boolean z = false;
        if (displayManager != null && (display = displayManager.getDisplay(0)) != null) {
            int[] supportedHdrTypes = display.getHdrCapabilities().getSupportedHdrTypes();
            0qQ.A07(supportedHdrTypes);
            int length = supportedHdrTypes.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (supportedHdrTypes[i] == 1) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
