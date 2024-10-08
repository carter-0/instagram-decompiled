package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.List;

public final class LQu {
    public static final LQu A00 = new Object();

    public final String A01(CameraTool cameraTool, String str) {
        int ordinal;
        0qQ.A0B(cameraTool, 0);
        C59809JZd A002 = C59808JZc.A00(cameraTool);
        if (A002 == null || (ordinal = A002.ordinal()) == -1) {
            return null;
        }
        if (ordinal == 1) {
            if (str == null) {
                JTP.A1U("MEMU_STICKER_WITHOUT_PROMPT_SUMMARY", (Throwable) null);
                str = "____";
            }
            return 002.A0R(str, " me");
        } else if (ordinal == 0) {
            return str;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public static final PromptStickerModel A00(GenAIToolInfoDict genAIToolInfoDict, UserSession userSession, C63968LFv lFv, LG4 lg4) {
        String str;
        String str2;
        User A0j = DbT.A0j(userSession);
        GenAIToolInfoDict genAIToolInfoDict2 = genAIToolInfoDict;
        C63968LFv lFv2 = lFv;
        LG4 lg42 = lg4;
        if (lg4 != null) {
            User user = new User(lg42.A01, (String) null);
            user.A0u(lg42.A02);
            String str3 = lg42.A03;
            int i = (int) lg42.A00;
            List A1P = 0sr.A1P(new User[]{A0j, user});
            StoryPromptType storyPromptType = StoryPromptType.IMAGINE_ME;
            GenAIToolInfoDict genAIToolInfoDict3 = new GenAIToolInfoDict(CameraTool.IMAGINE_ME_WITH_META_AI_INTENT, genAIToolInfoDict2.A01, genAIToolInfoDict2.A02, genAIToolInfoDict2.A03, genAIToolInfoDict2.A04, genAIToolInfoDict2.A05, genAIToolInfoDict2.A06, genAIToolInfoDict2.A07, genAIToolInfoDict2.A08);
            String str4 = lg42.A04;
            if (str4 == null) {
                if (lFv2 != null) {
                    str2 = lFv2.A02;
                } else {
                    JTP.A1U("MEMU_STICKER_WITHOUT_PROMPT_SUMMARY", (Throwable) null);
                    str2 = "____";
                }
                str4 = 002.A0R(str2, " me");
            }
            return new PromptStickerModel(genAIToolInfoDict3, storyPromptType, user, AnonymousClass05K.A00, str3, "", str4, (String) null, (String) null, A1P, i, 0, false, false, false);
        }
        CameraTool cameraTool = genAIToolInfoDict2.A00;
        if (cameraTool != CameraTool.MEMU_IN_FEED_WITH_MIMICRY) {
            cameraTool = CameraTool.IMAGINE_ME_WITH_META_AI_INTENT;
        }
        List A1I = AnonymousClass7TE.A1I(A0j);
        StoryPromptType storyPromptType2 = StoryPromptType.IMAGINE_ME;
        GenAIToolInfoDict genAIToolInfoDict4 = new GenAIToolInfoDict(cameraTool, genAIToolInfoDict2.A01, genAIToolInfoDict2.A02, genAIToolInfoDict2.A03, genAIToolInfoDict2.A04, genAIToolInfoDict2.A05, genAIToolInfoDict2.A06, genAIToolInfoDict2.A07, genAIToolInfoDict2.A08);
        if (lFv2 != null) {
            str = lFv2.A02;
        } else {
            JTP.A1U("MEMU_STICKER_WITHOUT_PROMPT_SUMMARY", (Throwable) null);
            str = "____";
        }
        return new PromptStickerModel(genAIToolInfoDict4, storyPromptType2, A0j, AnonymousClass05K.A00, "", "", 002.A0R(str, " me"), (String) null, (String) null, A1I, 0, 0, false, false, false);
    }
}
