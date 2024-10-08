package X;

import com.instagram.api.schemas.StoryTemplateGiphyStickerDict;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.8uD  reason: invalid class name and case insensitive filesystem */
public abstract class C369288uD {
    public static StoryTemplateStaticOverlayDict parseFromJson(16F r26) {
        16F r2 = r26;
        0qQ.A0B(r2, 0);
        try {
            Float f = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Float f2 = null;
            Float f3 = null;
            StoryTemplateGiphyStickerDict storyTemplateGiphyStickerDict = null;
            Float f4 = null;
            Float f5 = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("giphy_sticker_data".equals(A0q)) {
                    storyTemplateGiphyStickerDict = C369298uE.parseFromJson(r2);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f = Float.valueOf((float) r2.A0U());
                } else if ("rotation".equals(A0q)) {
                    f2 = Float.valueOf((float) r2.A0U());
                } else if ("sticker_type".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("str_id".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    f3 = Float.valueOf((float) r2.A0U());
                } else if ("x".equals(A0q)) {
                    f4 = Float.valueOf((float) r2.A0U());
                } else if ("y".equals(A0q)) {
                    f5 = Float.valueOf((float) r2.A0U());
                } else if ("z_index".equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                }
                r2.A0z();
            }
            if (f == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "StoryTemplateStaticOverlayDict");
            } else if (f2 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("rotation", "StoryTemplateStaticOverlayDict");
            } else if (str == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("sticker_type", "StoryTemplateStaticOverlayDict");
            } else if (str2 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("str_id", "StoryTemplateStaticOverlayDict");
            } else if (f3 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "StoryTemplateStaticOverlayDict");
            } else if (f4 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("x", "StoryTemplateStaticOverlayDict");
            } else if (f5 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("y", "StoryTemplateStaticOverlayDict");
            } else if (num != null || !(r2 instanceof 0c9)) {
                return new StoryTemplateStaticOverlayDict(storyTemplateGiphyStickerDict, str, str2, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), f5.floatValue(), num.intValue());
            } else {
                ((0c9) r2).A03.A00("z_index", "StoryTemplateStaticOverlayDict");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
