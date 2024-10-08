package X;

import com.instagram.api.schemas.StoryUnlockableStickerData;
import com.instagram.api.schemas.StoryUnlockableStickerTappableObject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CfS  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44470CfS {
    public static Map A00(StoryUnlockableStickerTappableObject storyUnlockableStickerTappableObject) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyUnlockableStickerTappableObject.Bzq() != null) {
            List<StoryUnlockableStickerData> Bzq = storyUnlockableStickerTappableObject.Bzq();
            ArrayList arrayList = null;
            if (Bzq != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (StoryUnlockableStickerData storyUnlockableStickerData : Bzq) {
                    if (storyUnlockableStickerData != null) {
                        arrayList.add(storyUnlockableStickerData.FHC());
                    }
                }
            }
            A1H.put("stickers", arrayList);
        }
        if (storyUnlockableStickerTappableObject.getSubtitle() != null) {
            A1H.put("subtitle", storyUnlockableStickerTappableObject.getSubtitle());
        }
        if (storyUnlockableStickerTappableObject.getTitle() != null) {
            C41845B3m.A12(storyUnlockableStickerTappableObject.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
