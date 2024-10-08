package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.clips.intf.ClipsViewerSource;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Hf4  reason: case insensitive filesystem */
public abstract class C55275Hf4 {
    public static final 28D A00(ClipsViewerSource clipsViewerSource) {
        if (clipsViewerSource != null) {
            switch (clipsViewerSource.ordinal()) {
                case 3:
                    return 28D.A1h;
                case 11:
                case 13:
                    return 28D.A1g;
                case 17:
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    return 28D.A1i;
                case 22:
                    return 28D.A1b;
                case 26:
                    return 28D.A2B;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                case 30:
                case 31:
                    return 28D.A1j;
                case 46:
                    return 28D.A1m;
                case 52:
                case 53:
                    return 28D.A1p;
                case 54:
                    return 28D.A1r;
                case 55:
                    return 28D.A1Y;
                case 57:
                    return 28D.A1s;
                case 58:
                case 60:
                    return 28D.A1P;
                case 59:
                    return 28D.A1Z;
                case 64:
                    return 28D.A1o;
                case 69:
                    return 28D.A1t;
                case 78:
                    return 28D.A1k;
                case 79:
                    return 28D.A1c;
                case 82:
                    return 28D.A1u;
                case 84:
                    return 28D.A1e;
            }
        }
        return 28D.A2q;
    }
}
