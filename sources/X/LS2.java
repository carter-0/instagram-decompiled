package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

public final class LS2 {
    public static final LS2 A00 = new Object();

    public static final void A01(Context context, UserSession userSession, AnonymousClass3Q2 r6, boolean z) {
        if (182.A06(0Tu.A05, userSession, 2342163288483897504L)) {
            AnonymousClass1Nd.A00(userSession).A00(new C64670Lfw(r6, false));
            return;
        }
        SimpleImageUrl A01 = C253833rU.A01(AnonymousClass7TE.A0t(r6.A33));
        Resources resources = context.getResources();
        int i = 2131968933;
        if (z) {
            i = 2131968934;
        }
        String string = resources.getString(i);
        0qQ.A0A(string);
        C56588I2s.A02(context, (MVB) null, string, A01.getUrl());
    }

    public static final void A00(Context context, UserSession userSession, AnonymousClass3Q2 r5) {
        1ua A0n = JTO.A0n(context, userSession);
        JTQ.A1J(r5, A0n, r5.A12() ? 1 : 0);
        28K.A00(userSession).A0B(DbT.A05(context));
        A0n.A0B(r5);
    }
}
