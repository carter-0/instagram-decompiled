package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;

public abstract class HW5 {
    public static final Object A00(C307896Rx r21, AnonymousClass6Tm r22) {
        28D r9;
        AnonymousClass6Tm r0 = r22;
        C276544tV A0P = DbY.A0P(r0, 0);
        Object A0g = DbW.A0g(r0, 1);
        String str = "";
        String str2 = str;
        String A0J = A0P.A0J();
        if (A0J != null) {
            str2 = A0J;
        }
        String str3 = str;
        String A0K = A0P.A0K(45);
        if (A0K != null) {
            str3 = A0K;
        }
        String str4 = null;
        String A0K2 = A0P.A0K(46);
        if (A0K2 != null) {
            str4 = A0K2;
        }
        int A03 = A0P.A03(44, 0);
        String A0D = A0P.A0D();
        if (A0D != null) {
            str = A0D;
        }
        boolean z = !str.equals("ENABLED");
        boolean A0T = A0P.A0T(true);
        boolean A0R = A0P.A0R(40, false);
        String str5 = null;
        String A0K3 = A0P.A0K(140);
        if (A0K3 != null) {
            str5 = A0K3;
        }
        boolean A0R2 = A0P.A0R(42, false);
        PromptStickerModel promptStickerModel = new PromptStickerModel((GenAIToolInfoDict) null, StoryPromptType.DEFAULT, (User) null, AnonymousClass05K.A00, str3, str2, str4, str5, (String) null, 0sn.A00, A03, z ? 1 : 0, A0T, A0R, A0R2);
        UserSession A0R3 = DbW.A0R(r21);
        FragmentActivity A04 = C308206Td.A04(r21);
        Fragment A01 = C308206Td.A01(r21);
        if (0qQ.A0K(A0g, "PROMPT_CARD")) {
            r9 = 28D.A08;
        } else if (0qQ.A0K(A0g, "PROMPT_TILE")) {
            r9 = 28D.A09;
        } else {
            r9 = 28D.A5J;
        }
        I3M.A02(A04, A01, r9, A0R3, (1Xj) null, promptStickerModel);
        return null;
    }
}
