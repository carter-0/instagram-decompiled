package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class PJ2 implements G6H {
    public final Context A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        1NY A0a = AnonymousClass7TG.A0a(this.A01);
        A0a.A0A("users/set_message_settings_v2/");
        A0a.A9m("ig_followers", "primary");
        A0a.A9m("others_on_ig", "primary");
        1OC A0S = DbU.A0S(A0a, NHB.class, ORE.class);
        NMI.A00(A0S, this, 27);
        1ES.A03(A0S);
    }

    public PJ2(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
