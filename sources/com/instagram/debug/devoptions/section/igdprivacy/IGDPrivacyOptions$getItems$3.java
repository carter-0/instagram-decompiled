package com.instagram.debug.devoptions.section.igdprivacy;

import X.0xY;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.C273654mx;
import X.C59689JTv;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class IGDPrivacyOptions$getItems$3 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public IGDPrivacyOptions$getItems$3(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1025585828);
        0xY A0N = AnonymousClass7TF.A0N(this.$userSession);
        A0N.E5Z("blend_direct_thread_nux_seen_count", 0);
        A0N.E5c("blend_direct_thread_nux_last_shown_time_ms", 0);
        A0N.apply();
        0xY A0N2 = AnonymousClass7TF.A0N(this.$userSession);
        A0N2.E5Z(C273654mx.A00(578), 0);
        A0N2.E5c(C273654mx.A00(577), 0);
        A0N2.apply();
        C59689JTv.A07(this.$activity, 2131957733);
        AnonymousClass0fD.A0C(-474785734, A05);
    }
}
