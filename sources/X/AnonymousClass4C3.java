package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.concurrent.Executor;

/* renamed from: X.4C3  reason: invalid class name */
public final class AnonymousClass4C3 implements MqttSubscribeListener {
    public final /* synthetic */ MqttSubscribeListener A00;
    public final /* synthetic */ XplatNativeClientWrapper A01;

    public final void onData(String str, byte[] bArr, long j) {
        String str2 = str;
        0qQ.A0B(str, 0);
        byte[] bArr2 = bArr;
        0qQ.A0B(bArr, 1);
        MqttSubscribeListener mqttSubscribeListener = this.A00;
        if (mqttSubscribeListener != null) {
            XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
            AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
            Executor executor = xplatNativeClientWrapper.callbackExecutor;
            if (executor == null) {
                0qQ.A0F("callbackExecutor");
                throw AnonymousClass00P.createAndThrow();
            } else {
                executor.execute(new C291055gR(mqttSubscribeListener, xplatNativeClientWrapper, str2, bArr2, j));
            }
        }
    }

    public final void onSubscriptionResponse(String str, boolean z, int i) {
        String str2 = str;
        0qQ.A0B(str, 0);
        MqttSubscribeListener mqttSubscribeListener = this.A00;
        if (mqttSubscribeListener != null) {
            XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
            AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
            Executor executor = xplatNativeClientWrapper.callbackExecutor;
            if (executor == null) {
                0qQ.A0F("callbackExecutor");
                throw AnonymousClass00P.createAndThrow();
            }
            executor.execute(new C271334ig(mqttSubscribeListener, xplatNativeClientWrapper, str2, i, z));
        }
    }

    public AnonymousClass4C3(MqttSubscribeListener mqttSubscribeListener, XplatNativeClientWrapper xplatNativeClientWrapper) {
        this.A00 = mqttSubscribeListener;
        this.A01 = xplatNativeClientWrapper;
    }
}
