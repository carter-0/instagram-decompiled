package X;

import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cf8  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44450Cf8 {
    public static Map A00(StoryTemplateFillableMusicStickerDict storyTemplateFillableMusicStickerDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyTemplateFillableMusicStickerDict.AyE() != null) {
            A1H.put("display_type", storyTemplateFillableMusicStickerDict.AyE());
        }
        if (storyTemplateFillableMusicStickerDict.BCt() != null) {
            C41846B3n.A1O(storyTemplateFillableMusicStickerDict.BCt(), A1H);
        }
        if (storyTemplateFillableMusicStickerDict.Bof() != null) {
            C41846B3n.A1P(storyTemplateFillableMusicStickerDict.Bof(), A1H);
        }
        if (storyTemplateFillableMusicStickerDict.CGX() != null) {
            C41846B3n.A1N(storyTemplateFillableMusicStickerDict.CGX(), A1H);
        }
        if (storyTemplateFillableMusicStickerDict.CGt() != null) {
            C41846B3n.A1K(storyTemplateFillableMusicStickerDict.CGt(), A1H);
        }
        if (storyTemplateFillableMusicStickerDict.CHS() != null) {
            C41846B3n.A1L(storyTemplateFillableMusicStickerDict.CHS(), A1H);
        }
        if (storyTemplateFillableMusicStickerDict.CHa() != null) {
            A1H.put("z_index", storyTemplateFillableMusicStickerDict.CHa());
        }
        return 0Yt.A0B(A1H);
    }
}
