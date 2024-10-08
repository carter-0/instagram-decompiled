package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.NCq  reason: case insensitive filesystem */
public final class C68367NCq extends ConnectFunnelProxy {
    public final UserSession A00;

    public C68367NCq(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void markPoint(String str, int i) {
        0qQ.A0B(str, 0);
        C70320O1y.A00(this.A00);
        OWf.A00(str, i);
    }

    public final void upload(String str, McfReference mcfReference) {
        0qQ.A0B(str, 0);
        C70320O1y.A00(this.A00);
        C71004OWb.A00.A00("IGRTCProductFunnelLogger", 002.A0R("succeed ", str));
        ConnectFunnel.CProxy.succeed(str, mcfReference);
    }

    public final void annotateMultiple(String str, Map map, Map map2, Map map3, Map map4) {
        AnonymousClass7TG.A1N(str, map);
        C70320O1y.A00(this.A00);
        ConnectFunnel.CProxy.annotateMultiple(str, map);
    }

    public final void associateCallIds(String str, String str2, boolean z) {
        AnonymousClass7TG.A1N(str, str2);
        OWf A002 = C70320O1y.A00(this.A00);
        C71004OWb.A00.A00("IGRTCProductFunnelLogger", 002.A0u("associateCallIds(): sharedCallId=", str, " localCallId=", str2));
        A002.A00 = str2;
        ConnectFunnel.CProxy.associateCallIds(str, str2, z);
        AnonymousClass4k9.A00(A002.A02).A06(str2, str);
    }

    public final void start(String str, int i, Map map) {
        DbY.A1S(str, map);
        C70320O1y.A00(this.A00).A05(str, i, map);
    }
}
