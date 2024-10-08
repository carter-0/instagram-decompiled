package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;

public final class JWJ {
    public C344207rU A00;
    public final Context A01;
    public final Handler A02;
    public final C343927r2 A03;
    public final UserSession A04;

    public final C364988mL A00(C365328mu r3) {
        C345807u7 r0;
        C344207rU r1 = this.A00;
        if (r1 == null || (r0 = (C345807u7) r1.A02(C345807u7.A00)) == null) {
            return null;
        }
        return r0.AMq(r3);
    }

    public JWJ(Context context, UserSession userSession) {
        this.A01 = context;
        this.A04 = userSession;
        C343897qz r1 = new C343897qz();
        this.A03 = r1;
        this.A02 = r1.BAM("Lite-Controller-Thread");
    }
}
