package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerInsightCTA;
import com.instagram.api.schemas.CreatorViewerInsightType;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CWj  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44118CWj {
    public static Map A00(C46275DTe dTe) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (dTe.At7() != null) {
            CreatorViewerInsightCTA At7 = dTe.At7();
            if (At7 != null) {
                str = At7.A00;
            } else {
                str = null;
            }
            A1H.put("cta", str);
        }
        if (dTe.BHh() != null) {
            CreatorViewerInsightType BHh = dTe.BHh();
            0qQ.A0B(BHh, 0);
            A1H.put("insight_type", BHh.A00);
        }
        if (dTe.Bdh() != null) {
            PopularReelWithFollowersInsightMetadata Bdh = dTe.Bdh();
            if (Bdh != null) {
                treeUpdaterJNI = Bdh.FHC();
            }
            A1H.put("popular_reel_with_followers_insight_metadata", treeUpdaterJNI);
        }
        if (dTe.getText() != null) {
            C41845B3m.A10(dTe.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
