package com.instagram.realtimeclient;

import X.1zO;
import X.1zY;
import X.1za;
import X.1zc;
import X.1ze;
import X.AnonymousClass7TE;
import X.C68081zP;
import android.content.Context;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;

public class ClientManagerProviderSupplierStatic {
    public static List getRealtimeDelegateProviders(Context context) {
        return AnonymousClass7TE.A1I(new 1zO());
    }

    public static RealtimeClientManager.PresenceMsysAppStateChangeObserverProvider getAppStateChangeObserverProvider() {
        return 1ze.A00;
    }

    public static RealtimeClientManager.GraphQLSubscriptionsProvider getGraphQLSubscriptionsProvider() {
        return 1za.A00;
    }

    public static RealtimeClientManager.ObserversProvider getObserversProvider() {
        return 1zc.A00;
    }

    public static List getOtherRealtimeEventHandlerProviders(Context context) {
        return C68081zP.A00(context);
    }

    public static RealtimeClientManager.RawSkywalkerSubscriptionsProvider getRawSkywalkerSubscriptionsProvider() {
        return 1zY.A00;
    }
}
