package X;

import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;

public abstract class W3E {
    public static final boolean A00(InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations, PromoteData promoteData) {
        0qQ.A0B(instagramProfileCallToActionDestinations, 1);
        if (promoteData.A2p || instagramProfileCallToActionDestinations.ordinal() != 1) {
            return false;
        }
        return C41845B3m.A14(AnonymousClass7TF.A0R(0Tu.A06, promoteData.A0y, 36315271337610354L));
    }

    public static final boolean A01(XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, boolean z) {
        0Tu r2;
        long j;
        0qQ.A0B(userSession, 0);
        if (!z || xIGIGBoostDestination == null) {
            return false;
        }
        int ordinal = xIGIGBoostDestination.ordinal();
        if (ordinal == 12) {
            r2 = 0Tu.A05;
            j = 36314777416370981L;
        } else if (ordinal == 4 || ordinal != 10) {
            return false;
        } else {
            r2 = 0Tu.A05;
            j = 36315486085975287L;
        }
        return DbY.A1Z(r2, userSession, j);
    }

    public static final boolean A02(XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, boolean z) {
        0Tu r2;
        long j;
        if (!z || xIGIGBoostDestination == null) {
            return false;
        }
        int ordinal = xIGIGBoostDestination.ordinal();
        if (ordinal == 12) {
            r2 = 0Tu.A06;
            j = 36314777416370981L;
        } else if (ordinal == 4 || ordinal != 10) {
            return false;
        } else {
            r2 = 0Tu.A06;
            j = 36315486085975287L;
        }
        return DbY.A1Z(r2, userSession, j);
    }

    public static final boolean A04(PromoteData promoteData) {
        if (C51967G9n.A0t(new BoostFlowType[]{BoostFlowType.DRAFT, BoostFlowType.BOOST_AGAIN}, 0).contains(promoteData.A0l) || promoteData.A0D()) {
            return false;
        }
        return DbY.A1Y(0Tu.A05, promoteData.A0y, 36327009483241594L);
    }

    public static final boolean A08(PromoteData promoteData, boolean z) {
        0Tu r2;
        if (promoteData.A2p || !promoteData.A1p.contains(XIGIGBoostDestination.WHATSAPP_MESSAGE) || !AnonymousClass9F0.A04(promoteData)) {
            return false;
        }
        UserSession userSession = promoteData.A0y;
        if (!z) {
            r2 = 0Tu.A06;
        } else {
            r2 = 0Tu.A05;
        }
        return DbY.A1Y(r2, userSession, 36326043115599329L);
    }

    public static final boolean A03(PromoteData promoteData) {
        int ordinal;
        XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus;
        BoostFlowType boostFlowType = promoteData.A0l;
        if (boostFlowType == null) {
            ordinal = -1;
        } else {
            ordinal = boostFlowType.ordinal();
        }
        if (ordinal == 0) {
            UserSession userSession = promoteData.A0y;
            0qQ.A06(userSession);
            return DbY.A1Z(0Tu.A05, userSession, 36320743125951277L);
        } else if ((ordinal != 2 && ordinal != 1) || (xFBCTXWelcomeMessageStatus = promoteData.A0a) == null || xFBCTXWelcomeMessageStatus == XFBCTXWelcomeMessageStatus.WELCOME_MESSAGE_INELIGIBLE) {
            return false;
        } else {
            return true;
        }
    }

    public static final boolean A05(PromoteData promoteData) {
        if (PromoteState.A02(promoteData) || promoteData.A0v == PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE) {
            return false;
        }
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination != XIGIGBoostDestination.DIRECT_MESSAGE && xIGIGBoostDestination != XIGIGBoostDestination.WHATSAPP_MESSAGE && xIGIGBoostDestination != XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE) {
            return false;
        }
        if (DbY.A1Y(0Tu.A05, promoteData.A0y, 36320073111052232L)) {
            return true;
        }
        return false;
    }

    public static final boolean A06(PromoteData promoteData) {
        if (PromoteState.A02(promoteData) || promoteData.A0v == PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE || promoteData.A0i != XIGIGBoostDestination.PROFILE_VISITS) {
            return false;
        }
        if (DbY.A1Y(0Tu.A05, promoteData.A0y, 36321572054640148L)) {
            return true;
        }
        return false;
    }

    public static final boolean A07(PromoteData promoteData) {
        if (PromoteState.A02(promoteData) || promoteData.A0v == PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE || promoteData.A0i != XIGIGBoostDestination.WEBSITE_CLICK) {
            return false;
        }
        if (DbY.A1Y(0Tu.A05, promoteData.A0y, 36321567759672851L)) {
            return true;
        }
        return false;
    }
}
