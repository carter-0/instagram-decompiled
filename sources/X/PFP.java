package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.model.DirectVisualMessageItemModel;

public final class PFP implements C74420Pua {
    public final boolean AFK(Context context, UserSession userSession, C68167N3h n3h) {
        String str;
        0qQ.A0B(n3h, 1);
        DirectVisualMessageItemModel.MediaFields.RemixMedia remixMedia = n3h.A08;
        if (remixMedia == null || (str = remixMedia.A02) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public final void ADQ(Context context, AnonymousClass0iw r3, UserSession userSession, C68167N3h n3h, PJO pjo, C70481O8g o8g) {
        AnonymousClass7TG.A1P(o8g, userSession);
        O0O.A00(userSession, o8g.A00.A0I);
    }
}
