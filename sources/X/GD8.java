package X;

import com.instagram.common.session.UserSession;

public final class GD8 implements AnonymousClass32U {
    public final C230562pp A00;
    public final GD6 A01;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.2uc, java.lang.Object] */
    public GD8(UserSession userSession, AnonymousClass4DU r11, GD6 gd6) {
        C232872ua r2;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1O(userSession, r11);
        this.A01 = gd6;
        0Tu r22 = 0Tu.A05;
        boolean A06 = 182.A06(r22, userSession, 36311998573577059L);
        boolean A062 = 182.A06(r22, userSession, 36311998573773670L);
        boolean A063 = 182.A06(r22, userSession, 36311998573642596L);
        boolean A064 = 182.A06(r22, userSession, 36311998573708133L);
        if (A06 || A062 || A063 || A064) {
            r2 = new C232872ua(userSession, new Object(), new HB0(userSession2, A06, A062, A063, A064), r11);
        } else {
            r2 = null;
        }
        this.A00 = new C230562pp((C232872ua) null, r2, (AnonymousClass57G) null);
    }

    public final void A00(int i) {
        int i2 = i;
        if (i >= 0) {
            C52009GBg gBg = this.A01.A0A;
            if (i < gBg.A0A()) {
                this.A00.A00((0jB) null, gBg.A0E(i), i2, -1, false);
            }
        }
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void DW8(int i, int i2) {
        A00(i);
    }
}
