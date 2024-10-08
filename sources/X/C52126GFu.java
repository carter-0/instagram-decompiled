package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GFu  reason: case insensitive filesystem */
public final class C52126GFu implements AnonymousClass2xU {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ GFJ A01;
    public final /* synthetic */ boolean A02;

    public C52126GFu(1Xj r1, GFJ gfj, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = gfj;
    }

    public final void DQp(AnonymousClass3W1 r14, int i) {
        C52054GDa gDa;
        C55944Hq8 hq8;
        GJU gju;
        0qQ.A0B(r14, 0);
        if (i == 46 && 0qQ.A0K(r14.A0y, true) && r14.A1q && !this.A02) {
            1Xj r4 = this.A00;
            GFJ gfj = this.A01;
            UserSession userSession = gfj.A0A;
            0qQ.A0B(r4, 0);
            0qQ.A0B(userSession, 1);
            if (r4.A4Q() || !182.A06(0Tu.A05, userSession, 36323169782475723L)) {
                gDa = gfj.A08.A0F;
                if (r4.A4Q() || !GQ3.A00(userSession, gDa) || !182.A06(0Tu.A05, userSession, 36320236320006264L)) {
                    if (!r4.A4Q() && GQ3.A00(userSession, gDa) && 182.A06(0Tu.A05, userSession, 36320236320596097L) && gDa != null) {
                        hq8 = (C55944Hq8) gDa.A04.getValue();
                        gju = GJU.MID_SCENE;
                    } else {
                        return;
                    }
                } else if (gDa != null) {
                    hq8 = (C55944Hq8) gDa.A04.getValue();
                    gju = GJU.HIGHLIGHT_CTA;
                } else {
                    return;
                }
            } else {
                gDa = gfj.A08.A0F;
                if (gDa != null) {
                    hq8 = (C55944Hq8) gDa.A04.getValue();
                    gju = GJU.ANIMATE_PE_COLLECTION;
                } else {
                    return;
                }
            }
            C52206GIx A002 = hq8.A00(gju);
            C55259Heo.A00(gfj.A06, userSession, gfj.A0C, A002, gDa, gju, "expand_caption", gfj.A0T, true);
        }
    }
}
