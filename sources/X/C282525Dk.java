package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.venue.LocationDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.5Dk  reason: invalid class name and case insensitive filesystem */
public abstract class C282525Dk {
    public static C282535Dl parseFromJson(16F r26) {
        String str;
        16F r2 = r26;
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
            AnonymousClass5FS r6 = null;
            Float f2 = null;
            String str6 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            LocationDict locationDict = null;
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
                } else if ("guide_summary".equals(A0q)) {
                    r6 = C44745CkE.parseFromJson(r2);
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
                } else if ("location".equals(A0q)) {
                    locationDict = AnonymousClass41Q.parseFromJson(r2);
                } else if ("media_type".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
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
            return new C282535Dl(stickerTraySurface, subscriptionStickerDict, r6, locationDict, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str2, str3, str4, str5, str6, str7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r5, C282535Dl r6) {
        r5.A0c();
        String str = r6.A0H;
        if (str != null) {
            r5.A0R("attribution", str);
        }
        String str2 = r6.A0I;
        if (str2 != null) {
            r5.A0R("attribution_url", str2);
        }
        String str3 = r6.A0J;
        if (str3 != null) {
            r5.A0R("custom_text_color", str3);
        }
        String str4 = r6.A0K;
        if (str4 != null) {
            r5.A0R("display_type", str4);
        }
        Float f = r6.A04;
        if (f != null) {
            r5.A0O("end_time_ms", f.floatValue());
        }
        AnonymousClass5FS r2 = r6.A02;
        if (r2 != null) {
            r5.A0q("guide_summary");
            r5.A0c();
            r5.A0S(AnonymousClass000.A00(2767), r2.A08);
            String str5 = r2.A06;
            if (str5 != null) {
                r5.A0R(DevServerEntity.COLUMN_DESCRIPTION, str5);
            }
            r5.A0S("feedback_enabled", r2.A09);
            r5.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r2.A01);
            r5.A0S("is_draft", r2.A0A);
            BIR bir = r2.A04;
            if (bir != null) {
                r5.A0q(AnonymousClass000.A00(3604));
                D1H.A00(r5, bir);
            }
            r5.A0P(AnonymousClass000.A00(723), r2.A00);
            User user = r2.A05;
            if (user != null) {
                r5.A0q("owner");
                Parcelable.Creator creator = User.CREATOR;
                1aC.A08(r5, user);
            }
            String str6 = r2.A07;
            if (str6 != null) {
                r5.A0R(DialogModule.KEY_TITLE, str6);
            }
            GuideTypeStr guideTypeStr = r2.A03;
            if (guideTypeStr != null) {
                r5.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, guideTypeStr.A00);
            }
            r5.A0Q("updated_timestamp", r2.A02);
            r5.A0Z();
        }
        Float f2 = r6.A05;
        if (f2 != null) {
            r5.A0O(IgReactMediaPickerNativeModule.HEIGHT, f2.floatValue());
        }
        String str7 = r6.A0L;
        if (str7 != null) {
            r5.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str7);
        }
        Integer num = r6.A0C;
        if (num != null) {
            r5.A0P("is_fb_sticker", num.intValue());
        }
        Integer num2 = r6.A0D;
        if (num2 != null) {
            r5.A0P("is_hidden", num2.intValue());
        }
        Integer num3 = r6.A0E;
        if (num3 != null) {
            r5.A0P("is_pinned", num3.intValue());
        }
        Integer num4 = r6.A0F;
        if (num4 != null) {
            r5.A0P("is_sticker", num4.intValue());
        }
        LocationDict locationDict = r6.A03;
        if (locationDict != null) {
            r5.A0q("location");
            AnonymousClass41Q.A00(r5, locationDict);
        }
        String str8 = r6.A0M;
        if (str8 != null) {
            r5.A0R("media_type", str8);
        }
        Float f3 = r6.A06;
        if (f3 != null) {
            r5.A0O("rotation", f3.floatValue());
        }
        Float f4 = r6.A07;
        if (f4 != null) {
            r5.A0O("start_time_ms", f4.floatValue());
        }
        Integer num5 = r6.A0G;
        if (num5 != null) {
            r5.A0P("sticker_style_enum", num5.intValue());
        }
        SubscriptionStickerDict subscriptionStickerDict = r6.A01;
        if (subscriptionStickerDict != null) {
            r5.A0q("subscription_sticker");
            D06.A00(r5, subscriptionStickerDict);
        }
        StickerTraySurface stickerTraySurface = r6.A00;
        if (stickerTraySurface != null) {
            r5.A0R("surface", stickerTraySurface.A00);
        }
        Float f5 = r6.A08;
        if (f5 != null) {
            r5.A0O(IgReactMediaPickerNativeModule.WIDTH, f5.floatValue());
        }
        Float f6 = r6.A09;
        if (f6 != null) {
            r5.A0O("x", f6.floatValue());
        }
        Float f7 = r6.A0A;
        if (f7 != null) {
            r5.A0O("y", f7.floatValue());
        }
        Float f8 = r6.A0B;
        if (f8 != null) {
            r5.A0O("z", f8.floatValue());
        }
        r5.A0Z();
    }
}
