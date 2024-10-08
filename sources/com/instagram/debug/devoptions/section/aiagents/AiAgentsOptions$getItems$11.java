package com.instagram.debug.devoptions.section.aiagents;

import X.0qQ;
import X.AnonymousClass0fD;
import X.C54639HLw;
import X.C56316HwT;
import X.C59689JTv;
import android.app.Application;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.metaai.shared.nux.service.MetaAINuxNetworkService;

public final class AiAgentsOptions$getItems$11 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public AiAgentsOptions$getItems$11(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1407746152);
        Application application = this.$activity.getApplication();
        0qQ.A07(application);
        IgMetaSessionImpl A01 = C56316HwT.A01(this.$userSession);
        for (Object next : C54639HLw.A00) {
            new MetaAINuxNetworkService(application, A01);
            String obj = next.toString();
            0qQ.A0B(obj, 0);
            application.getSharedPreferences("MetaAINuxImpressionCache", 0).edit().putBoolean(obj, false).commit();
        }
        C59689JTv.A07(this.$activity, 2131957692);
        AnonymousClass0fD.A0C(671107718, A05);
    }
}
