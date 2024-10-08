package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryLinkInfoDictIntf;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict;
import com.instagram.api.schemas.StoryPromptParticipationFrictionType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ceg  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44422Ceg {
    public static Map A00(StoryPromptParticipationFrictionInfoDict storyPromptParticipationFrictionInfoDict) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyPromptParticipationFrictionInfoDict.Age() != null) {
            A1H.put("body_1", storyPromptParticipationFrictionInfoDict.Age());
        }
        if (storyPromptParticipationFrictionInfoDict.Agf() != null) {
            A1H.put("body_2", storyPromptParticipationFrictionInfoDict.Agf());
        }
        String str = null;
        if (storyPromptParticipationFrictionInfoDict.Agg() != null) {
            StoryLinkInfoDictIntf Agg = storyPromptParticipationFrictionInfoDict.Agg();
            if (Agg != null) {
                treeUpdaterJNI = Agg.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("body_2_link", treeUpdaterJNI);
        }
        if (storyPromptParticipationFrictionInfoDict.B89() != null) {
            StoryPromptParticipationFrictionType B89 = storyPromptParticipationFrictionInfoDict.B89();
            if (B89 != null) {
                str = B89.A00;
            }
            A1H.put("friction_type", str);
        }
        if (storyPromptParticipationFrictionInfoDict.getTitle() != null) {
            C41845B3m.A12(storyPromptParticipationFrictionInfoDict.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
