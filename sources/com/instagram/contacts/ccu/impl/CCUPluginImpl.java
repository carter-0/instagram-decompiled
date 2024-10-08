package com.instagram.contacts.ccu.impl;

import X.0qQ;
import X.14i;
import X.15Y;
import X.AnonymousClass94K;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class CCUPluginImpl {
    public void initScheduler(Context context, UserSession userSession) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        Class<AnonymousClass94K> cls = AnonymousClass94K.class;
        if (userSession.A00(cls) == null) {
            AnonymousClass94K r1 = new AnonymousClass94K(context, userSession);
            14i.A03(15Y.A03, r1);
            userSession.A04(cls, r1);
        }
    }

    public CCUPluginImpl(int i) {
    }

    public CCUPluginImpl() {
    }
}
