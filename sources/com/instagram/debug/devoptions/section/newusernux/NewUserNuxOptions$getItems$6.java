package com.instagram.debug.devoptions.section.newusernux;

import X.1WU;
import X.AnonymousClass0fD;
import X.AnonymousClass35B;
import X.Dba;
import X.EXD;
import X.G6A;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class NewUserNuxOptions$getItems$6 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public NewUserNuxOptions$getItems$6(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1308369281);
        1WU A00 = AnonymousClass35B.A00();
        final FragmentActivity fragmentActivity = this.$activity;
        A00.A04(fragmentActivity, this.$userSession, new G6A() {
            public final void onFinished() {
                Dba.A0r(fragmentActivity, "Nux finished!  Huzzah!");
            }
        }, EXD.A03, true, false);
        AnonymousClass0fD.A0C(-453314054, A05);
    }
}
