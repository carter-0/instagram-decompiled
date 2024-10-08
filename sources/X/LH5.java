package X;

import com.instagram.api.schemas.MediaKitVisibility;
import java.io.IOException;

public final class LH5 {
    public static C61278K0p parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("share_link".equals(A17)) {
                    r3.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("visibility".equals(A17)) {
                    MediaKitVisibility mediaKitVisibility = (MediaKitVisibility) MediaKitVisibility.A01.get(AnonymousClass7TG.A0l(r4));
                    if (mediaKitVisibility == null) {
                        mediaKitVisibility = MediaKitVisibility.UNRECOGNIZED;
                    }
                    r3.A01 = mediaKitVisibility;
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            String str = r3.A02;
            MediaKitVisibility mediaKitVisibility2 = r3.A01;
            0qQ.A0A(mediaKitVisibility2);
            r3.A00 = new C61108JxK(mediaKitVisibility2, str);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
