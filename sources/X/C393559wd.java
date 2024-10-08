package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableStickersDict;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9wd  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393559wd {
    public static Map A00(StoryTemplateFillableStickersDict storyTemplateFillableStickersDict) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (storyTemplateFillableStickersDict.B5n() != null) {
            List<StoryTemplateFillableGalleryStickerDict> B5n = storyTemplateFillableStickersDict.B5n();
            if (B5n != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (StoryTemplateFillableGalleryStickerDict storyTemplateFillableGalleryStickerDict : B5n) {
                    if (storyTemplateFillableGalleryStickerDict != null) {
                        arrayList.add(storyTemplateFillableGalleryStickerDict.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put(C273654mx.A00(2376), arrayList);
        }
        if (storyTemplateFillableStickersDict.B5o() != null) {
            StoryTemplateFillableMusicStickerDict B5o = storyTemplateFillableStickersDict.B5o();
            if (B5o != null) {
                treeUpdaterJNI = B5o.FHC();
            }
            A1H.put(C273654mx.A00(2377), treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
