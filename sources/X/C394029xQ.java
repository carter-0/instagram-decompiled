package X;

import android.content.Context;
import com.instagram.api.schemas.ElectionAddYoursInfoDict;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9xQ  reason: invalid class name and case insensitive filesystem */
public abstract class C394029xQ {
    public static final C347017w8 A00(Context context, StoryPromptTappableData storyPromptTappableData, UserSession userSession, String str) {
        List list;
        ElectionAddYoursInfoDict electionAddYoursInfoDict = storyPromptTappableData.A01;
        if (electionAddYoursInfoDict == null || (list = electionAddYoursInfoDict.A02) == null || list.isEmpty()) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            PromptStickerModel promptStickerModel = new PromptStickerModel(new C17946Vib(storyPromptTappableData).A00());
            promptStickerModel.A0B(A18);
            A1C.add(new C59812JZg(context, userSession, promptStickerModel, str));
        }
        int i = 2131970897;
        if (AnonymousClass0t1.A01.A01(userSession).A0N() == AnonymousClass05K.A0C) {
            i = 2131970896;
        }
        return new C347017w8(context, userSession, AnonymousClass7TE.A16(context, i), A1C);
    }
}
