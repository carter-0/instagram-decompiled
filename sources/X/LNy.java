package X;

import com.instagram.android.R;
import com.instagram.api.schemas.FanClubNextStepsCompletionState;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;
import com.instagram.common.session.UserSession;

public final class LNy {
    public final UserSession A00;
    public final C273004lm A01;
    public final String A02;

    public final C65486LuA A01(YBG ybg, Integer num, 0sP r15) {
        int i;
        0qQ.A0B(ybg, 0);
        C61104JxF jxF = (C61104JxF) ybg;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType = jxF.A01;
        if (fanClubNextStepsRecommendationsType != FanClubNextStepsRecommendationsType.UNRECOGNIZED) {
            A00(this, num, fanClubNextStepsRecommendationsType.toString());
            C52255GKw A002 = JUH.A00(jxF.A0B);
            C52255GKw A003 = JUH.A00(jxF.A09);
            C61917KRm kRm = new C61917KRm(jxF.A0A);
            FanClubNextStepsCompletionState fanClubNextStepsCompletionState = jxF.A00;
            int ordinal = fanClubNextStepsCompletionState.ordinal();
            if (ordinal == 1) {
                i = R.attr.igds_color_success;
            } else if (ordinal == 3 || ordinal == 0) {
                i = R.attr.igds_color_primary_icon;
            } else if (ordinal != 2) {
                throw AnonymousClass7TE.A1K();
            }
            return new C65486LuA(new LY7(7, (Object) r15, (Object) ybg), A002, A003, kRm, i, AnonymousClass7TF.A1W(fanClubNextStepsCompletionState, FanClubNextStepsCompletionState.COMPLETED));
        }
        return null;
    }

    public static final void A00(LNy lNy, Integer num, String str) {
        C273004lm r3 = lNy.A01;
        String str2 = lNy.A02;
        0qQ.A0B(str, 2);
        0Aj A0e = AnonymousClass7TE.A0e(r3.A00, "ig_fan_club_settings_recommendations_recommendation_impression");
        DbS.A1O(A0e, C63261Ku6.A00(num));
        DbY.A1G(A0e, r3.A01.A06);
        A0e.AAJ("origin", str2);
        A0e.AAJ(AnonymousClass000.A00(1803), str);
        A0e.Cgf();
    }

    public /* synthetic */ LNy(UserSession userSession, String str) {
        C273004lm A002 = C272994ll.A00(userSession);
        AnonymousClass7TG.A1U(userSession, str, A002);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = A002;
    }
}
