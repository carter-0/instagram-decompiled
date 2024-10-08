package com.instagram.debug.devoptions.section.reactnative;

import X.1WM;
import X.AnonymousClass0fD;
import X.T8B;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class ReactNativeOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public ReactNativeOptions$getItems$1(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1352026755);
        1WM.getInstance();
        T8B A01 = new T8B(this.$userSession).A01("RNRouteExplorerRoute");
        A01.A07 = this.$activity.getResources().getString(2131971319);
        A01.A02(this.$activity);
        AnonymousClass0fD.A0C(-100400740, A05);
    }
}
