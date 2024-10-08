package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.DestinationRecommendationReason;
import com.instagram.api.schemas.LinkStickerType;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

public final class W3T {
    public static final W3T A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.api.schemas.XIGIGBoostDestination A00(com.instagram.business.promote.model.PromoteData r3) {
        /*
            java.util.List r0 = r3.A20
            r2 = 1
            if (r0 == 0) goto L_0x000c
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x001b
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r3.A0j
            if (r0 != 0) goto L_0x0034
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x001b:
            java.util.List r0 = r3.A20
            if (r0 == 0) goto L_0x0028
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x0028
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE
            return r0
        L_0x0028:
            java.util.List r0 = r3.A20
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = (com.instagram.api.schemas.XIGIGBoostDestination) r0
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            return r0
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3T.A00(com.instagram.business.promote.model.PromoteData):com.instagram.api.schemas.XIGIGBoostDestination");
    }

    public static final void A01(FragmentActivity fragmentActivity, PromoteData promoteData, U5O u5o) {
        UserSession userSession = promoteData.A0y;
        0qQ.A06(userSession);
        1Av A002 = 1Au.A00(userSession);
        if (!AnonymousClass7TG.A1a(A002, A002.A40, 1Av.A8a, 113) && W3E.A04(promoteData)) {
            u5o.post(new C20292Woh(fragmentActivity, u5o, A002));
        }
    }

    public static final void A03(PromoteData promoteData) {
        XIGIGBoostCallToAction xIGIGBoostCallToAction;
        XIGIGBoostCallToAction xIGIGBoostCallToAction2;
        XIGIGBoostCallToAction xIGIGBoostCallToAction3;
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0j;
        XIGIGBoostDestination xIGIGBoostDestination2 = XIGIGBoostDestination.DIRECT_MESSAGE;
        if (xIGIGBoostDestination == xIGIGBoostDestination2 && promoteData.A0e == null && promoteData.A2C) {
            xIGIGBoostCallToAction = XIGIGBoostCallToAction.VIEW_PRODUCT;
        } else {
            if (!promoteData.A2p && promoteData.A0e == null) {
                if (xIGIGBoostDestination == XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE || xIGIGBoostDestination == XIGIGBoostDestination.WHATSAPP_MESSAGE) {
                    xIGIGBoostCallToAction3 = XIGIGBoostCallToAction.WHATSAPP_MESSAGE;
                } else {
                    xIGIGBoostCallToAction3 = XIGIGBoostCallToAction.INSTAGRAM_MESSAGE;
                }
                promoteData.A0e = xIGIGBoostCallToAction3;
            }
            if ((xIGIGBoostDestination == XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE || xIGIGBoostDestination == XIGIGBoostDestination.WHATSAPP_MESSAGE) && ((xIGIGBoostCallToAction2 = promoteData.A0e) == XIGIGBoostCallToAction.INSTAGRAM_MESSAGE || xIGIGBoostCallToAction2 == XIGIGBoostCallToAction.VIEW_PRODUCT)) {
                xIGIGBoostCallToAction = XIGIGBoostCallToAction.WHATSAPP_MESSAGE;
            } else if (xIGIGBoostDestination == xIGIGBoostDestination2) {
                XIGIGBoostCallToAction xIGIGBoostCallToAction4 = promoteData.A0e;
                if (xIGIGBoostCallToAction4 == XIGIGBoostCallToAction.WHATSAPP_MESSAGE || xIGIGBoostCallToAction4 == XIGIGBoostCallToAction.CHAT_ON_WHATSAPP) {
                    xIGIGBoostCallToAction = XIGIGBoostCallToAction.INSTAGRAM_MESSAGE;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        promoteData.A0e = xIGIGBoostCallToAction;
    }

    public static final boolean A04(PromoteData promoteData) {
        String str = promoteData.A1K;
        if (str.equals("messaging_hub") || str.equals("ad_tools_ctd_aymt") || str.equals("direct_ctd_aymt") || str.equals("feed_ctd_ad4ad") || str.equals("ctd_top_post_upsell_notification") || JTQ.A1Y(C16678UzE.CTD_BOOST_UPSELL_POST_BANNER, str) || promoteData.A2h) {
            return true;
        }
        String str2 = promoteData.A1Y;
        if (str2 == null || !promoteData.A1K.equals("aymt_dropoff") || !str2.equals("aymt_ctd_dropoff")) {
            return false;
        }
        WGU.A00(promoteData.A0y).A0K(C16678UzE.OBJECTIVE, "messaging_recommendation_subtitle", XIGIGBoostDestination.DIRECT_MESSAGE.toString(), "aymt_ctd_dropoff");
        return true;
    }

    public static final boolean A05(PromoteData promoteData) {
        LinkStickerType linkStickerType;
        if (promoteData.A2g || promoteData.A1K.equals("messaging_hub_ctwa")) {
            return true;
        }
        X9w x9w = promoteData.A0V;
        if (x9w != null) {
            linkStickerType = ((UNC) x9w).A00;
        } else {
            linkStickerType = null;
        }
        if (linkStickerType == LinkStickerType.WHATSAPP && AnonymousClass9F0.A04(promoteData)) {
            return true;
        }
        if (promoteData.A1Y == null || !AnonymousClass9F0.A04(promoteData) || !0qQ.A0K(promoteData.A1K, "aymt_dropoff") || !0qQ.A0K(promoteData.A1Y, "aymt_ctwa_dropoff")) {
            return false;
        }
        WGU.A00(promoteData.A0y).A0K(C16678UzE.OBJECTIVE, "messaging_recommendation_subtitle", XIGIGBoostDestination.WHATSAPP_MESSAGE.toString(), "aymt_ctwa_dropoff");
        return true;
    }

    public static final boolean A06(PromoteData promoteData) {
        return 00k.A0u(0sr.A1P(new DestinationRecommendationReason[]{DestinationRecommendationReason.INTENT_IN_MEDIA_CAPTION, DestinationRecommendationReason.INTENT_IN_BIOGRAPHY, DestinationRecommendationReason.DIRECT_INTENT_IN_PHOTO_OCR, DestinationRecommendationReason.EXISTING_CTX_MAA, DestinationRecommendationReason.HIGH_VBTS, DestinationRecommendationReason.MESSGAING_TOOLS_USER, DestinationRecommendationReason.MESSAGING_INTENT_BY_MTML}), promoteData.A0S);
    }

    public static final boolean A07(PromoteData promoteData) {
        return 00k.A0u(0sr.A1P(new DestinationRecommendationReason[]{DestinationRecommendationReason.CTWA_INTENT_IN_MEDIA_CAPTION, DestinationRecommendationReason.CTWA_INTENT_IN_BIOGRAPHY_CAPTION, DestinationRecommendationReason.CTWA_INTENT_IN_PHOTO_OCR, DestinationRecommendationReason.WHATSAPP_LOGO_INTENT_IN_PHOTO_OCR, DestinationRecommendationReason.EXISTING_CTX_MAA, DestinationRecommendationReason.HIGH_VBTS, DestinationRecommendationReason.MESSAGING_INTENT_BY_MTML}), promoteData.A0S);
    }

    public static final void A02(FragmentActivity fragmentActivity, PromoteData promoteData, U5O u5o, UserSession userSession) {
        if (A06(promoteData) || A07(promoteData) || promoteData.A2h) {
            UserSession userSession2 = userSession;
            0qQ.A0B(userSession, 0);
            U5O u5o2 = u5o;
            if (182.A06(0Tu.A05, userSession, 36323251386854431L)) {
                u5o2.setRecommendedTextV2(fragmentActivity, userSession2, true, false, (View.OnClickListener) null);
            } else {
                u5o.setRecommendedText(2131970355);
            }
            if (A06(promoteData) || A07(promoteData)) {
                WGU.A00(userSession).A0K(C16678UzE.OBJECTIVE, "messaging_recommendation_subtitle", String.valueOf(promoteData.A0h), String.valueOf(promoteData.A0S));
            }
        }
    }
}
