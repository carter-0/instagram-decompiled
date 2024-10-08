package X;

import com.instagram.api.schemas.LinkStickerType;
import java.io.IOException;

/* renamed from: X.V7d  reason: case insensitive filesystem */
public abstract class C16822V7d {
    public static UNC parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            LinkStickerType linkStickerType = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("link_sticker_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    linkStickerType = (LinkStickerType) LinkStickerType.A01.get(str);
                    if (linkStickerType == null) {
                        linkStickerType = LinkStickerType.UNRECOGNIZED;
                    }
                } else if ("link_sticker_url".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (linkStickerType == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("link_sticker_type", r8, "LinkStickerInfoImpl");
            } else if (str2 != null || !(r8 instanceof 0c9)) {
                return new UNC(linkStickerType, str2);
            } else {
                AnonymousClass7TF.A1L("link_sticker_url", r8, "LinkStickerInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
