package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.TypedImageUrl;
import java.io.IOException;

public abstract class D1W {
    public static DirectStoreSticker parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            TypedImageUrl typedImageUrl = null;
            TypedImageUrl typedImageUrl2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("sticker_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if ("preview_url".equals(A17)) {
                    typedImageUrl = D1X.parseFromJson(r15);
                } else if ("image_url".equals(A17)) {
                    typedImageUrl2 = D1X.parseFromJson(r15);
                } else if ("sticker_pack_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("alt_text".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if (!"emoji".equals(A17)) {
                    bool = C41847B3o.A0z(r15, bool, A17, "is_favorite");
                } else if (r15.A11() == 16L.A0G) {
                    str4 = null;
                } else {
                    str4 = r15.A1P();
                }
                r15.A0z();
            }
            if (str == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sticker_id", r15, "DirectStoreSticker");
            } else if (typedImageUrl2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("image_url", r15, "DirectStoreSticker");
            } else if (str2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sticker_pack_id", r15, "DirectStoreSticker");
            } else if (bool != null || !(r15 instanceof 0c9)) {
                return new DirectStoreSticker(typedImageUrl, typedImageUrl2, str, str2, str3, str4, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("is_favorite", r15, "DirectStoreSticker");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, DirectStoreSticker directStoreSticker) {
        r2.A0c();
        String str = directStoreSticker.A04;
        if (str != null) {
            r2.A0R("sticker_id", str);
        }
        TypedImageUrl typedImageUrl = directStoreSticker.A01;
        if (typedImageUrl != null) {
            r2.A0q("preview_url");
            D1X.A00(r2, typedImageUrl);
        }
        TypedImageUrl typedImageUrl2 = directStoreSticker.A00;
        if (typedImageUrl2 != null) {
            r2.A0q("image_url");
            D1X.A00(r2, typedImageUrl2);
        }
        String str2 = directStoreSticker.A05;
        if (str2 != null) {
            r2.A0R("sticker_pack_id", str2);
        }
        String str3 = directStoreSticker.A02;
        if (str3 != null) {
            r2.A0R("alt_text", str3);
        }
        String str4 = directStoreSticker.A03;
        if (str4 != null) {
            r2.A0R("emoji", str4);
        }
        r2.A0S("is_favorite", directStoreSticker.A06);
        r2.A0Z();
    }
}
