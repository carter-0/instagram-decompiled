package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7Gl  reason: invalid class name and case insensitive filesystem */
public final class C328837Gl {
    public final Context A00;
    public final UserSession A01;
    public final 2Dm A02;

    public static final void A00(C328837Gl r7, C254763t0 r8, MessageIdentifier messageIdentifier) {
        String str = r8.A00;
        if (str != null) {
            String str2 = messageIdentifier.A01;
            String A002 = messageIdentifier.A00();
            1ET A012 = 1ES.A01();
            1NY r2 = new 1NY(r7.A01, -2);
            r2.A04();
            r2.A0K("direct_v2/threads/%s/pin_message/", new Object[]{str});
            r2.A9m("pin_message_item_id", str2);
            r2.A9m("client_context", A002);
            r2.A0Q(1XP.class, 1XY.class);
            A012.schedule(r2.A0M());
        }
    }

    public C328837Gl(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = 1bJ.A00(userSession);
    }
}
