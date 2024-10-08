package X;

import com.instagram.api.schemas.StoryTemplateReshareMediaDict;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CfA  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44452CfA {
    public static Map A00(StoryTemplateReshareMediaDict storyTemplateReshareMediaDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyTemplateReshareMediaDict.Als() != null) {
            A1H.put(C273654mx.A00(66), storyTemplateReshareMediaDict.Als());
        }
        if (storyTemplateReshareMediaDict.getMediaId() != null) {
            C41845B3m.A13(storyTemplateReshareMediaDict.getMediaId(), A1H);
        }
        if (storyTemplateReshareMediaDict.getUserId() != null) {
            A1H.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, storyTemplateReshareMediaDict.getUserId());
        }
        return 0Yt.A0B(A1H);
    }
}
