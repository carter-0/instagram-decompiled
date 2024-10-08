package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;

/* renamed from: X.Odf  reason: case insensitive filesystem */
public abstract class C71137Odf {
    public static final long A00(UserSession userSession) {
        return DbY.A04(AnonymousClass7TE.A10(userSession.A06));
    }

    public static void A01(0Aj r2, UserSession userSession) {
        r2.A9F("actor_id", Long.valueOf(A00(userSession)));
    }

    public static final void A02(C69483NmR nmR, C69459Nm3 nm3, UserSession userSession, DirectThreadAnalyticsParams directThreadAnalyticsParams) {
        0Aj A0C = C66584MXp.A0C(userSession);
        if (A0C.isSampled()) {
            A01(A0C, userSession);
            C66584MXp.A0m(nmR, nm3, A0C, "get_safety_tips_click");
            C66583MXo.A17(A0C, C66584MXp.A0R(C66583MXo.A0I(A0C, directThreadAnalyticsParams, C66583MXo.A0f(directThreadAnalyticsParams)), A0C, directThreadAnalyticsParams));
        }
    }

    public static final void A03(C69483NmR nmR, UserSession userSession, DirectThreadAnalyticsParams directThreadAnalyticsParams) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "mwb_odnc_interaction_event");
        if (A0e.isSampled()) {
            A01(A0e, userSession);
            A0e.AAJ(TraceFieldType.AdhocEventName, "dialog_ok_click");
            DbS.A1F(nmR, A0e);
            A0e.A8M(C69459Nm3.SENDER, "user_role");
            C66583MXo.A17(A0e, C66584MXp.A0R(C66583MXo.A0I(A0e, directThreadAnalyticsParams, C66583MXo.A0f(directThreadAnalyticsParams)), A0e, directThreadAnalyticsParams));
        }
    }

    public static final void A04(C69483NmR nmR, UserSession userSession, DirectThreadAnalyticsParams directThreadAnalyticsParams, boolean z) {
        C69459Nm3 nm3;
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "mwb_odnc_interaction_event");
        if (A0e.isSampled()) {
            if (z) {
                nm3 = C69459Nm3.SENDER;
            } else {
                nm3 = C69459Nm3.RECEIVER;
            }
            A01(A0e, userSession);
            C66584MXp.A0m(nmR, nm3, A0e, "blur_impression");
            C66584MXp.A0p(A0e, directThreadAnalyticsParams);
        }
        ((C72189Oxy) userSession.A01(C72189Oxy.class, new C73914Plp(userSession, 13))).A00 = true;
    }

    public static final void A05(C69483NmR nmR, UserSession userSession, DirectThreadAnalyticsParams directThreadAnalyticsParams, boolean z) {
        C69459Nm3 nm3;
        0Aj A0C = C66584MXp.A0C(userSession);
        if (A0C.isSampled()) {
            if (z) {
                nm3 = C69459Nm3.SENDER;
            } else {
                nm3 = C69459Nm3.RECEIVER;
            }
            A01(A0C, userSession);
            C66584MXp.A0m(nmR, nm3, A0C, "unblur_click");
            C66584MXp.A0p(A0C, directThreadAnalyticsParams);
        }
    }

    public static final void A06(C69459Nm3 nm3, UserSession userSession, DirectThreadAnalyticsParams directThreadAnalyticsParams) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "mwb_odnc_interaction_event");
        if (A0e.isSampled()) {
            A01(A0e, userSession);
            A0e.AAJ(TraceFieldType.AdhocEventName, "bottom_sheet_impression");
            DbS.A1F(C69483NmR.IN_THREAD, A0e);
            A0e.A8M(nm3, "user_role");
            C66583MXo.A17(A0e, C66584MXp.A0R(C66583MXo.A0I(A0e, directThreadAnalyticsParams, C66583MXo.A0f(directThreadAnalyticsParams)), A0e, directThreadAnalyticsParams));
        }
    }

    public static final void A07(C69459Nm3 nm3, UserSession userSession, DirectThreadAnalyticsParams directThreadAnalyticsParams) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "mwb_odnc_interaction_event");
        if (A0e.isSampled()) {
            A01(A0e, userSession);
            A0e.AAJ(TraceFieldType.AdhocEventName, "banner_impression");
            DbS.A1F(C69483NmR.IN_THREAD, A0e);
            A0e.A8M(nm3, "user_role");
            C66583MXo.A17(A0e, C66584MXp.A0R(C66583MXo.A0I(A0e, directThreadAnalyticsParams, C66583MXo.A0f(directThreadAnalyticsParams)), A0e, directThreadAnalyticsParams));
        }
    }
}
