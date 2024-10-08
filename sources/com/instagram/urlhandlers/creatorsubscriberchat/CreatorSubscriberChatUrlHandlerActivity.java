package com.instagram.urlhandlers.creatorsubscriberchat;

import X.08y;
import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C375479Ds;
import X.DbS;
import X.DbX;
import X.EV0;
import X.FC2;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

public final class CreatorSubscriberChatUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.creatorsubscriberchat.CreatorSubscriberChatUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.urlhandlers.creatorsubscriberchat.CreatorSubscriberChatUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        int A00 = AnonymousClass0fD.A00(-467947809);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (A0m = DbS.A0m(A0A)) == null || A0m.length() == 0) {
            finish();
            i = 1323313503;
        } else {
            UserSession session = getSession();
            if (!(session instanceof UserSession)) {
                FFQ.A01(this, A0A, session);
            } else {
                UserSession userSession = session;
                if (C375479Ds.A01(userSession)) {
                    FC2.A02(userSession, ChannelCreationSource.QUICK_PROMOTION, EV0.Social).CfS(this);
                }
            }
            i = -190932296;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
