package com.facebook.mqtt.service;

import X.002;
import X.0KC;
import X.0dV;
import X.0fh;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass28I;
import X.AnonymousClass4C3;
import X.C12140Snl;
import X.C12145Snq;
import X.C12873TBn;
import X.C12874TBo;
import X.C250773m2;
import X.C2602244t;
import X.C2603445g;
import X.C2603845k;
import X.C2603945l;
import X.C2604045m;
import X.C2605346a;
import X.C2605446b;
import android.content.Context;
import com.facebook.jni.CppException;
import com.facebook.jni.HybridData;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class XplatNativeClientWrapper implements C250773m2 {
    public static final AnonymousClass28I Companion = new Object();
    public static final String TAG = "MqttXplatNativeClientWrapper";
    public static final String UPDATE_FOREGROUND_TOPIC = "/t_fs";
    public Executor callbackExecutor;
    public C2603845k connectionState = C2603845k.DISCONNECTED;
    public boolean isForeground;
    public HybridData mHybridData;
    public final HashSet observers = new HashSet();
    public final AtomicBoolean started = new AtomicBoolean(false);
    public C2603445g stateCallback;

    private final native synchronized void cancelPublishNative(int i);

    public static final native HybridData initHybrid(ConnectionConfig connectionConfig, ConnectionCallback connectionCallback);

    private final native synchronized int publishExtNative(String str, int i, byte[] bArr, MqttPublishExtListener mqttPublishExtListener);

    private final native synchronized int publishNative(String str, int i, byte[] bArr, MqttPublishListener mqttPublishListener);

    private final native synchronized void setForegroundNative(boolean z);

    private final native synchronized void startNative(Set set, int i, MqttSubscribeListener mqttSubscribeListener);

    private final native synchronized void stopNative();

    private final native synchronized void subscribeNative(String str, int i, MqttSubscribeListener mqttSubscribeListener);

    private final native synchronized void unsubscribeNative(String str);

    private final native synchronized void updateNetworkInterfaceNative(int i);

    private final native synchronized void updateNetworkStateNative(int i);

    private final native synchronized void updateRegionPreferenceNative(String str);

    private final native synchronized boolean verifyAuthTokenNative(String str);

    public void addObservers(List list) {
        0qQ.A0B(list, 0);
        this.observers.addAll(list);
    }

    public String getMqttHealthStats() {
        return null;
    }

    public void kickOffConnection() {
    }

    public boolean start(Context context, ConnectionConfig connectionConfig, C2603445g r10, MqttSubscribeListener mqttSubscribeListener) {
        0qQ.A0B(connectionConfig, 1);
        0qQ.A0B(r10, 2);
        if (!this.started.get()) {
            Executor executor = connectionConfig.callbackExecutor;
            this.callbackExecutor = executor;
            this.connectionState = C2603845k.CONNECTING;
            this.stateCallback = r10;
            this.isForeground = !connectionConfig.isAppInBackground;
            if (executor != null) {
                executor.execute(new C2603945l(r10, this));
                try {
                    this.mHybridData = initHybrid(connectionConfig, new C2604045m(connectionConfig, this));
                    startNative(connectionConfig.subscribeTopics, 1, new AnonymousClass4C3(mqttSubscribeListener, this));
                    if (this.started.compareAndSet(false, true)) {
                        return true;
                    }
                    throw new IllegalStateException("Client already initialized");
                } catch (CppException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error starting client with config:");
                    sb.append(connectionConfig);
                    0KC.A0F(TAG, sb.toString(), e);
                    this.connectionState = C2603845k.DISCONNECTED;
                    Executor executor2 = this.callbackExecutor;
                    if (executor2 != null) {
                        executor2.execute(new C12873TBn(r10));
                        return false;
                    }
                }
            }
            0qQ.A0F("callbackExecutor");
            throw AnonymousClass00P.createAndThrow();
        }
        throw new IllegalStateException("Client already initialized");
    }

    public boolean verifyAuthToken(String str) {
        0qQ.A0B(str, 0);
        return verifyAuthTokenNative(str);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.28I, java.lang.Object] */
    static {
        0dV.A0C("xplatmqttclient-jni");
    }

    public boolean cancelPublish(int i) {
        StringBuilder sb;
        if (this.started.get()) {
            try {
                cancelPublishNative(i);
                return true;
            } catch (CppException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Error cancelling publish with id:");
                sb.append(i);
            } catch (NullPointerException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Error cancelling publish with id:");
                sb.append(i);
                sb.append(". No native client");
            }
        } else {
            throw new IllegalStateException("Cannot cancel publish if not started");
        }
        0KC.A0F(TAG, sb.toString(), e);
        return false;
    }

    public C2603845k getConnectionState() {
        return this.connectionState;
    }

    public boolean isConnected() {
        if (this.connectionState == C2603845k.CONNECTED_AND_ACK) {
            return true;
        }
        return false;
    }

    public boolean isConnectedOrConnecting() {
        C2603845k r2 = this.connectionState;
        if (r2 == C2603845k.CONNECTED || r2 == C2603845k.CONNECTED_AND_ACK || r2 == C2603845k.CONNECTING) {
            return true;
        }
        return false;
    }

    public final boolean isStarted() {
        return this.started.get();
    }

    public void onNetworkAvailable() {
        String str;
        if (this.started.get()) {
            try {
                updateNetworkStateNative(1);
                return;
            } catch (CppException e) {
                e = e;
                str = "Error notifying network available";
            } catch (NullPointerException e2) {
                e = e2;
                str = "Error notifying network available. No native client";
            }
        } else {
            throw new IllegalStateException("Cannot set network available if not started");
        }
        0KC.A0F(TAG, str, e);
    }

    public void onNetworkInterfaceChanged(int i) {
        StringBuilder sb;
        if (this.started.get()) {
            try {
                updateNetworkInterfaceNative(i);
                Iterator it = this.observers.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw new NullPointerException("onNetworkInterfaceChanged");
                }
            } catch (CppException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Error notifying network interface changed to ");
                sb.append(i);
                0KC.A0F(TAG, sb.toString(), e);
            } catch (NullPointerException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Error notifying network changed to ");
                sb.append(i);
                sb.append(". No native client");
                0KC.A0F(TAG, sb.toString(), e);
            }
        } else {
            throw new IllegalStateException("Cannot set network interface if not started");
        }
    }

    public void onNetworkUnavailable() {
        String str;
        if (this.started.get()) {
            try {
                updateNetworkStateNative(2);
                return;
            } catch (CppException e) {
                e = e;
                str = "Error notifying network unavailable";
            } catch (NullPointerException e2) {
                e = e2;
                str = "Error notifying network unavailable. No native client";
            }
        } else {
            throw new IllegalStateException("Cannot set network unavailable if not started");
        }
        0KC.A0F(TAG, str, e);
    }

    public int publish(String str, byte[] bArr, C2605346a r14, MqttPublishListener mqttPublishListener) {
        int i;
        String str2 = str;
        0qQ.A0B(str, 0);
        byte[] bArr2 = bArr;
        0qQ.A0B(bArr, 1);
        0qQ.A0B(r14, 2);
        if (this.started.get()) {
            0fh.A01(002.A0R("mqtt:publish:", str), -928583546);
            try {
                int incrementAndGet = C2602244t.A05.incrementAndGet();
                publishNative(str, r14.ordinal(), bArr, new C2605446b(mqttPublishListener, this, str2, bArr2, incrementAndGet));
                0fh.A00(605142803);
                return incrementAndGet;
            } catch (CppException e) {
                0KC.A0F(TAG, 002.A0R("Error publishing to topic:", str), e);
                i = -1510967504;
                0fh.A00(i);
                return -1;
            } catch (NullPointerException e2) {
                0KC.A0F(TAG, 002.A0g("Error publishing to topic:", str, ". No native client"), e2);
                i = 621019430;
                0fh.A00(i);
                return -1;
            } catch (Throwable th) {
                0fh.A00(-1982300446);
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot publish if not started");
        }
    }

    public int publishExt(String str, byte[] bArr, C2605346a r14, MqttPublishExtListener mqttPublishExtListener) {
        int i;
        String str2 = str;
        0qQ.A0B(str, 0);
        byte[] bArr2 = bArr;
        0qQ.A0B(bArr, 1);
        0qQ.A0B(r14, 2);
        MqttPublishExtListener mqttPublishExtListener2 = mqttPublishExtListener;
        0qQ.A0B(mqttPublishExtListener, 3);
        if (this.started.get()) {
            0fh.A01(002.A0R("mqtt:publish:", str), -249237317);
            try {
                int incrementAndGet = C2602244t.A05.incrementAndGet();
                publishExtNative(str, r14.ordinal(), bArr, new C12140Snl(mqttPublishExtListener2, this, str2, bArr2, incrementAndGet));
                0fh.A00(-700027572);
                return incrementAndGet;
            } catch (CppException e) {
                0KC.A0F(TAG, 002.A0R("Error publishingExt to topic:", str), e);
                i = -32485555;
                0fh.A00(i);
                return -1;
            } catch (NullPointerException e2) {
                0KC.A0F(TAG, 002.A0g("Error publishingExt to topic:", str, ". No native client"), e2);
                i = 1519869827;
                0fh.A00(i);
                return -1;
            } catch (Throwable th) {
                0fh.A00(-1472002055);
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot publishExt if not started");
        }
    }

    public void setForeground(boolean z, byte[] bArr, MqttPublishListener mqttPublishListener) {
        StringBuilder sb;
        if (this.started.get()) {
            try {
                setForegroundNative(z);
                if (this.isForeground != z) {
                    this.isForeground = z;
                    if (bArr != null) {
                        publish(UPDATE_FOREGROUND_TOPIC, bArr, C2605346a.AT_LEAST_ONCE, mqttPublishListener);
                    }
                }
            } catch (CppException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Error notifying foreground ");
                sb.append(z);
                0KC.A0F(TAG, sb.toString(), e);
            } catch (NullPointerException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Error notifying foreground ");
                sb.append(z);
                sb.append(". No native client");
                0KC.A0F(TAG, sb.toString(), e);
            }
        } else {
            throw new IllegalStateException("Cannot set foreground if not started");
        }
    }

    public void stop() {
        String str;
        if (this.started.compareAndSet(true, false)) {
            try {
                stopNative();
                HybridData hybridData = this.mHybridData;
                if (hybridData == null) {
                    0qQ.A0F("mHybridData");
                } else {
                    hybridData.resetNative();
                    this.connectionState = C2603845k.DISCONNECTED;
                    Executor executor = this.callbackExecutor;
                    if (executor == null) {
                        0qQ.A0F("callbackExecutor");
                    } else {
                        executor.execute(new C12874TBo(this));
                        return;
                    }
                }
                throw AnonymousClass00P.createAndThrow();
            } catch (CppException e) {
                e = e;
                str = "Error stopping client";
                0KC.A0F(TAG, str, e);
            } catch (NullPointerException e2) {
                e = e2;
                str = "Error stopping client. No native client";
                0KC.A0F(TAG, str, e);
            }
        } else {
            throw new IllegalStateException("Client already stopped");
        }
    }

    public boolean subscribe(String str, C2605346a r8, MqttSubscribeListener mqttSubscribeListener) {
        StringBuilder sb;
        0qQ.A0B(str, 0);
        0qQ.A0B(r8, 1);
        0qQ.A0B(mqttSubscribeListener, 2);
        if (this.started.get()) {
            try {
                subscribeNative(str, r8.ordinal(), new C12145Snq(mqttSubscribeListener, this));
                return true;
            } catch (CppException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Error subscribing to topic:");
                sb.append(str);
                0KC.A0F(TAG, sb.toString(), e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Error subscribing to topic:");
                sb.append(str);
                str = ". No native client";
                sb.append(str);
                0KC.A0F(TAG, sb.toString(), e);
                return false;
            }
        } else {
            throw new IllegalStateException("Cannot subscribe if not started");
        }
    }

    public boolean unsubscribe(List list) {
        StringBuilder sb;
        0qQ.A0B(list, 0);
        if (this.started.get()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    unsubscribeNative(str);
                } catch (CppException e) {
                    e = e;
                    sb = new StringBuilder();
                    sb.append("Error unsubscribing from topic:");
                    sb.append(str);
                    0KC.A0F(TAG, sb.toString(), e);
                    return false;
                } catch (NullPointerException e2) {
                    e = e2;
                    sb = new StringBuilder();
                    sb.append("Error unsubscribing from topic:");
                    sb.append(str);
                    str = ". No native client";
                    sb.append(str);
                    0KC.A0F(TAG, sb.toString(), e);
                    return false;
                }
            }
            Iterator it2 = this.observers.iterator();
            if (!it2.hasNext()) {
                return true;
            }
            it2.next();
            throw new NullPointerException("onUnsubscribe");
        }
        throw new IllegalStateException("Cannot unsubscribe if not started");
    }

    public void updateRegionPreference(String str) {
        StringBuilder sb;
        0qQ.A0B(str, 0);
        if (str.length() == 0) {
            return;
        }
        if (this.started.get()) {
            try {
                updateRegionPreferenceNative(str);
                return;
            } catch (CppException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Error setting Region pref = ");
            } catch (NullPointerException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Error setting Region pref = ");
                sb.append(str);
                str = ". No native client";
            }
        } else {
            throw new IllegalStateException("Cannot set region pref if not started");
        }
        sb.append(str);
        0KC.A0F(TAG, sb.toString(), e);
    }
}
