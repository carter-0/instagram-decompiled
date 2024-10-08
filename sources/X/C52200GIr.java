package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.GIr  reason: case insensitive filesystem */
public final class C52200GIr extends C46345Dco {
    public static final C52200GIr A00 = new Object();

    public static final PromptStickerModel A00(1Xj r3) {
        List A3o;
        if (r3 == null || (A3o = r3.A3o(AnonymousClass3WT.CLIPS_PROMPT)) == null || A3o.isEmpty()) {
            return null;
        }
        return ((C255783ui) A3o.get(0)).A0F();
    }

    public static final void A01(Fragment fragment, 1P0 r11, UserSession userSession, 1Xj r13, boolean z) {
        String str;
        String str2;
        1Xj r6 = r13;
        PromptStickerModel A002 = A00(r13);
        if (A002 != null && (str = A002.A03) != null) {
            UserSession userSession2 = userSession;
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            Dba.A1H(A0a, "clips/pin_for_v2_prompt/");
            A0a.A9m("media_id", r13.A2n());
            A0a.A9m("prompt_id", str);
            boolean z2 = z;
            if (z) {
                str2 = "pin";
            } else {
                str2 = "unpin";
            }
            1OC A0T = DbT.A0T(A0a, "action", str2);
            int i = 2131975968;
            if (z) {
                i = 2131969491;
            }
            Context requireContext = fragment.requireContext();
            AnonymousClass6ST r7 = new AnonymousClass6ST(requireContext, true);
            AnonymousClass0xx A0E = DbW.A0E(fragment);
            DbU.A18(requireContext, r7, i);
            A0T.A00 = new C54250H4t(requireContext, r11, userSession2, r6, r7, A0E, z2);
            1ES.A03(A0T);
        }
    }

    public final boolean A02(UserSession userSession, 1Xj r7) {
        0qQ.A0B(userSession, 0);
        PromptStickerModel A002 = A00(r7);
        if (A002 != null && r7 != null && r7.A5G() && !r7.A58() && r7.A2K() != AnonymousClass05K.A0C && 0qQ.A0K(A002.A04, C273654mx.A00(252)) && !A002.A0E) {
            return C51971G9r.A1Z(AnonymousClass7TF.A0Q(userSession), A002.A02, false);
        }
        return false;
    }
}
