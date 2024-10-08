package X;

import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9wc  reason: invalid class name and case insensitive filesystem */
public abstract class C393549wc {
    public static StoryTemplateFillableGalleryStickerDictImpl parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes = null;
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            Float f5 = null;
            Integer num = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (C273654mx.A00(714).equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    storyTemplateFillableGalleryStickerShapes = (StoryTemplateFillableGalleryStickerShapes) StoryTemplateFillableGalleryStickerShapes.A01.get(str);
                    if (storyTemplateFillableGalleryStickerShapes == null) {
                        storyTemplateFillableGalleryStickerShapes = StoryTemplateFillableGalleryStickerShapes.UNRECOGNIZED;
                    }
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    f = AnonymousClass7TF.A0U(r10);
                } else if ("rotation".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r10);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    f3 = AnonymousClass7TF.A0U(r10);
                } else if ("x".equals(A17)) {
                    f4 = AnonymousClass7TF.A0U(r10);
                } else if ("y".equals(A17)) {
                    f5 = AnonymousClass7TF.A0U(r10);
                } else if ("z_index".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                }
                r10.A0z();
            }
            return new StoryTemplateFillableGalleryStickerDictImpl(storyTemplateFillableGalleryStickerShapes, f, f2, f3, f4, f5, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
