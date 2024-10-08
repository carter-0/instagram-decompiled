package X;

import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDict;
import com.instagram.api.schemas.StoryTemplateMusicStickerDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9Nd  reason: invalid class name and case insensitive filesystem */
public abstract class C377769Nd {
    public static StoryTemplateMusicStickerDict parseFromJson(16F r42) {
        16F r2 = r42;
        0qQ.A0B(r2, 0);
        try {
            Integer num = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Float f = null;
            Lyrics lyrics = null;
            StoryTemplateMusicAssetInfoDict storyTemplateMusicAssetInfoDict = null;
            Integer num3 = null;
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            Float f5 = null;
            Integer num4 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("attribution".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("audio_asset_id".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("audio_asset_start_time_in_ms".equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                } else if ("audio_cluster_id".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("color".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("derived_content_start_time_in_ms".equals(A0q)) {
                    num2 = Integer.valueOf(r2.A1D());
                } else if ("display_type".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f = Float.valueOf((float) r2.A0U());
                } else if ("lyrics".equals(A0q)) {
                    lyrics = AnonymousClass4DC.parseFromJson(r2);
                } else if ("music_asset_info".equals(A0q)) {
                    storyTemplateMusicAssetInfoDict = C393599wh.parseFromJson(r2);
                } else if ("overlap_duration_in_ms".equals(A0q)) {
                    num3 = Integer.valueOf(r2.A1D());
                } else if ("rotation".equals(A0q)) {
                    f2 = Float.valueOf((float) r2.A0U());
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    f3 = Float.valueOf((float) r2.A0U());
                } else if ("x".equals(A0q)) {
                    f4 = Float.valueOf((float) r2.A0U());
                } else if ("y".equals(A0q)) {
                    f5 = Float.valueOf((float) r2.A0U());
                } else if ("z_index".equals(A0q)) {
                    num4 = Integer.valueOf(r2.A1D());
                }
                r2.A0z();
            }
            if (str == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("attribution", r2, "StoryTemplateMusicStickerDict");
            } else if (str2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("audio_asset_id", r2, "StoryTemplateMusicStickerDict");
            } else if (num == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("audio_asset_start_time_in_ms", r2, "StoryTemplateMusicStickerDict");
            } else if (str3 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("audio_cluster_id", r2, "StoryTemplateMusicStickerDict");
            } else if (str4 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("color", r2, "StoryTemplateMusicStickerDict");
            } else if (num2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("derived_content_start_time_in_ms", r2, "StoryTemplateMusicStickerDict");
            } else if (str5 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("display_type", r2, "StoryTemplateMusicStickerDict");
            } else if (f == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L(IgReactMediaPickerNativeModule.HEIGHT, r2, "StoryTemplateMusicStickerDict");
            } else if (num3 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("overlap_duration_in_ms", r2, "StoryTemplateMusicStickerDict");
            } else if (f2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("rotation", r2, "StoryTemplateMusicStickerDict");
            } else if (f3 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L(IgReactMediaPickerNativeModule.WIDTH, r2, "StoryTemplateMusicStickerDict");
            } else if (f4 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("x", r2, "StoryTemplateMusicStickerDict");
            } else if (f5 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("y", r2, "StoryTemplateMusicStickerDict");
            } else if (num4 != null || !(r2 instanceof 0c9)) {
                return new StoryTemplateMusicStickerDict(lyrics, storyTemplateMusicAssetInfoDict, str, str2, str3, str4, str5, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), f5.floatValue(), num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            } else {
                AnonymousClass7TF.A1L("z_index", r2, "StoryTemplateMusicStickerDict");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
