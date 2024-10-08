package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class WFR implements X2E {
    public final /* synthetic */ C14723U4m A00;
    public final /* synthetic */ C15033UKm A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C70826OMy A03;
    public final /* synthetic */ C17960Vit A04;

    public WFR(C14723U4m u4m, C15033UKm uKm, UserSession userSession, C70826OMy oMy, C17960Vit vit) {
        this.A01 = uKm;
        this.A02 = userSession;
        this.A00 = u4m;
        this.A04 = vit;
        this.A03 = oMy;
    }

    public final void DPZ(WFU wfu) {
        List list;
        C70645OEr oEr;
        C15033UKm uKm = this.A01;
        if (uKm == null || (oEr = uKm.A02) == null) {
            list = null;
        } else {
            list = oEr.A01;
        }
        0qQ.A0C(list, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.discovery.mediamap.model.MediaMapPin>");
        UserSession userSession = this.A02;
        WZ3 wz3 = new WZ3();
        Context context = wfu.A0G;
        0qQ.A07(context);
        int A09 = C13988Tno.A09(context, 44);
        wfu.A0A(new UH0((X8E) new WFB(wfu, userSession, wz3, list, A09, Math.round(C16079Uo6.A00(context, (float) A09))), wfu));
        wfu.A06 = new WFH(0, this.A03, this.A04);
        C14723U4m u4m = this.A00;
        C18682Vwg.A01(wfu, list, u4m.getHeight(), u4m.getWidth());
    }
}
