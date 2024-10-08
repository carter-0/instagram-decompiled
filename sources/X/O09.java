package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.MediaStreamTrack;

public abstract class O09 {
    public static final String A00(C254703su r3) {
        2FW r1 = r3.A10;
        O08 o08 = O08.$redex_init_class;
        switch (r1.ordinal()) {
            case 2:
                return "text";
            case 3:
                if (r3.A0W() != null) {
                    if (r3.A0W() == 1iA.A0a) {
                        return MediaStreamTrack.VIDEO_TRACK_KIND;
                    }
                    if (r3.A0W() == 1iA.A0Q) {
                        return "image";
                    }
                    return "location";
                }
                break;
            case 4:
                return "expiring_media";
            case 11:
                return "link";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass53G r0 = r3.A12;
                if (r0 != null) {
                    boolean z = r0.A05;
                    if (z) {
                        return "sticker";
                    }
                    if (!z) {
                        return "gif";
                    }
                }
                break;
            case 14:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 20:
                return "shared_post";
        }
        return "unknown";
    }
}
