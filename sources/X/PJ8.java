package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class PJ8 implements G6H {
    public final Context A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        NMI nmi = new NMI((Object) context, 33);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("users/turn_off_message_requests/");
        1OC A0S = DbU.A0S(A0a, NHB.class, ORE.class);
        A0S.A00 = nmi;
        1ES.A06(A0S, 1206419101, false);
    }

    public PJ8(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
