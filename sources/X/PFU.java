package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class PFU implements C51928G7w {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C70272O0c A02;
    public final /* synthetic */ C71109Ocn A03;

    public final void DNf() {
    }

    public final void onCancel() {
    }

    public PFU(Context context, UserSession userSession, C70272O0c o0c, C71109Ocn ocn) {
        this.A03 = ocn;
        this.A02 = o0c;
        this.A01 = userSession;
        this.A00 = context;
    }

    public final void DZL() {
        this.A03.A05(1, 2);
        C70272O0c o0c = this.A02;
        UserSession userSession = this.A01;
        NMH nmh = new NMH(17, this.A00, o0c);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("users/turn_off_message_settings_and_set_verified/");
        1OC A0S = DbU.A0S(A0a, NHB.class, ORE.class);
        A0S.A00 = nmh;
        1ES.A06(A0S, 452886991, false);
    }

    public final void Di4() {
        this.A03.A05(1, 3);
    }
}
