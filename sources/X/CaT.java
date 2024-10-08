package X;

import com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType;
import java.io.IOException;

public abstract class CaT {
    public static BFW parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            MetaGalleryNetegoInStoryMediaType metaGalleryNetegoInStoryMediaType = null;
            String str2 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (C41845B3m.A1O(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    metaGalleryNetegoInStoryMediaType = (MetaGalleryNetegoInStoryMediaType) MetaGalleryNetegoInStoryMediaType.A01.get(str);
                    if (metaGalleryNetegoInStoryMediaType == null) {
                        metaGalleryNetegoInStoryMediaType = MetaGalleryNetegoInStoryMediaType.UNRECOGNIZED;
                    }
                } else if ("media_url".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new BFW(metaGalleryNetegoInStoryMediaType, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
