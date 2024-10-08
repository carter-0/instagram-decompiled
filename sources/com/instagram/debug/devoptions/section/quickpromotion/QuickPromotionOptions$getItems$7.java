package com.instagram.debug.devoptions.section.quickpromotion;

import X.AnonymousClass0fD;
import X.AnonymousClass2bO;
import X.C309516Yo;
import X.C47536E6z;
import X.DbS;
import X.Dba;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class QuickPromotionOptions$getItems$7 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public QuickPromotionOptions$getItems$7(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-814179123);
        C309516Yo A0M = DbS.A0M(this.$activity, this.$userSession);
        AnonymousClass2bO.A00();
        Dba.A12(new C47536E6z(), A0M);
        AnonymousClass0fD.A0C(-1084648161, A05);
    }
}
