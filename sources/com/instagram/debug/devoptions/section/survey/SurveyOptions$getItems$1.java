package com.instagram.debug.devoptions.section.survey;

import X.AnonymousClass0Dg;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.DbS;
import X.Dba;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class SurveyOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public SurveyOptions$getItems$1(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1240259112);
        Bundle A0a = AnonymousClass7TE.A0a();
        AnonymousClass0Dg.A00(A0a, this.$userSession);
        Dba.A0w(A0a, new SessionSurveyInternalSettingsFragment(), DbS.A0M(this.$activity, this.$userSession));
        AnonymousClass0fD.A0C(-146398089, A05);
    }
}
