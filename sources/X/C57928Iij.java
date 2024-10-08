package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Iij  reason: case insensitive filesystem */
public final class C57928Iij implements Runnable {
    public final /* synthetic */ AnonymousClass30Y A00;
    public final /* synthetic */ GJU A01;
    public final /* synthetic */ GYI A02;

    public C57928Iij(AnonymousClass30Y r1, GJU gju, GYI gyi) {
        this.A01 = gju;
        this.A00 = r1;
        this.A02 = gyi;
    }

    public final void run() {
        GJU gju = this.A01;
        if (gju != null) {
            AnonymousClass30Y r2 = this.A00;
            C52054GDa gDa = ((C52058GDe) r2.A04).A0F;
            if (gDa != null) {
                GYI gyi = this.A02;
                C52206GIx A002 = ((C55944Hq8) gDa.A04.getValue()).A00(gju);
                AnonymousClass4DU r4 = gyi.A02;
                UserSession userSession = gyi.A01;
                Object obj = r2.A03;
                0qQ.A06(obj);
                C55259Heo.A00((C267324bN) obj, userSession, r4, A002, gDa, gju, "scrollback_0s", gyi.A03.CFD(), true);
            }
        }
    }
}
