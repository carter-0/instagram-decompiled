package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImageURIDict;
import com.instagram.api.schemas.StoryUnlockableStickerData;
import com.instagram.api.schemas.UnlockableStickerStatus;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CfQ  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44468CfQ {
    public static Map A00(StoryUnlockableStickerData storyUnlockableStickerData) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyUnlockableStickerData.getId() != null) {
            C41845B3m.A0x(storyUnlockableStickerData.getId(), A1H);
        }
        if (storyUnlockableStickerData.getName() != null) {
            C41845B3m.A0z(storyUnlockableStickerData.getName(), A1H);
        }
        String str = null;
        if (storyUnlockableStickerData.C6x() != null) {
            ImageURIDict C6x = storyUnlockableStickerData.C6x();
            if (C6x != null) {
                treeUpdaterJNI = C6x.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("thumbnail_image", treeUpdaterJNI);
        }
        if (storyUnlockableStickerData.CBf() != null) {
            UnlockableStickerStatus CBf = storyUnlockableStickerData.CBf();
            if (CBf != null) {
                str = CBf.A00;
            }
            A1H.put("unlock_status", str);
        }
        return 0Yt.A0B(A1H);
    }
}
