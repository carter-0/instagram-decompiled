package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OriginalityFollowButtonInfo;
import com.instagram.api.schemas.OriginalityInfo;
import com.instagram.api.schemas.OriginalitySourceMediaInfo;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CbE {
    public static Map A00(OriginalityInfo originalityInfo) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (originalityInfo.AkQ() != null) {
            A1H.put("can_remove_originality_label", originalityInfo.AkQ());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (originalityInfo.B6k() != null) {
            OriginalityFollowButtonInfo B6k = originalityInfo.B6k();
            if (B6k != null) {
                treeUpdaterJNI = B6k.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("follow_button_info", treeUpdaterJNI);
        }
        if (originalityInfo.BZ4() != null) {
            OriginalitySourceMediaInfo BZ4 = originalityInfo.BZ4();
            if (BZ4 != null) {
                treeUpdaterJNI2 = BZ4.FHC();
            }
            A1H.put("original_media", treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
