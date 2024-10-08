package com.instagram.urlhandlers.broadcastchannel;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbT;
import X.EV0;
import X.FC2;
import X.FFQ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.CategorySelectionScreenArgs;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

public final class BroadcastChannelCreationUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.broadcastchannel.BroadcastChannelCreationUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        Bundle A0A;
        08y r1 = 09i.A0A;
        Intent intent = getIntent();
        if (intent != null && (A0A = DbT.A0A(intent)) != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.broadcastchannel.BroadcastChannelCreationUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0A;
        ChannelCreationSource channelCreationSource;
        int A00 = AnonymousClass0fD.A00(1604506397);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0A = DbT.A0A(intent)) == null) {
            finish();
            i = -1654190606;
        } else {
            String A0m = DbS.A0m(A0A);
            if (!(A0m == null || A0m.length() == 0)) {
                if (!DbT.A1Z(this)) {
                    FFQ.A03(A0A, this);
                } else {
                    String queryParameter = DbT.A09(A0m).getQueryParameter("source");
                    if (queryParameter == null || queryParameter.hashCode() != 2591 || !queryParameter.equals("QP")) {
                        channelCreationSource = ChannelCreationSource.PROFESSIONAL_DASHBOARD_NEXT_STEP;
                    } else {
                        channelCreationSource = ChannelCreationSource.QUICK_PROMOTION;
                    }
                    UserSession session = getSession();
                    DbS.A1Z(session);
                    UserSession userSession = session;
                    EV0 ev0 = EV0.Broadcast;
                    ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs = new ChannelCreationFlowExtraArgs((CategorySelectionScreenArgs) null, (String) null, (String) null);
                    0qQ.A0B(userSession, 0);
                    FC2.A01(userSession, channelCreationFlowExtraArgs, channelCreationSource, ev0, false).CfS(this);
                }
            }
            finish();
            i = -211929985;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
