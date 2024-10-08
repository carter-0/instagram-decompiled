package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObjImpl;
import com.instagram.api.schemas.MediaIdToBrandSafetyContentBlocklistBitmapMapImpl;
import java.io.IOException;

public abstract class B5H {
    public static MediaIdToBrandSafetyContentBlocklistBitmapMapImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            BrandSafetyContentBlocklistBitmapQLObjImpl brandSafetyContentBlocklistBitmapQLObjImpl = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("content_blocklist_bitmap".equals(A0q)) {
                    brandSafetyContentBlocklistBitmapQLObjImpl = C66641pk.parseFromJson(r5);
                } else if ("media_id".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new MediaIdToBrandSafetyContentBlocklistBitmapMapImpl(brandSafetyContentBlocklistBitmapQLObjImpl, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
