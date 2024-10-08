package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;

public abstract class CaK {
    public static BFU parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ExtendedImageUrl extendedImageUrl = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            1Xj r3 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("image".equals(A17)) {
                    extendedImageUrl = 16W.parseFromJson(r4);
                } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A17)) {
                    r3 = 1Xj.A00(r4);
                }
                r4.A0z();
            }
            return new BFU(r3, extendedImageUrl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
