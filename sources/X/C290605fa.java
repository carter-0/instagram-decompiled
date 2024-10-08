package X;

import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.5fa  reason: invalid class name and case insensitive filesystem */
public final class C290605fa extends 0Yg implements C62320sa {
    public static final C290605fa A00 = new C290605fa();

    public C290605fa() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        int[] supportedHdrTypes;
        boolean z = false;
        try {
            WindowManager windowManager = C290595fZ.A00;
            if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (hdrCapabilities = defaultDisplay.getHdrCapabilities()) == null || (supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes()) == null)) {
                z = 03t.A0P(supportedHdrTypes, 3);
            }
        } catch (Exception e) {
            0KC.A0G("ScreenCapabilityUtil", "isHdrSupported", e);
        }
        return Boolean.valueOf(z);
    }
}
