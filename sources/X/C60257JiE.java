package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveViewerListApi;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.JiE  reason: case insensitive filesystem */
public class C60257JiE extends 2YL {
    public final 2Fk A00;
    public final UserSession A01;
    public final IgLiveViewerListApi A02;
    public final C313666go A03;
    public final IgLiveBroadcastInfoManager A04;
    public final IgLiveHeartbeatManager A05;
    public final LES A06;
    public final C59720JVe A07;
    public final C62010KVj A08;
    public final C249513ju A09;
    public final AnonymousClass0r6 A0A;
    public final 05G A0B;

    public /* synthetic */ C60257JiE(UserSession userSession, C313666go r11, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, L9O l9o, IgLiveHeartbeatManager igLiveHeartbeatManager, LES les, C59720JVe jVe) {
        AnonymousClass0Ud A012;
        IgLiveViewerListApi igLiveViewerListApi = new IgLiveViewerListApi(userSession);
        C62010KVj A002 = C63492Kxw.A00(userSession);
        0qQ.A0B(A002, 9);
        this.A01 = userSession;
        this.A03 = r11;
        this.A07 = jVe;
        this.A04 = igLiveBroadcastInfoManager;
        this.A05 = igLiveHeartbeatManager;
        this.A06 = les;
        this.A02 = igLiveViewerListApi;
        this.A08 = A002;
        1HR A1G = JTO.A1G(0);
        this.A09 = A1G;
        this.A0A = 0u9.A04(A1G);
        02z A013 = 106.A01(Jv0.A03);
        this.A0B = A013;
        AnonymousClass0Ud r3 = igLiveBroadcastInfoManager.A06;
        AnonymousClass0Ud r4 = igLiveHeartbeatManager.A08;
        if (l9o != null) {
            A012 = l9o.A02;
        } else {
            A012 = 106.A01((Object) null);
        }
        this.A00 = DbT.A0G(MCA.A00(this, JTS.A1b(new AnonymousClass0Ud[]{A013, r3, r4, A012, les.A0Z, les.A0h, les.A0a}), 69));
    }

    public final void A00() {
        Object value;
        if (!((Jv0) this.A0B.getValue()).A02 && (value = this.A04.A06.getValue()) != null) {
            C66169MGg.A01(value, this, C318116oQ.A00(this), 6);
        }
    }

    public final void A01(String str) {
        if (this instanceof C62312Kdk) {
            C62312Kdk kdk = (C62312Kdk) this;
            DbX.A1W(kdk, str, C318116oQ.A00(kdk), 33);
            C313716gt r4 = kdk.A03;
            if (r4 != null) {
                0Aj A0e = AnonymousClass7TE.A0e(r4.A08, "live_tap_user");
                A0e.A9F("a_pk", DbV.A0q(r4.A03));
                JTQ.A10(A0e, Long.parseLong(r4.A02));
                C51965G9l.A1I(A0e, r4.A04);
                A0e.AAJ("method", "header");
                C51969G9p.A1A(A0e, r4.A07);
                A0e.Cgf();
            }
        }
    }
}
