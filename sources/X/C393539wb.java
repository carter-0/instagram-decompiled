package X;

import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wb  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393539wb {
    public static Map A00(StoryTemplateFillableGalleryStickerDict storyTemplateFillableGalleryStickerDict) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyTemplateFillableGalleryStickerDict.B8s() != null) {
            StoryTemplateFillableGalleryStickerShapes B8s = storyTemplateFillableGalleryStickerDict.B8s();
            if (B8s != null) {
                str = B8s.A00;
            } else {
                str = null;
            }
            A1H.put(C273654mx.A00(714), str);
        }
        if (storyTemplateFillableGalleryStickerDict.BCt() != null) {
            A1H.put(IgReactMediaPickerNativeModule.HEIGHT, AnonymousClass7TH.A0D(storyTemplateFillableGalleryStickerDict.BCt()));
        }
        if (storyTemplateFillableGalleryStickerDict.Bof() != null) {
            A1H.put("rotation", AnonymousClass7TH.A0D(storyTemplateFillableGalleryStickerDict.Bof()));
        }
        if (storyTemplateFillableGalleryStickerDict.CGX() != null) {
            A1H.put(IgReactMediaPickerNativeModule.WIDTH, AnonymousClass7TH.A0D(storyTemplateFillableGalleryStickerDict.CGX()));
        }
        if (storyTemplateFillableGalleryStickerDict.CGt() != null) {
            A1H.put("x", AnonymousClass7TH.A0D(storyTemplateFillableGalleryStickerDict.CGt()));
        }
        if (storyTemplateFillableGalleryStickerDict.CHS() != null) {
            A1H.put("y", AnonymousClass7TH.A0D(storyTemplateFillableGalleryStickerDict.CHS()));
        }
        if (storyTemplateFillableGalleryStickerDict.CHa() != null) {
            A1H.put("z_index", storyTemplateFillableGalleryStickerDict.CHa());
        }
        return 0Yt.A0B(A1H);
    }
}
