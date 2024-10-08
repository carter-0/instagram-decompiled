package com.instagram.debug.devoptions.section.newusernux;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C47447E2t;
import X.DbT;
import X.DbY;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class NewUserNuxOptions$getItems$9 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public NewUserNuxOptions$getItems$9(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-487424476);
        Bundle A0a = AnonymousClass7TE.A0a();
        DbT.A15();
        C47447E2t e2t = new C47447E2t();
        e2t.setArguments(A0a);
        DbY.A14(e2t, this.$activity, this.$userSession);
        AnonymousClass0fD.A0C(-575428042, A05);
    }
}
