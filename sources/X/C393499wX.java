package X;

import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wX  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393499wX {
    public static Map A00(StoryTemplateAvatarStickerOverlayDict storyTemplateAvatarStickerOverlayDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyTemplateAvatarStickerOverlayDict.B2z() != null) {
            A1H.put("expression_id", storyTemplateAvatarStickerOverlayDict.B2z());
        }
        if (storyTemplateAvatarStickerOverlayDict.BCt() != null) {
            A1H.put(IgReactMediaPickerNativeModule.HEIGHT, AnonymousClass7TH.A0D(storyTemplateAvatarStickerOverlayDict.BCt()));
        }
        if (storyTemplateAvatarStickerOverlayDict.BI3() != null) {
            A1H.put("instruction_key_id", storyTemplateAvatarStickerOverlayDict.BI3());
        }
        if (storyTemplateAvatarStickerOverlayDict.getMediaType() != null) {
            A1H.put("media_type", storyTemplateAvatarStickerOverlayDict.getMediaType());
        }
        if (storyTemplateAvatarStickerOverlayDict.Bof() != null) {
            A1H.put("rotation", AnonymousClass7TH.A0D(storyTemplateAvatarStickerOverlayDict.Bof()));
        }
        if (storyTemplateAvatarStickerOverlayDict.CGX() != null) {
            A1H.put(IgReactMediaPickerNativeModule.WIDTH, AnonymousClass7TH.A0D(storyTemplateAvatarStickerOverlayDict.CGX()));
        }
        if (storyTemplateAvatarStickerOverlayDict.CGt() != null) {
            A1H.put("x", AnonymousClass7TH.A0D(storyTemplateAvatarStickerOverlayDict.CGt()));
        }
        if (storyTemplateAvatarStickerOverlayDict.CHS() != null) {
            A1H.put("y", AnonymousClass7TH.A0D(storyTemplateAvatarStickerOverlayDict.CHS()));
        }
        if (storyTemplateAvatarStickerOverlayDict.CHa() != null) {
            A1H.put("z_index", storyTemplateAvatarStickerOverlayDict.CHa());
        }
        return 0Yt.A0B(A1H);
    }
}
