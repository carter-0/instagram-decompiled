package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class OLG {
    public C70517O9q A00;
    public final OZx A01;
    public final Context A02;
    public final UserSession A03;

    public OLG(Context context, UserSession userSession, OZx oZx) {
        0qQ.A0B(oZx, 3);
        this.A03 = userSession;
        this.A02 = context;
        this.A01 = oZx;
    }

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        1NY A0b = AnonymousClass7TG.A0b(this.A03);
        A0b.A0A("video_call/cowatch/clips_media_feed/");
        1OC A0S = DbU.A0S(A0b, C298815u5.class, AnonymousClass93W.class);
        A0S.A00 = new NM2(str, this, 4);
        1ES.A03(A0S);
    }
}
