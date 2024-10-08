package com.instagram.debug.devoptions.section.zerorating;

import X.AnonymousClass0fD;
import X.C309516Yo;
import X.Dba;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment;

public final class ZeroRatingOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public ZeroRatingOptions$getItems$1(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1762638970);
        Dba.A12(new ZeroDevOptionsFragment(), new C309516Yo(this.$activity, this.$userSession));
        AnonymousClass0fD.A0C(133582192, A05);
    }
}
