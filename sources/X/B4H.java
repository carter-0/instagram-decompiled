package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4H {
    public static Map A00(AnonymousClass1dn r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (r4.BUr() != null) {
            MusicInfo BUr = r4.BUr();
            if (BUr != null) {
                treeUpdaterJNI = BUr.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("music_info", treeUpdaterJNI);
        }
        if (r4.BZB() != null) {
            OriginalSoundDataIntf BZB = r4.BZB();
            if (BZB != null) {
                treeUpdaterJNI2 = BZB.FHC();
            }
            linkedHashMap.put("original_sound_info", treeUpdaterJNI2);
        }
        if (r4.BcV() != null) {
            linkedHashMap.put("pinned_media_ids", r4.BcV());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
