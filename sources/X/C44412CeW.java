package X;

import com.instagram.api.schemas.StoryMultiProductStickerLinkDataImpl;
import java.io.IOException;

/* renamed from: X.CeW  reason: case insensitive filesystem */
public abstract class C44412CeW {
    public static StoryMultiProductStickerLinkDataImpl parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            Integer num = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("linkType".equals(AnonymousClass7TE.A17(r3))) {
                    num = AnonymousClass7TF.A0X(r3);
                }
                r3.A0z();
            }
            return new StoryMultiProductStickerLinkDataImpl(num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
