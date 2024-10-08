package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class OHL {
    public final Context A00;
    public final 1a8 A01 = C66580MXl.A0O();
    public final UserSession A02;
    public final O78 A03;
    public final C68988NcJ A04;
    public final C68989NcK A05;
    public final HashMap A06;

    public OHL(Context context, UserSession userSession, O78 o78) {
        C68989NcK ncK;
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = o78;
        this.A04 = C68988NcJ.A00.A00(userSession);
        synchronized (C68989NcK.A00) {
            ncK = (C68989NcK) userSession.A01(C68989NcK.class, new C73907Pli(userSession, 30));
        }
        this.A05 = ncK;
        this.A06 = AnonymousClass7TE.A1E();
    }
}
