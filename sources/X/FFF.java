package X;

import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;

public abstract class FFF {
    public static final void A01(UserSession userSession, String str) {
        0qQ.A0B(str, 1);
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "open_creator_tools";
        0Aj A0e = AnonymousClass7TE.A0e(r1.A00(), "ig_open_creator_tool");
        if (A0e.isSampled()) {
            DbS.A1I(A0e, "reliability");
            A0e.AAJ("error_message", str);
            A0e.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, RealtimeConstants.SEND_FAIL);
            A0e.Cgf();
        }
    }

    public static final void A02(UserSession userSession, String str) {
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "open_creator_tools";
        0Aj A0e = AnonymousClass7TE.A0e(r1.A00(), "ig_open_creator_tool");
        if (A0e.isSampled()) {
            DbS.A1I(A0e, "impression");
            A0e.AAJ("screen", str);
            A0e.Cgf();
        }
    }

    public static final String A00(ValuePropsFlow valuePropsFlow) {
        switch (valuePropsFlow.ordinal()) {
            case 2:
                return "value_prop_insights";
            case 4:
                return "value_prop_inspiration";
            case 5:
                return "value_prop_bonuses";
            case 6:
                return "value_prop_subscriptions";
            case 7:
                return "value_prop_badges";
            case 8:
                return "value_prop_creator_marketplace";
            default:
                return "accounts";
        }
    }

    public static final void A03(UserSession userSession, String str, String str2) {
        AnonymousClass0kM A0M = DbY.A0M(userSession);
        A0M.A01 = "open_creator_tools";
        0Aj A0e = AnonymousClass7TE.A0e(A0M.A00(), "ig_open_creator_tool");
        if (A0e.isSampled()) {
            DbS.A1I(A0e, "click");
            A0e.AAJ("screen", str);
            A0e.AAJ("target", str2);
            A0e.Cgf();
        }
    }
}
