package com.facebook.papaya.fb.instagram.transport;

import X.0dV;
import X.0qQ;
import X.C51974G9v;
import X.RF8;
import android.content.Context;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGAuthedTigonService;
import java.util.concurrent.ScheduledExecutorService;

public final class IgPapayaTransport extends ITransport {
    public IgPapayaTransport(Context context, UserSession userSession, ScheduledExecutorService scheduledExecutorService, String str, RF8 rf8) {
        C51974G9v.A1P(context, userSession, scheduledExecutorService, str);
        0qQ.A0B(rf8, 5);
        0dV.A0C("papaya-ig4a-jni-transport");
        IGAuthedTigonService instance = IGAuthedTigonService.getInstance(userSession);
        0qQ.A07(instance);
        initHybridTransport(instance, new AndroidAsyncExecutorFactory(scheduledExecutorService), "https://i.instagram.com/api/v1/papaya/", "PROD", str, rf8.A00);
    }

    private final native void initHybridTransport(TigonServiceHolder tigonServiceHolder, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str, String str2, String str3, int i);
}
