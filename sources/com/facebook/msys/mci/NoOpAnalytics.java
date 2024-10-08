package com.facebook.msys.mci;

import X.AnonymousClass000;
import X.C21192XMb;
import java.util.List;
import java.util.Map;

public class NoOpAnalytics implements Analytics {
    public void log(int i, int i2, boolean z, String str, String str2, long j, Map map, Map map2, List list) {
    }

    public EventLogSubscriber getTalEventSubscriber() {
        return new C21192XMb(this, new String[]{AnonymousClass000.A00(867), "CarrierMessaging", "FBBroker", "TAM", AnonymousClass000.A00(2265), "Interop"});
    }
}
