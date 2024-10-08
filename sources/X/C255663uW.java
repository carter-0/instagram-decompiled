package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.3uW  reason: invalid class name and case insensitive filesystem */
public abstract class C255663uW {
    public static C255683uY parseFromJson(16F r26) {
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
            Float f2 = null;
            String str6 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str7 = null;
            MusicOverlayStickerModel musicOverlayStickerModel = null;
            OriginalSoundData originalSoundData = null;
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
                } else if ("music_asset_info".equals(A0q)) {
                    musicOverlayStickerModel = C255673uX.parseFromJson(r2);
                } else if ("original_sound_info".equals(A0q)) {
                    originalSoundData = 1dk.parseFromJson(r2);
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
            return new C255683uY(originalSoundData, stickerTraySurface, subscriptionStickerDict, musicOverlayStickerModel, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str2, str3, str4, str5, str6, str7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
