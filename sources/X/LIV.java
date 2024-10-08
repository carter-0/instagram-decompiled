package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

public abstract class LIV {
    public static final void A01(Activity activity, UserSession userSession, C66509MUn mUn, String str) {
        0qQ.A0B(userSession, 0);
        K7R k7r = new K7R();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("args_media_id", str);
        AnonymousClass0Dg.A00(A0a, userSession);
        k7r.setArguments(A0a);
        k7r.A00 = mUn;
        C331127Pr A0W = DbS.A0W(userSession);
        0qQ.A0C(k7r, AnonymousClass000.A00(7));
        A0W.A0T = k7r;
        C331157Pu A00 = C48943Emh.A00(DbT.A0i(activity));
        if (A00 != null) {
            C331157Pu r0 = A00.A03.A02;
            if (r0 != null) {
                r0.A0F(k7r, A0W);
                return;
            }
            return;
        }
        DbU.A0y(activity, k7r, A0W);
    }

    public static final void A00(Activity activity, UserSession userSession, C66509MUn mUn, PromptStickerModel promptStickerModel, String str) {
        K7S k7s = new K7S();
        Bundle A0a = AnonymousClass7TE.A0a();
        if (promptStickerModel != null) {
            A0a.putParcelable("prompt_sticker_model", promptStickerModel.A02());
        }
        if (str != null) {
            A0a.putString("args_media_id", str);
        }
        AnonymousClass0Dg.A00(A0a, userSession);
        k7s.setArguments(A0a);
        k7s.A00 = mUn;
        C331127Pr A0W = DbS.A0W(userSession);
        0qQ.A0C(k7s, AnonymousClass000.A00(7));
        A0W.A0T = k7s;
        C331157Pu A00 = C48943Emh.A00(DbT.A0i(activity));
        if (A00 != null) {
            C331157Pu r0 = A00.A03.A02;
            if (r0 != null) {
                r0.A0F(k7s, A0W);
                return;
            }
            return;
        }
        DbU.A0y(activity, k7s, A0W);
    }
}
