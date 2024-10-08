package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class GC1 {
    public boolean A00;
    public final GC0 A01;
    public final C52016GBn A02;
    public final C52012GBj A03;
    public final Context A04;
    public final UserSession A05;

    public GC1(Context context, UserSession userSession, GC0 gc0, C52016GBn gBn, C52012GBj gBj) {
        DbW.A1N(gBn, 3, userSession);
        this.A04 = context;
        this.A03 = gBj;
        this.A02 = gBn;
        this.A01 = gc0;
        this.A05 = userSession;
        gBn.A05 = C58711IwK.A00(this, 40);
    }
}
