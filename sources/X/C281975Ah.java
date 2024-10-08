package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.5Ah  reason: invalid class name and case insensitive filesystem */
public abstract class C281975Ah {
    public static AnonymousClass5B1 parseFromJson(16F r25) {
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
            String str7 = null;
            StoryPromptTappableData storyPromptTappableData = null;
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
                } else if ("display_type".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("end_time_ms".equals(A0q)) {
                    f = new Float(r2.A0U());
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f2 = new Float(r2.A0U());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
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
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if ("prompt_sticker".equals(A0q)) {
                    storyPromptTappableData = C281985Ai.parseFromJson(r2);
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
            return new AnonymousClass5B1(stickerTraySurface, storyPromptTappableData, subscriptionStickerDict, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str2, str3, str4, str5, str6, str7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, AnonymousClass5B1 r4) {
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
            r3.A0R("display_type", str4);
        }
        Float f = r4.A03;
        if (f != null) {
            r3.A0O("end_time_ms", f.floatValue());
        }
        Float f2 = r4.A04;
        if (f2 != null) {
            r3.A0O(IgReactMediaPickerNativeModule.HEIGHT, f2.floatValue());
        }
        String str5 = r4.A0K;
        if (str5 != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str5);
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
        String str6 = r4.A0L;
        if (str6 != null) {
            r3.A0R("media_type", str6);
        }
        StoryPromptTappableData storyPromptTappableData = r4.A01;
        if (storyPromptTappableData != null) {
            r3.A0q("prompt_sticker");
            C281985Ai.A00(r3, storyPromptTappableData, true);
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
