package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class LE2 {
    public final Context A00;
    public final UserSession A01;
    public final C3499682q A02;
    public final C59899JbO A03;
    public final C62320sa A04;
    public final C62320sa A05;
    public final 0sP A06;

    public final void A00(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass6SR.A01().A0W = true;
        this.A03.A0B(C16581Uxb.FEED_SHARING, "media_broadcast_share", LTZ.A0I(this.A01, this.A02, false));
        if (!AnonymousClass6SR.A01().A0X) {
            this.A06.invoke(view);
        }
    }

    public LE2(Context context, UserSession userSession, C3499682q r3, C59899JbO jbO, C62320sa r5, C62320sa r6, 0sP r7) {
        AnonymousClass7TG.A1Q(jbO, userSession);
        this.A00 = context;
        this.A03 = jbO;
        this.A01 = userSession;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r5;
        this.A04 = r6;
    }
}
