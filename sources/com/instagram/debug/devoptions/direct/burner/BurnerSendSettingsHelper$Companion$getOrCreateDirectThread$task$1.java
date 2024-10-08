package com.instagram.debug.devoptions.direct.burner;

import X.0sP;
import X.1P0;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C268654dm;
import X.C71129OdS;
import X.NHZ;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.realtimeclient.DirectRealtimePayload;

public final class BurnerSendSettingsHelper$Companion$getOrCreateDirectThread$task$1 extends 1P0 {
    public final /* synthetic */ 0sP $callback;
    public final /* synthetic */ UserSession $userSession;

    public BurnerSendSettingsHelper$Companion$getOrCreateDirectThread$task$1(0sP r1, UserSession userSession) {
        this.$callback = r1;
        this.$userSession = userSession;
    }

    public void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-1549410584);
        this.$callback.invoke((Object) null);
        AnonymousClass0fD.A0A(-757347741, A03);
    }

    public void onSuccess(NHZ nhz) {
        String str;
        int A0D = AnonymousClass7TG.A0D(nhz, 349323193);
        DirectRealtimePayload directRealtimePayload = nhz.A00;
        if (directRealtimePayload == null || (str = directRealtimePayload.threadId) == null) {
            this.$callback.invoke((Object) null);
        } else {
            C71129OdS.A04(this.$userSession, ThreadFetchReason.BURNER, new BurnerSendSettingsHelper$Companion$getOrCreateDirectThread$task$1$onSuccess$1$1(this.$callback), str, true);
        }
        AnonymousClass0fD.A0A(1573124822, A0D);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-32031749);
        onSuccess((NHZ) obj);
        AnonymousClass0fD.A0A(2081912155, A03);
    }
}
