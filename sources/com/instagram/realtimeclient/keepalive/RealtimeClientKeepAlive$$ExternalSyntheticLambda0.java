package com.instagram.realtimeclient.keepalive;

import X.AnonymousClass0eK;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;

public final /* synthetic */ class RealtimeClientKeepAlive$$ExternalSyntheticLambda0 implements AnonymousClass0eK {
    public final /* synthetic */ UserSession f$0;

    public /* synthetic */ RealtimeClientKeepAlive$$ExternalSyntheticLambda0(UserSession userSession) {
        this.f$0 = userSession;
    }

    public final Object get() {
        return RealtimeClientManager.getInstance(this.f$0);
    }
}
