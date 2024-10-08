package X;

import com.instagram.pendingmedia.model.constants.ShareType;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.KtX  reason: case insensitive filesystem */
public abstract class C63226KtX {
    public static final String A00(1iA r6, ShareType shareType) {
        boolean z = false;
        0qQ.A0B(shareType, 0);
        0qQ.A0B(r6, 1);
        C63225KtW ktW = C63225KtW.$redex_init_class;
        int ordinal = r6.ordinal();
        if (ordinal == 1) {
            z = true;
        } else if (ordinal != 0) {
            return "unknown_media";
        }
        int ordinal2 = shareType.ordinal();
        String str = MediaStreamTrack.VIDEO_TRACK_KIND;
        if (ordinal2 == 3 || ordinal2 == 4) {
            if (!z) {
                str = "photo";
            }
            return 002.A0R("visual_", str);
        } else if (!z) {
            return "photo";
        } else {
            return str;
        }
    }
}
