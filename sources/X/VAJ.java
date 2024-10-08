package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class VAJ {
    public static final void A00(View view, FragmentActivity fragmentActivity, PromoteData promoteData, PromoteState promoteState, UserSession userSession, List list) {
        boolean z;
        View findViewById;
        C226262fy r1;
        int i;
        0qQ.A0B(userSession, 1);
        View A0G = AnonymousClass7TF.A0G(view, R.id.destination_option_group);
        UserSession userSession2 = promoteData.A0y;
        0qQ.A06(userSession2);
        1Av A00 = 1Au.A00(userSession2);
        PromoteState promoteState2 = promoteState;
        if (promoteState2.A05 || AnonymousClass9F0.A04(promoteData)) {
            if (promoteState2.A05) {
                if (list.contains(AdsAPIInstagramPosition.STREAM)) {
                    0xa r11 = A00.A01;
                    z = false;
                    if (r11.getInt("promote_destination_ads_preview_thumbnail_tooltip_impression_count", 0) < 2) {
                        if (System.currentTimeMillis() - r11.getLong("promote_destination_ads_preview_thumbnail_tooltip_impression_time", -1) > 600000) {
                            JTS.A1S(r11, "promote_destination_ads_preview_thumbnail_tooltip_impression_count", 0);
                            0xY AR4 = r11.AR4();
                            AR4.E5c("promote_destination_ads_preview_thumbnail_tooltip_impression_time", System.currentTimeMillis());
                            AR4.apply();
                            findViewById = AnonymousClass7TF.A0F(view, R.id.promotion_preview_thumbnail);
                            r1 = C226262fy.ABOVE_ANCHOR;
                            i = 2131970360;
                        }
                    }
                }
            }
            z = false;
            if (promoteData.A2h) {
                UserSession userSession3 = promoteData.A0y;
                0Tu r7 = 0Tu.A05;
                if (DbY.A1Y(r7, userSession3, 36316585597604358L)) {
                    0xa r5 = A00.A01;
                    if (((long) r5.getInt("promote_direct_inbox_entered_more_message_goal_tooltip_impression_count", 0)) <= 182.A01(r7, userSession3, 36598060574575699L)) {
                        if (System.currentTimeMillis() - r5.getLong("promote_direct_inbox_entered_more_message_goal_tooltip_last_seen_timestamp", -1) >= TimeUnit.SECONDS.toMillis(182.A01(r7, userSession3, 36598060574510162L))) {
                            AnonymousClass7TG.A1L(r5.AR4(), r5, "promote_direct_inbox_entered_more_message_goal_tooltip_impression_count", 0);
                            long currentTimeMillis = System.currentTimeMillis();
                            0xY AR42 = r5.AR4();
                            AR42.E5c("promote_direct_inbox_entered_more_message_goal_tooltip_last_seen_timestamp", currentTimeMillis);
                            AR42.apply();
                            findViewById = A0G.findViewWithTag(XIGIGBoostDestination.DIRECT_MESSAGE).findViewById(R.id.secondary_text);
                            0qQ.A0A(findViewById);
                            r1 = C226262fy.BELOW_ANCHOR;
                            i = 2131970581;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            View findViewWithTag = A0G.findViewWithTag(XIGIGBoostDestination.DIRECT_MESSAGE);
            if (findViewWithTag != null && (findViewById = findViewWithTag.findViewById(R.id.primary_text)) != null) {
                i = 2131970455;
                if (promoteData.A1p.contains(XIGIGBoostDestination.WHATSAPP_MESSAGE) && !AnonymousClass9F0.A04(promoteData)) {
                    0xa r52 = A00.A01;
                    z = false;
                    if (r52.getInt("whatsapp_linking_in_promote_flow_tooltip_impression_count", 0) < 2) {
                        WGU.A00(userSession2).A0H(C16678UzE.OBJECTIVE, "whatsapp_linking_tooltip");
                        JTS.A1S(r52, "whatsapp_linking_in_promote_flow_tooltip_impression_count", 0);
                        r1 = C226262fy.BELOW_ANCHOR;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        AnonymousClass5Gt A0V = DbZ.A0V(fragmentActivity, i);
        A0V.A03(findViewById);
        A0V.A0B = z;
        A0V.A05 = r1;
        findViewById.post(new Wj0(A0V));
    }
}
