package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;

public final class PFQ implements C74420Pua {
    public final void ADQ(Context context, AnonymousClass0iw r11, UserSession userSession, C68167N3h n3h, PJO pjo, C70481O8g o8g) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        AnonymousClass0iw r3 = r11;
        UserSession userSession2 = userSession;
        C51974G9v.A1P(o8g, n3h, userSession, r11);
        PJO pjo2 = pjo;
        0qQ.A0B(pjo, 5);
        C271434iq r0 = n3h.A07;
        if (r0 != null) {
            CreativeConfigIntf creativeConfigIntf = r0.A00;
            String str = (String) r0.A03.get();
            C316316lS r7 = o8g.A00.A0R;
            ViewGroup viewGroup = r7.A00;
            if (viewGroup != null) {
                new AnonymousClass6XB(context2, viewGroup, r3, userSession2, creativeConfigIntf, pjo2, r7, str).A04();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final boolean AFK(Context context, UserSession userSession, C68167N3h n3h) {
        AnonymousClass7TG.A1T(context, n3h, userSession);
        C271434iq r0 = n3h.A07;
        if (r0 == null || !C309136Xb.A01(context, userSession, r0.A00)) {
            return false;
        }
        return true;
    }
}
