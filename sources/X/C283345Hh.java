package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.5Hh  reason: invalid class name and case insensitive filesystem */
public abstract class C283345Hh {
    public static C283385Hl parseFromJson(16F r27) {
        String str;
        16F r2 = r27;
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
            String str6 = null;
            Float f = null;
            C283365Hj r5 = null;
            Float f2 = null;
            String str7 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str8 = null;
            Float f3 = null;
            Float f4 = null;
            Integer num5 = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            StickerTraySurface stickerTraySurface = null;
            String str9 = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("attribution".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("attribution_url".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("custom_text_color".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("custom_title".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("display_type".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if ("end_time_ms".equals(A0q)) {
                    f = new Float(r2.A0U());
                } else if ("hashtag".equals(A0q)) {
                    r5 = C283355Hi.parseFromJson(r2);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f2 = new Float(r2.A0U());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if ("is_fb_sticker".equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                } else if ("is_hidden".equals(A0q)) {
                    num2 = Integer.valueOf(r2.A1D());
                } else if ("is_pinned".equals(A0q)) {
                    num3 = Integer.valueOf(r2.A1D());
                } else if ("is_sticker".equals(A0q)) {
                    num4 = Integer.valueOf(r2.A1D());
                } else if ("media_type".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r2.A1P();
                    }
                } else if ("rotation".equals(A0q)) {
                    f3 = new Float(r2.A0U());
                } else if ("start_time_ms".equals(A0q)) {
                    f4 = new Float(r2.A0U());
                } else if ("sticker_style_enum".equals(A0q)) {
                    num5 = Integer.valueOf(r2.A1D());
                } else if ("subscription_sticker".equals(A0q)) {
                    subscriptionStickerDict = D06.parseFromJson(r2);
                } else if ("surface".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    stickerTraySurface = C45628Cze.A01(str);
                } else if ("tag_name".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r2.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    f5 = new Float(r2.A0U());
                } else if ("x".equals(A0q)) {
                    f6 = new Float(r2.A0U());
                } else if ("y".equals(A0q)) {
                    f7 = new Float(r2.A0U());
                } else if ("z".equals(A0q)) {
                    f8 = new Float(r2.A0U());
                }
                r2.A0z();
            }
            return new C283385Hl(stickerTraySurface, r5, subscriptionStickerDict, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str2, str3, str4, str5, str6, str7, str8, str9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C283385Hl r4) {
        r3.A0c();
        String str = r4.A0G;
        if (str != null) {
            r3.A0R("attribution", str);
        }
        String str2 = r4.A0H;
        if (str2 != null) {
            r3.A0R("attribution_url", str2);
        }
        String str3 = r4.A0I;
        if (str3 != null) {
            r3.A0R("custom_text_color", str3);
        }
        String str4 = r4.A0J;
        if (str4 != null) {
            r3.A0R("custom_title", str4);
        }
        String str5 = r4.A0K;
        if (str5 != null) {
            r3.A0R("display_type", str5);
        }
        Float f = r4.A03;
        if (f != null) {
            r3.A0O("end_time_ms", f.floatValue());
        }
        C283375Hk r1 = r4.A01;
        if (r1 != null) {
            r3.A0q("hashtag");
            C283365Hj FAE = r1.FAE();
            r3.A0c();
            String str6 = FAE.A00;
            if (str6 != null) {
                r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str6);
            }
            String str7 = FAE.A01;
            if (str7 != null) {
                r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str7);
            }
            r3.A0Z();
        }
        Float f2 = r4.A04;
        if (f2 != null) {
            r3.A0O(IgReactMediaPickerNativeModule.HEIGHT, f2.floatValue());
        }
        String str8 = r4.A0L;
        if (str8 != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str8);
        }
        Integer num = r4.A0B;
        if (num != null) {
            r3.A0P("is_fb_sticker", num.intValue());
        }
        Integer num2 = r4.A0C;
        if (num2 != null) {
            r3.A0P("is_hidden", num2.intValue());
        }
        Integer num3 = r4.A0D;
        if (num3 != null) {
            r3.A0P("is_pinned", num3.intValue());
        }
        Integer num4 = r4.A0E;
        if (num4 != null) {
            r3.A0P("is_sticker", num4.intValue());
        }
        String str9 = r4.A0M;
        if (str9 != null) {
            r3.A0R("media_type", str9);
        }
        Float f3 = r4.A05;
        if (f3 != null) {
            r3.A0O("rotation", f3.floatValue());
        }
        Float f4 = r4.A06;
        if (f4 != null) {
            r3.A0O("start_time_ms", f4.floatValue());
        }
        Integer num5 = r4.A0F;
        if (num5 != null) {
            r3.A0P("sticker_style_enum", num5.intValue());
        }
        SubscriptionStickerDict subscriptionStickerDict = r4.A02;
        if (subscriptionStickerDict != null) {
            r3.A0q("subscription_sticker");
            D06.A00(r3, subscriptionStickerDict);
        }
        StickerTraySurface stickerTraySurface = r4.A00;
        if (stickerTraySurface != null) {
            r3.A0R("surface", stickerTraySurface.A00);
        }
        String str10 = r4.A0N;
        if (str10 != null) {
            r3.A0R("tag_name", str10);
        }
        Float f5 = r4.A07;
        if (f5 != null) {
            r3.A0O(IgReactMediaPickerNativeModule.WIDTH, f5.floatValue());
        }
        Float f6 = r4.A08;
        if (f6 != null) {
            r3.A0O("x", f6.floatValue());
        }
        Float f7 = r4.A09;
        if (f7 != null) {
            r3.A0O("y", f7.floatValue());
        }
        Float f8 = r4.A0A;
        if (f8 != null) {
            r3.A0O("z", f8.floatValue());
        }
        r3.A0Z();
    }
}
