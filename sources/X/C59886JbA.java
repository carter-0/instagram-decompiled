package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.JbA  reason: case insensitive filesystem */
public abstract class C59886JbA {
    public static final boolean A00(Context context, 28D r7, UserSession userSession, C357638Yz r9, PromptStickerModel promptStickerModel) {
        28D r1 = r7;
        UserSession userSession2 = userSession;
        int A02 = DbW.A02(0, userSession, r7);
        if (AnonymousClass7TF.A0g(userSession2) != null) {
            return false;
        }
        Context context2 = context;
        27p.A00(context2, userSession2, (String) null, (String) null, (String) null, (String) null).A18(r1, C59725JVj.PRE_CAPTURE, r9, (C2801950r) null, promptStickerModel, (List) null, AnonymousClass4x3.A00(context2), A02);
        return true;
    }
}
