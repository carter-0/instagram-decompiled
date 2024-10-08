package com.instagram.debug.devoptions.section.quickpromotion;

import X.AnonymousClass0fD;
import X.AnonymousClass2bO;
import X.C273374mT;
import X.C309516Yo;
import X.DbS;
import X.Dba;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class QuickPromotionOptions$getItems$6 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public QuickPromotionOptions$getItems$6(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(480498225);
        C309516Yo A0M = DbS.A0M(this.$activity, this.$userSession);
        AnonymousClass2bO.A00();
        Dba.A12(new C273374mT(), A0M);
        AnonymousClass0fD.A0C(648106551, A05);
    }
}
