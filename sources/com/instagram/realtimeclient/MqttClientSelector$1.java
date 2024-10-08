package com.instagram.realtimeclient;

import X.C249543jx;
import android.content.Context;
import android.util.Pair;
import com.facebook.msys.mci.ProxyProvider;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.L;
import java.util.concurrent.Executor;

public class MqttClientSelector$1 {
    public final /* synthetic */ MqttClientSelector this$0;
    public final /* synthetic */ UserSession val$userSession;

    public Executor getUiExecutor(Context context) {
        return null;
    }

    public MqttClientSelector$1(MqttClientSelector mqttClientSelector, UserSession userSession) {
        this.this$0 = mqttClientSelector;
        this.val$userSession = userSession;
    }

    public Integer getMsysThreadPriority(Context context) {
        if (L.android_igd_preq.enable_msys_priority_in_mqtt.getAndExpose(this.val$userSession).booleanValue()) {
            return Integer.valueOf(L.ig_android_realtime_xplat_mqtt.connect_timeout_seconds.getAndExpose(this.val$userSession).intValue());
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.3xV, java.lang.Object] */
    public ProxyProvider getProxyProvider(Context context) {
        Pair pair = new Pair(1920, 4800000);
        Pair pair2 = new Pair(1280, 2400000);
        Pair pair3 = new Pair(1280, 1200000);
        ? obj = new Object();
        obj.A02 = pair;
        obj.A00 = pair2;
        obj.A01 = pair3;
        return C249543jx.A00(context, obj);
    }
}
