package com.instagram.debug.devoptions.section.quickpromotion;

import X.AnonymousClass0fD;
import X.AnonymousClass2bO;
import X.C309516Yo;
import X.DbS;
import X.Dba;
import X.E6N;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class QuickPromotionOptions$getItems$4 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public QuickPromotionOptions$getItems$4(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1362060387);
        C309516Yo A0M = DbS.A0M(this.$activity, this.$userSession);
        AnonymousClass2bO.A00();
        Dba.A12(new E6N(), A0M);
        AnonymousClass0fD.A0C(1963800595, A05);
    }
}
