package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.EglBase14Impl;

/* renamed from: X.4Pz  reason: invalid class name and case insensitive filesystem */
public final class C264464Pz implements AnonymousClass4Q0 {
    public static int A00(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
            default:
                throw new IllegalArgumentException();
        }
    }
}
