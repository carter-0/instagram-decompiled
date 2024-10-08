package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.modal.ModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;

public abstract class HW4 {
    public static final Object A00(C307896Rx r21, AnonymousClass6Tm r22) {
        AnonymousClass8ZN r0;
        C276544tV A0P = DbY.A0P(r22, 0);
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
        boolean A0T = A0P.A0T(false);
        boolean A0R = A0P.A0R(40, false);
        String str5 = null;
        String A0K3 = A0P.A0K(140);
        if (A0K3 != null) {
            str5 = A0K3;
        }
        boolean A0R2 = A0P.A0R(42, false);
        PromptStickerModel promptStickerModel = new PromptStickerModel((GenAIToolInfoDict) null, StoryPromptType.DEFAULT, (User) null, AnonymousClass05K.A00, str3, str2, str4, str5, (String) null, 0sn.A00, A03, z ? 1 : 0, A0T, A0R, A0R2);
        if (promptStickerModel.A01 == 0) {
            0lg A0R3 = DbW.A0R(r21);
            FragmentActivity A04 = C308206Td.A04(r21);
            Class<ModalActivity> cls = ModalActivity.class;
            if (promptStickerModel.A07) {
                r0 = AnonymousClass8ZN.CLIPS_VIEWER_CREATOR_INVITE_STICKER;
            } else {
                r0 = AnonymousClass8ZN.CLIPS_VIEWER_ADD_YOURS_STICKER;
            }
            DbU.A0w(A04, A0P.A00(r0, promptStickerModel, str2), A0R3, cls, C273654mx.A00(127));
        }
        return null;
    }
}
