package X;

import com.facebook.messenger.mcp.integration.MCPPluginsRegistryIntegration;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnelProxy;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class OWf {
    public String A00;
    public String A01;
    public final UserSession A02;
    public final ConnectFunnelProxy A03 = new NE2(this);

    public OWf(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        MCPPluginsRegistryIntegration.nativePreregisterMCPPluginsRegistry();
        AnonymousClass95K.A00();
    }

    public static final void A00(String str, int i) {
        0qQ.A0B(str, 0);
        C71004OWb.A00.A00("IGRTCProductFunnelLogger", 002.A05(i, "markPointWithLocalCallId(): ", " for call id ", str));
        ConnectFunnel.CProxy.markPoint(str, i, (Long) null);
    }

    public final void A04(String str) {
        0qQ.A0B(str, 0);
        String str2 = this.A01;
        if (str2 != null) {
            C71004OWb.A00.A00("IGRTCProductFunnelLogger", 002.A0R("setOriginAnnotation: ", str));
            ConnectFunnel.CProxy.annotateMultipleTyped(str2, C66582MXn.A0y(20, str), (Map) null, (Map) null);
        }
    }

    public final void A05(String str, int i, Map map) {
        0qQ.A0B(str, 0);
        boolean startWithProxy = ConnectFunnel.CProxy.startWithProxy(this.A03, str, i, (Long) null, map);
        if (startWithProxy) {
            this.A00 = str;
            AnonymousClass4k9.A00(this.A02).A06((String) null, this.A00);
        }
        C71004OWb oWb = C71004OWb.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("start(): started=");
        A1A.append(startWithProxy);
        A1A.append(' ');
        A1A.append(str);
        A1A.append(" with point ");
        A1A.append(i);
        A1A.append(" sessionId=");
        oWb.A00("IGRTCProductFunnelLogger", AnonymousClass7TF.A0l(this.A01, A1A));
    }

    public final void A01(int i) {
        C71004OWb oWb = C71004OWb.A00;
        oWb.A00("IGRTCProductFunnelLogger", 002.A0O("logProductFunnelStart(): start point=", i));
        String str = this.A01;
        if (str != null) {
            this.A00 = str;
            AnonymousClass4k9.A00(this.A02).A06(this.A00, (String) null);
            oWb.A00("IGRTCProductFunnelLogger", 002.A1A("logProductFunnelStart(): started=", " sessionId=", this.A01, ConnectFunnel.CProxy.startWithProxy(this.A03, str, i, (Long) null, (Map) null)));
            A02(2);
        }
    }

    public final void A02(int i) {
        C71004OWb.A00.A00("IGRTCProductFunnelLogger", 002.A0O("markPoint(): ", i));
        String str = this.A01;
        if (str != null) {
            A00(str, i);
        }
        String str2 = this.A00;
        if (str2 != null) {
            A00(str2, i);
        }
    }

    public final void A03(Integer num) {
        String str;
        String str2;
        C71004OWb oWb = C71004OWb.A00;
        String str3 = this.A00;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                str = "FULL_SCREEN_RING";
                break;
            case 1:
                str = "PUSH_NOTIFICATION";
                break;
            case 2:
                str = "JOIN_BUTTON_INBOX";
                break;
            case 3:
                str = "JOIN_BUTTON_XMA";
                break;
            default:
                str = "JOIN_BUTTON_THREAD_HEADER";
                break;
        }
        oWb.A00("IGRTCProductFunnelLogger", 002.A0u("accept call: ", str3, " with source ", str));
        String str4 = this.A00;
        if (str4 != null) {
            ConnectFunnel.CProxy.markPoint(str4, 12, (Long) null);
            String str5 = this.A00;
            switch (intValue) {
                case 0:
                    str2 = "FULL_SCREEN_RING";
                    break;
                case 1:
                    str2 = "PUSH_NOTIFICATION";
                    break;
                case 2:
                    str2 = "JOIN_BUTTON_INBOX";
                    break;
                case 3:
                    str2 = "JOIN_BUTTON_XMA";
                    break;
                default:
                    str2 = "JOIN_BUTTON_THREAD_HEADER";
                    break;
            }
            ConnectFunnel.CProxy.annotateMultipleTyped(str5, C66582MXn.A0y(29, str2), (Map) null, (Map) null);
        }
    }
}
