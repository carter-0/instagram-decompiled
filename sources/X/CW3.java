package X;

import com.instagram.api.schemas.MediaType;
import java.io.IOException;

public abstract class CW3 {
    public static BEL parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            MediaType mediaType = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("avatar_sticker_cdn_url".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("avatar_sticker_ikid".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                } else if (C41845B3m.A1C(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    mediaType = (MediaType) MediaType.A01.get(str);
                    if (mediaType == null) {
                        mediaType = MediaType.UNRECOGNIZED;
                    }
                }
                r6.A0z();
            }
            return new BEL(mediaType, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
