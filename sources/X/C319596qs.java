package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.6qs  reason: invalid class name and case insensitive filesystem */
public abstract class C319596qs {
    public static final BusinessFlowAnalyticsLogger A00(C319586qr r1, AnonymousClass0iw r2, 0lg r3, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        0qQ.A0B(r3, 0);
        switch (r1.ordinal()) {
            case 0:
                businessFlowAnalyticsLogger = new XFF(r2, r3, str);
                break;
            case 1:
            case 10:
                businessFlowAnalyticsLogger = new C22333Xzi(r2, r3, str);
                break;
            case 2:
            case 9:
                businessFlowAnalyticsLogger = new C22335Xzk(r2, r3, str);
                break;
            case 4:
                businessFlowAnalyticsLogger = new C318846pd(r2, r3, str);
                break;
            case 5:
                businessFlowAnalyticsLogger = new C22336Xzl(r2, r3, str);
                break;
            case 6:
                businessFlowAnalyticsLogger = new C22337Xzm(r2, r3, str);
                break;
            case 7:
                businessFlowAnalyticsLogger = new C22334Xzj(r2, r3, str);
                break;
            default:
                return null;
        }
        return businessFlowAnalyticsLogger;
    }

    public static final BusinessFlowAnalyticsLogger A01(C319586qr r1, 0lg r2, String str, String str2) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(str, 1);
        return A00(r1, new 0xG(str), r2, str2);
    }

    public static final C22338Xzn A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C22338Xzn) userSession.A01(C22338Xzn.class, new C41566AwY(1, new 0xG("waterfall_inspiration_hub"), userSession));
    }
}
