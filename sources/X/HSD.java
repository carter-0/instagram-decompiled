package X;

import org.webrtc.CameraCapturer;
import org.webrtc.ScreenCapturerAndroid;

public abstract class HSD {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return CameraCapturer.OPEN_CAMERA_DELAY_MS;
            case 2:
                return 600;
            case 3:
                return 700;
            default:
                return ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
        }
    }
}
