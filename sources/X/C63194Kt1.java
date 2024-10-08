package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Kt1  reason: case insensitive filesystem */
public abstract class C63194Kt1 {
    public static final PromptStickerModel A00(GenAIToolInfoDict genAIToolInfoDict, UserSession userSession) {
        User A0j = DbT.A0j(userSession);
        List A1I = AnonymousClass7TE.A1I(A0j);
        StoryPromptType storyPromptType = StoryPromptType.IMAGINE;
        GenAIToolInfoDict genAIToolInfoDict2 = genAIToolInfoDict;
        String str = genAIToolInfoDict2.A01;
        String str2 = genAIToolInfoDict2.A02;
        String str3 = genAIToolInfoDict2.A03;
        String str4 = genAIToolInfoDict2.A04;
        String str5 = genAIToolInfoDict2.A05;
        String str6 = genAIToolInfoDict2.A06;
        String str7 = genAIToolInfoDict2.A07;
        String str8 = genAIToolInfoDict2.A08;
        CameraTool cameraTool = C63525Kya.A00;
        0qQ.A0B(cameraTool, 0);
        return new PromptStickerModel(new GenAIToolInfoDict(cameraTool, str, str2, str3, str4, str5, str6, str7, str8), storyPromptType, A0j, AnonymousClass05K.A00, "", "", (String) null, (String) null, (String) null, A1I, 0, 0, false, false, false);
    }
}
