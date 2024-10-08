package com.facebook.msys.mcd;

import X.0qQ;
import X.AnonymousClass46Y;
import X.C66595MYh;
import X.C68355NBr;
import X.C70627ODy;
import X.C71775Oqb;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;

public class MqttNetworkSessionPlugin {
    public static MqttNetworkSessionPlugin sInstance;
    public volatile C70627ODy mMqttClientCallbacks;
    public final NativeHolder mNativeHolder = initNativeHolder();

    private native NativeHolder initNativeHolder();

    /* access modifiers changed from: private */
    public native void onMqttConnected();

    private native void onMqttConnectedAggressive();

    /* access modifiers changed from: private */
    public native void onMqttConnecting();

    /* access modifiers changed from: private */
    public native void onMqttDisconnected();

    /* access modifiers changed from: private */
    public native void onMqttPubAck(int i);

    /* access modifiers changed from: private */
    public native void onMqttPubAckTimeout(int i);

    /* access modifiers changed from: private */
    public native void onMqttPubError(int i, String str, int i2);

    /* access modifiers changed from: private */
    public native void onMqttPublishReceived(String str, byte[] bArr);

    private native void registerNative(NetworkSession networkSession, AuthData authData, NotificationCenter notificationCenter, Mailbox mailbox, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    private native void unregisterNative(NetworkSession networkSession, AuthData authData);

    public void register(C70627ODy oDy, NetworkSession networkSession, AuthData authData, NotificationCenter notificationCenter, Mailbox mailbox, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Mailbox mailbox2 = mailbox;
        mailbox2.getClass();
        String str2 = str;
        str2.getClass();
        oDy.getClass();
        this.mMqttClientCallbacks = oDy;
        registerNative(networkSession, authData, notificationCenter, mailbox2, str2, z, z2, false, false, z5);
    }

    public static synchronized MqttNetworkSessionPlugin get() {
        MqttNetworkSessionPlugin mqttNetworkSessionPlugin;
        synchronized (MqttNetworkSessionPlugin.class) {
            mqttNetworkSessionPlugin = sInstance;
            if (mqttNetworkSessionPlugin == null) {
                mqttNetworkSessionPlugin = new MqttNetworkSessionPlugin();
                sInstance = mqttNetworkSessionPlugin;
            }
        }
        return mqttNetworkSessionPlugin;
    }

    public static boolean verifyAuthToken(String str) {
        if (str == null) {
            return false;
        }
        get().mMqttClientCallbacks.getClass();
        return true;
    }

    static {
        C66595MYh.A00();
    }

    public static void onCancelPublish(int i) {
        C70627ODy oDy = get().mMqttClientCallbacks;
        oDy.getClass();
        oDy.A02.maybeCancelPendingPublish(i);
    }

    public static int onGetConnectionState() {
        C70627ODy oDy = get().mMqttClientCallbacks;
        oDy.getClass();
        int mqttTargetState = oDy.A02.getMqttTargetState();
        if (mqttTargetState == 4) {
            return 1;
        }
        if (mqttTargetState != 5) {
            return 0;
        }
        return 2;
    }

    public static int onPublish(String str, int i, byte[] bArr) {
        C70627ODy oDy = get().mMqttClientCallbacks;
        oDy.getClass();
        0qQ.A0B(str, 0);
        0qQ.A0B(bArr, 2);
        int publishWithCallbacks = oDy.A02.publishWithCallbacks(str, bArr, AnonymousClass46Y.ACKNOWLEDGED_DELIVERY, new C71775Oqb(oDy));
        if (publishWithCallbacks != -1) {
            return publishWithCallbacks;
        }
        MqttNetworkSessionPlugin mqttNetworkSessionPlugin = oDy.A01;
        int i2 = oDy.A00 - 1;
        oDy.A00 = i2;
        Execution.executeAsync(new C68355NBr(mqttNetworkSessionPlugin, "EXECUTION_EXCEPTION", i2), (AccountSession) null, 3);
        return oDy.A00;
    }

    public static void subscribeToTopic(String str) {
        get().mMqttClientCallbacks.getClass();
    }

    public static void unsubscribeFromTopic(String str) {
        get().mMqttClientCallbacks.getClass();
    }

    public void unregister(NetworkSession networkSession, AuthData authData) {
        unregisterNative(networkSession, authData);
    }
}
