package X;

import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.Vlr  reason: case insensitive filesystem */
public abstract class C18123Vlr {
    public static UNX parseFromJson(16F r25) {
        String str;
        16F r2 = r25;
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
            UOB uob = null;
            String str7 = null;
            Float f3 = null;
            Float f4 = null;
            Integer num5 = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            StickerTraySurface stickerTraySurface = null;
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
                } else if ("join_chat_sticker".equals(A17)) {
                    uob = C18235Vo2.parseFromJson(r2);
                } else if ("media_type".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if ("rotation".equals(A17)) {
                    f3 = C41846B3n.A0f(r2);
                } else if ("start_time_ms".equals(A17)) {
                    f4 = C41846B3n.A0f(r2);
                } else if ("sticker_style_enum".equals(A17)) {
                    num5 = AnonymousClass7TF.A0X(r2);
                } else if ("subscription_sticker".equals(A17)) {
                    subscriptionStickerDict = D06.parseFromJson(r2);
                } else if ("surface".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    stickerTraySurface = C45628Cze.A01(str);
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
            return new UNX(stickerTraySurface, subscriptionStickerDict, uob, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str2, str3, str4, str5, str6, str7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, UNX unx) {
        r3.A0c();
        String str = unx.A0G;
        if (str != null) {
            r3.A0R("attribution", str);
        }
        String str2 = unx.A0H;
        if (str2 != null) {
            r3.A0R("attribution_url", str2);
        }
        String str3 = unx.A0I;
        if (str3 != null) {
            r3.A0R("custom_text_color", str3);
        }
        String str4 = unx.A0J;
        if (str4 != null) {
            r3.A0R("display_type", str4);
        }
        C41846B3n.A0w(r3, unx.A03);
        C41846B3n.A0u(r3, unx.A04);
        C41846B3n.A0y(r3, unx.A0K);
        C41846B3n.A0o(r3, unx.A0B);
        C41846B3n.A0l(r3, unx.A0C);
        C41846B3n.A0m(r3, unx.A0D);
        C41846B3n.A0n(r3, unx.A0E);
        UOB uob = unx.A02;
        if (uob != null) {
            r3.A0q("join_chat_sticker");
            C18235Vo2.A00(r3, uob, true);
        }
        String str5 = unx.A0L;
        if (str5 != null) {
            r3.A0R("media_type", str5);
        }
        C41846B3n.A0v(r3, unx.A05);
        C41846B3n.A0x(r3, unx.A06);
        C41846B3n.A0p(r3, unx.A0F);
        C41846B3n.A0k(r3, unx.A01);
        StickerTraySurface stickerTraySurface = unx.A00;
        if (stickerTraySurface != null) {
            r3.A0R("surface", stickerTraySurface.A00);
        }
        C41846B3n.A0t(r3, unx.A07);
        C41846B3n.A0q(r3, unx.A08);
        C41846B3n.A0r(r3, unx.A09);
        C41846B3n.A0s(r3, unx.A0A);
        r3.A0Z();
    }
}
