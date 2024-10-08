package com.instagram.debug.devoptions.direct.burner;

import X.0qQ;
import X.0sP;
import X.C268654dm;
import X.C330317Mh;
import com.instagram.user.model.User;

public final class BurnerSendSettingsHelper$Companion$fetchUser$2$1 implements C330317Mh {
    public final /* synthetic */ 0sP $callback;

    public void onSuccess(User user) {
        0qQ.A0B(user, 0);
        this.$callback.invoke(user);
    }

    public BurnerSendSettingsHelper$Companion$fetchUser$2$1(0sP r1) {
        this.$callback = r1;
    }

    public void onFail(C268654dm r3) {
        this.$callback.invoke((Object) null);
    }
}
