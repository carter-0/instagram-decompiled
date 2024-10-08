package X;

import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.Vls  reason: case insensitive filesystem */
public abstract class C18124Vls {
    public static UNY parseFromJson(16F r28) {
        String str;
        16F r2 = r28;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Float f = null;
            Float f2 = null;
            String str6 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str7 = null;
            String str8 = null;
            Float f3 = null;
            Float f4 = null;
            Integer num5 = null;
            String str9 = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            StickerTraySurface stickerTraySurface = null;
            String str10 = null;
            String str11 = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("attribution".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("attribution_url".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("custom_text_color".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("display_type".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("end_time_ms".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r2);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r2);
                } else if (C41845B3m.A17(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if ("is_fb_sticker".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r2);
                } else if ("is_hidden".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r2);
                } else if ("is_pinned".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r2);
                } else if ("is_sticker".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r2);
                } else if ("media_type".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if ("prompt_v2_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r2.A1P();
                    }
                } else if ("rotation".equals(A17)) {
                    f3 = C41846B3n.A0f(r2);
                } else if ("start_time_ms".equals(A17)) {
                    f4 = C41846B3n.A0f(r2);
                } else if ("sticker_style_enum".equals(A17)) {
                    num5 = AnonymousClass7TF.A0X(r2);
                } else if ("submission_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r2.A1P();
                    }
                } else if ("subscription_sticker".equals(A17)) {
                    subscriptionStickerDict = D06.parseFromJson(r2);
                } else if ("surface".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    stickerTraySurface = C45628Cze.A01(str);
                } else if ("thread_id_v2".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r2.A1P();
                    }
                } else if ("thread_igid".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r2.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    f5 = C41846B3n.A0f(r2);
                } else if ("x".equals(A17)) {
                    f6 = C41846B3n.A0f(r2);
                } else if ("y".equals(A17)) {
                    f7 = C41846B3n.A0f(r2);
                } else {
                    f8 = C41847B3o.A11(r2, f8, A17);
                }
                r2.A0z();
            }
            return new UNY(stickerTraySurface, subscriptionStickerDict, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, UNY uny) {
        r2.A0c();
        String str = uny.A0F;
        if (str != null) {
            r2.A0R("attribution", str);
        }
        String str2 = uny.A0G;
        if (str2 != null) {
            r2.A0R("attribution_url", str2);
        }
        String str3 = uny.A0H;
        if (str3 != null) {
            r2.A0R("custom_text_color", str3);
        }
        String str4 = uny.A0I;
        if (str4 != null) {
            r2.A0R("display_type", str4);
        }
        C41846B3n.A0w(r2, uny.A02);
        C41846B3n.A0u(r2, uny.A03);
        C41846B3n.A0y(r2, uny.A0J);
        C41846B3n.A0o(r2, uny.A0A);
        C41846B3n.A0l(r2, uny.A0B);
        C41846B3n.A0m(r2, uny.A0C);
        C41846B3n.A0n(r2, uny.A0D);
        String str5 = uny.A0K;
        if (str5 != null) {
            r2.A0R("media_type", str5);
        }
        String str6 = uny.A0L;
        if (str6 != null) {
            r2.A0R("prompt_v2_id", str6);
        }
        C41846B3n.A0v(r2, uny.A04);
        C41846B3n.A0x(r2, uny.A05);
        C41846B3n.A0p(r2, uny.A0E);
        String str7 = uny.A0M;
        if (str7 != null) {
            r2.A0R("submission_id", str7);
        }
        C41846B3n.A0k(r2, uny.A01);
        StickerTraySurface stickerTraySurface = uny.A00;
        if (stickerTraySurface != null) {
            r2.A0R("surface", stickerTraySurface.A00);
        }
        String str8 = uny.A0N;
        if (str8 != null) {
            r2.A0R("thread_id_v2", str8);
        }
        String str9 = uny.A0O;
        if (str9 != null) {
            r2.A0R("thread_igid", str9);
        }
        C41846B3n.A0t(r2, uny.A06);
        C41846B3n.A0q(r2, uny.A07);
        C41846B3n.A0r(r2, uny.A08);
        C41846B3n.A0s(r2, uny.A09);
        r2.A0Z();
    }
}
