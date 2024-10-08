package com.instagram.realtimeclient;

import X.0xa;
import X.1Al;
import X.1An;
import com.instagram.common.session.UserSession;

public class PresenceSubscriptionIDStore {
    public static final String PRESENCE_SUBSCRIPTION_ID_KEY = "presence_subscription_id_key";
    public final 0xa mPreferences;
    public final UserSession mUserSession;

    public static PresenceSubscriptionIDStore getInstance(UserSession userSession) {
        return (PresenceSubscriptionIDStore) userSession.A01(PresenceSubscriptionIDStore.class, new PresenceSubscriptionIDStore$$ExternalSyntheticLambda0(userSession));
    }

    public PresenceSubscriptionIDStore(0xa r1, UserSession userSession) {
        this.mPreferences = r1;
        this.mUserSession = userSession;
    }

    public static /* synthetic */ PresenceSubscriptionIDStore lambda$getInstance$0(UserSession userSession) {
        return new PresenceSubscriptionIDStore(1Al.A01(userSession).A03(1An.A2U), userSession);
    }
}
