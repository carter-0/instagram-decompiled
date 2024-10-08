package X;

import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.Tun  reason: case insensitive filesystem */
public final class C14358Tun {
    public GXR A00;
    public C14393TvM A01;
    public C14077TpR A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C14382TvB.A00);

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.X6I] */
    /* JADX WARNING: type inference failed for: r12v1, types: [X.VM9, java.lang.Object] */
    public final C14077TpR A00(UserSession userSession) {
        C14077TpR tpR = this.A02;
        if (tpR != null) {
            return tpR;
        }
        AutoplayLayout autoplayLayout = AutoplayLayout.EXPLORE_DIAGONAL;
        0Tu r2 = 0Tu.A05;
        UserSession userSession2 = userSession;
        if (!182.A06(r2, userSession2, 36320777485689688L) || !182.A06(r2, userSession2, 36320777485755225L)) {
            return null;
        }
        C14321Ttw ttw = (C14321Ttw) this.A03.getValue();
        boolean A1Y = C51970G9q.A1Y(ttw);
        C14079TpT tpT = new C14079TpT(autoplayLayout, userSession2);
        C14078TpS tpS = new C14078TpS(new Object(), new C14081TpV(tpT), new C14080TpU(userSession2), autoplayLayout, userSession2);
        C14088Tpf tpf = new C14088Tpf(tpS, AnonymousClass3OE.A00(userSession2));
        C61410nE r6 = C61410nE.A00;
        C14082TpW tpW = new C14082TpW(tpS, ttw, r6);
        C14083TpX tpX = new C14083TpX(ttw, tpW, r6);
        tpW.A00 = tpX;
        ? obj = new Object();
        obj.A00 = A1Y;
        C14384TvD tvD = new C14384TvD(tpS, tpW, r6);
        C14352Tuh tuh = new C14352Tuh(tpS, tpT, r6);
        C14078TpS tpS2 = tpS;
        C14088Tpf tpf2 = tpf;
        C14384TvD tvD2 = tvD;
        C14336TuJ tuJ = new C14336TuJ(tpS2, tpf2, tvD2, tuh, tpW, tpX);
        C14336TuJ tuJ2 = tuJ;
        C14389TvI tvI = new C14389TvI(tpS2, tuJ2, tpf, tvD, tuh);
        C14390TvJ tvJ = new C14390TvJ(ttw, tuJ2, tuh, tpW, tpX);
        new C14392TvL(tuh, tpT, userSession2);
        C14077TpR tpR2 = new C14077TpR(tpS, tuJ, tvI, tvJ, obj, tpW, tpX);
        this.A02 = tpR2;
        return tpR2;
    }
}
