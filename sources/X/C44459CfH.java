package X;

import com.instagram.api.schemas.StoryThenAndNowStickerDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CfH  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44459CfH {
    public static Map A00(StoryThenAndNowStickerDictIntf storyThenAndNowStickerDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyThenAndNowStickerDictIntf.AaI() != null) {
            A1H.put("after_string", storyThenAndNowStickerDictIntf.AaI());
        }
        if (storyThenAndNowStickerDictIntf.Afg() != null) {
            A1H.put("before_string", storyThenAndNowStickerDictIntf.Afg());
        }
        if (storyThenAndNowStickerDictIntf.getId() != null) {
            C41845B3m.A0x(storyThenAndNowStickerDictIntf.getId(), A1H);
        }
        if (storyThenAndNowStickerDictIntf.CPN() != null) {
            A1H.put("is_before", storyThenAndNowStickerDictIntf.CPN());
        }
        return 0Yt.A0B(A1H);
    }
}
