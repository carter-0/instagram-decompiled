package X;

import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import java.io.IOException;

public abstract class D1V {
    public static DirectStoreStickerResponseItem parseFromJson(16F r20) {
        16F r5 = r20;
        0qQ.A0B(r5, 0);
        try {
            Integer num = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Double d = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str6 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("sticker_id".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("image_url".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                } else if ("image_mime_type".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r5.A1P();
                    }
                } else if ("image_height".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else if ("image_width".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r5);
                } else if ("original_aspect_ratio".equals(A17)) {
                    d = C41846B3n.A0e(r5);
                } else if ("emoji".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r5.A1P();
                    }
                } else if ("alt_text".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r5.A1P();
                    }
                } else if ("is_favorite".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else if ("is_animated".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r5);
                } else if ("pack_id".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            if (str == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sticker_id", r5, "DirectStoreStickerResponseItem");
            } else if (num == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("image_height", r5, "DirectStoreStickerResponseItem");
            } else if (num2 == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("image_width", r5, "DirectStoreStickerResponseItem");
            } else if (str6 != null || !(r5 instanceof 0c9)) {
                return new DirectStoreStickerResponseItem(bool, bool2, d, str, str2, str3, str4, str5, str6, num.intValue(), num2.intValue());
            } else {
                AnonymousClass7TF.A1L("pack_id", r5, "DirectStoreStickerResponseItem");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, DirectStoreStickerResponseItem directStoreStickerResponseItem) {
        r3.A0c();
        String str = directStoreStickerResponseItem.A07;
        if (str != null) {
            r3.A0R("sticker_id", str);
        }
        String str2 = directStoreStickerResponseItem.A09;
        if (str2 != null) {
            r3.A0R("image_url", str2);
        }
        String str3 = directStoreStickerResponseItem.A08;
        if (str3 != null) {
            r3.A0R("image_mime_type", str3);
        }
        r3.A0P("image_height", directStoreStickerResponseItem.A00);
        r3.A0P("image_width", directStoreStickerResponseItem.A01);
        Double d = directStoreStickerResponseItem.A04;
        if (d != null) {
            r3.A0N("original_aspect_ratio", d.doubleValue());
        }
        String str4 = directStoreStickerResponseItem.A06;
        if (str4 != null) {
            r3.A0R("emoji", str4);
        }
        String str5 = directStoreStickerResponseItem.A05;
        if (str5 != null) {
            r3.A0R("alt_text", str5);
        }
        Boolean bool = directStoreStickerResponseItem.A03;
        if (bool != null) {
            r3.A0S("is_favorite", bool.booleanValue());
        }
        Boolean bool2 = directStoreStickerResponseItem.A02;
        if (bool2 != null) {
            r3.A0S("is_animated", bool2.booleanValue());
        }
        String str6 = directStoreStickerResponseItem.A0A;
        if (str6 != null) {
            r3.A0R("pack_id", str6);
        }
        r3.A0Z();
    }
}
