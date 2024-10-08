package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class A0W {
    public static Map A00(SpriteSheetInfoCandidates spriteSheetInfoCandidates) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (spriteSheetInfoCandidates.CHi() != null) {
            SpritesheetInfo CHi = spriteSheetInfoCandidates.CHi();
            if (CHi != null) {
                treeUpdaterJNI = CHi.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
