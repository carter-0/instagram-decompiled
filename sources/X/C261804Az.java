package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.4Az  reason: invalid class name and case insensitive filesystem */
public abstract class C261804Az {
    public static AnonymousClass4B0 parseFromJson(16F r27) {
        String str;
        16F r3 = r27;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
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
            Float f3 = null;
            Float f4 = null;
            Integer num5 = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            StickerTraySurface stickerTraySurface = null;
            User user = null;
            String str8 = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("attribution".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if ("attribution_url".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("custom_text_color".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if ("display_type".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if ("end_time_ms".equals(A0q)) {
                    f = new Float(r3.A0U());
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f2 = new Float(r3.A0U());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if ("is_fb_sticker".equals(A0q)) {
                    num = Integer.valueOf(r3.A1D());
                } else if ("is_hidden".equals(A0q)) {
                    num2 = Integer.valueOf(r3.A1D());
                } else if ("is_pinned".equals(A0q)) {
                    num3 = Integer.valueOf(r3.A1D());
                } else if ("is_sticker".equals(A0q)) {
                    num4 = Integer.valueOf(r3.A1D());
                } else if ("media_type".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                } else if ("rotation".equals(A0q)) {
                    f3 = new Float(r3.A0U());
                } else if ("start_time_ms".equals(A0q)) {
                    f4 = new Float(r3.A0U());
                } else if ("sticker_style_enum".equals(A0q)) {
                    num5 = Integer.valueOf(r3.A1D());
                } else if ("subscription_sticker".equals(A0q)) {
                    subscriptionStickerDict = D06.parseFromJson(r3);
                } else if ("surface".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    stickerTraySurface = C45628Cze.A01(str);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r3, false);
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r3.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    f5 = new Float(r3.A0U());
                } else if ("x".equals(A0q)) {
                    f6 = new Float(r3.A0U());
                } else if ("y".equals(A0q)) {
                    f7 = new Float(r3.A0U());
                } else if ("z".equals(A0q)) {
                    f8 = new Float(r3.A0U());
                }
                r3.A0z();
            }
            return new AnonymousClass4B0(stickerTraySurface, subscriptionStickerDict, user, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str2, str3, str4, str5, str6, str7, str8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
