package X;

import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Ek9  reason: case insensitive filesystem */
public abstract class C48786Ek9 {
    public static final StoryTemplateFillableGalleryStickerShapes A00(C354668Mx r2) {
        switch (r2.ordinal()) {
            case 0:
                return StoryTemplateFillableGalleryStickerShapes.NORMAL_CORNERS;
            case 1:
                return StoryTemplateFillableGalleryStickerShapes.CIRCLE;
            case 2:
                return StoryTemplateFillableGalleryStickerShapes.SQUARE;
            case 3:
            case 4:
            case 10:
                return StoryTemplateFillableGalleryStickerShapes.HEART;
            case 5:
            case 6:
            case 11:
                return StoryTemplateFillableGalleryStickerShapes.STAR;
            case 7:
            case 8:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
            case 15:
                return StoryTemplateFillableGalleryStickerShapes.UNRECOGNIZED;
            default:
                throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(r2, "No fillable shape defined for style: ", AnonymousClass7TE.A1A()));
        }
    }
}
