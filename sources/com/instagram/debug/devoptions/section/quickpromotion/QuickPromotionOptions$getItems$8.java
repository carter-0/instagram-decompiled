package com.instagram.debug.devoptions.section.quickpromotion;

import X.0qQ;
import X.0xY;
import X.AnonymousClass0fD;
import X.C20695WxR;
import X.C298955uJ;
import X.C59689JTv;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class QuickPromotionOptions$getItems$8 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public QuickPromotionOptions$getItems$8(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(115759822);
        UserSession userSession = this.$userSession;
        0qQ.A0B(userSession, 0);
        0xY AR4 = ((C298955uJ) userSession.A01(C298955uJ.class, new C20695WxR(userSession, 38))).A00.AR4();
        AR4.AHM();
        AR4.apply();
        C59689JTv.A06(this.$activity, 2131958184);
        AnonymousClass0fD.A0C(1027990282, A05);
    }
}
