package X;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.MqttSubscribeListener;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.45c  reason: invalid class name and case insensitive filesystem */
public final class C2603045c implements C250773m2 {
    public Context A00;
    public ConnectionConfig A01;
    public MqttSubscribeListener A02;
    public C2603445g A03;
    public final 26N A04;
    public final C2602244t A05;
    public final C2602344u A06;
    public final C2602845a A07;
    public final Executor A08;
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final C62320sa A0A;
    public final ReentrantReadWriteLock A0B = new ReentrantReadWriteLock();
    public volatile C250773m2 A0C;
    public volatile boolean A0D;

    public C2603045c(26N r3, C2602845a r4, Executor executor, C62320sa r6) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(executor, 2);
        this.A04 = r3;
        this.A08 = executor;
        this.A07 = r4;
        this.A0A = r6;
        this.A05 = new C2602244t(r3);
        this.A06 = new C2602344u(r3);
    }

    public final int publish(String str, byte[] bArr, C2605346a r9, MqttPublishListener mqttPublishListener) {
        if (!this.A09.get()) {
            0KC.A0C("MqttDozeAwareClientWrapper", "Unable to publish. Client not stated");
            return -1;
        }
        if (this.A0D || this.A0C == null) {
            A03(this, false);
        }
        if (!this.A0D || this.A0C != null) {
            return this.A05.A00(mqttPublishListener, r9, str, (String) null, bArr);
        }
        0KC.A0D("MqttDozeAwareClientWrapper", "Unable to publish. Doze mode active without client");
        return -1;
    }

    public final void setForeground(boolean z, byte[] bArr, MqttPublishListener mqttPublishListener) {
        ConnectionConfig connectionConfig = this.A01;
        if (connectionConfig == null) {
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
        boolean z2 = z;
        connectionConfig.isAppInBackground = !z;
        if (z) {
            A03(this, false);
        }
        A01(this, new AnonymousClass9MP(0, mqttPublishListener, this, bArr, z2));
    }

    public final boolean start(Context context, ConnectionConfig connectionConfig, C2603445g r7, MqttSubscribeListener mqttSubscribeListener) {
        0qQ.A0B(context, 0);
        AtomicBoolean atomicBoolean = this.A09;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.A00 = context.getApplicationContext();
            this.A01 = connectionConfig;
            this.A03 = new C2603545h(this, r7);
            this.A02 = mqttSubscribeListener;
            A03(this, false);
            return atomicBoolean.get();
        }
        throw new IllegalStateException("Doze client already started!");
    }

    public final boolean subscribe(String str, C2605346a r4, MqttSubscribeListener mqttSubscribeListener) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r4, 1);
        0qQ.A0B(mqttSubscribeListener, 2);
        A00();
        return this.A06.A02(new C61079JwH(mqttSubscribeListener, r4, str));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0r1, java.lang.Object] */
    public final boolean verifyAuthToken(String str) {
        0qQ.A0B(str, 0);
        ? obj = new Object();
        A01(this, new C58719IwS(obj, this, str, 0));
        return obj.A00;
    }

    private final void A00() {
        Looper looper;
        if (this.A0C == null) {
            Looper myLooper = Looper.myLooper();
            26N r1 = this.A04;
            synchronized (r1) {
                HandlerThread handlerThread = r1.A01;
                if (handlerThread != null) {
                    looper = handlerThread.getLooper();
                } else {
                    looper = null;
                }
            }
            if (0qQ.A0K(myLooper, looper)) {
                A03(this, false);
            } else {
                r1.A01(new C40736AiN(this));
            }
        }
    }

    public static final void A01(C2603045c r2, C62320sa r3) {
        ReentrantReadWriteLock reentrantReadWriteLock = r2.A0B;
        reentrantReadWriteLock.readLock().lock();
        try {
            r3.invoke();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public static final void A02(C2603045c r2, C62320sa r3) {
        ReentrantReadWriteLock reentrantReadWriteLock = r2.A0B;
        reentrantReadWriteLock.writeLock().lock();
        try {
            r3.invoke();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0097, code lost:
        if (r7.A01 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r8 != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C2603045c r7, boolean r8) {
        /*
            X.3m2 r1 = r7.A0C
            r0 = 0
            if (r1 != 0) goto L_0x0006
            r0 = 1
        L_0x0006:
            r6 = 1
            r5 = 0
            if (r0 != 0) goto L_0x000d
            r0 = 0
            if (r8 == 0) goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            java.lang.String r4 = "MqttDozeAwareClientWrapper"
            if (r0 == 0) goto L_0x00c0
            android.content.Context r3 = r7.A00
            if (r3 == 0) goto L_0x00c0
            boolean r2 = X.AnonymousClass45S.A00(r3)     // Catch:{ RuntimeException -> 0x0025 }
            X.26N r1 = r7.A04     // Catch:{ RuntimeException -> 0x0025 }
            X.45i r0 = new X.45i     // Catch:{ RuntimeException -> 0x0025 }
            r0.<init>(r7, r2)     // Catch:{ RuntimeException -> 0x0025 }
            r1.A01(r0)     // Catch:{ RuntimeException -> 0x0025 }
            goto L_0x0034
        L_0x0025:
            r1 = move-exception
            java.lang.String r0 = "Exception checking doze mode"
            X.0KC.A0F(r4, r0, r1)
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.RemoteException
            if (r0 != 0) goto L_0x0038
            throw r1
        L_0x0034:
            if (r2 == 0) goto L_0x0063
            r6 = 0
        L_0x0037:
            r5 = r6
        L_0x0038:
            r7.A0D = r5
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x00a1
            X.3m2 r0 = r7.A0C
            if (r0 == 0) goto L_0x00a1
            if (r8 == 0) goto L_0x00a1
            java.lang.String r0 = "Doze mode enabled. Stopping client"
            X.0KC.A0D(r4, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r1 = 26
            X.9Kv r0 = new X.9Kv
            r0.<init>(r7, r1)
            A02(r7, r0)
            X.45a r0 = r7.A07
            X.26B r1 = r0.A00
            X.45k r0 = X.C2603845k.DISCONNECTED
            X.26B.A02(r0, r1)
            return
        L_0x0063:
            java.lang.String r0 = "power"
            java.lang.Object r2 = r3.getSystemService(r0)     // Catch:{ RuntimeException -> 0x0025 }
            java.lang.String r0 = "null cannot be cast to non-null type android.os.PowerManager"
            X.0qQ.A0C(r2, r0)     // Catch:{ RuntimeException -> 0x0025 }
            android.os.PowerManager r2 = (android.os.PowerManager) r2     // Catch:{ RuntimeException -> 0x0025 }
            boolean r0 = r2.isDeviceIdleMode()     // Catch:{ RuntimeException -> 0x0025 }
            if (r0 != 0) goto L_0x0037
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ RuntimeException -> 0x0025 }
            r0 = 33
            if (r1 < r0) goto L_0x0081
            boolean r6 = r2.isDeviceLightIdleMode()     // Catch:{ RuntimeException -> 0x0025 }
            goto L_0x0037
        L_0x0081:
            com.facebook.mqtt.service.ConnectionConfig r0 = r7.A01     // Catch:{ RuntimeException -> 0x0025 }
            java.lang.String r1 = "config"
            if (r0 == 0) goto L_0x0099
            boolean r0 = r0.isAppInBackground     // Catch:{ RuntimeException -> 0x0025 }
            if (r0 != 0) goto L_0x0092
            boolean r0 = r2.isInteractive()     // Catch:{ RuntimeException -> 0x0025 }
            if (r0 == 0) goto L_0x0092
            r6 = 0
        L_0x0092:
            r2.isPowerSaveMode()     // Catch:{ RuntimeException -> 0x0025 }
            com.facebook.mqtt.service.ConnectionConfig r0 = r7.A01     // Catch:{ RuntimeException -> 0x0025 }
            if (r0 != 0) goto L_0x0037
        L_0x0099:
            X.0qQ.A0F(r1)     // Catch:{ RuntimeException -> 0x0025 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ RuntimeException -> 0x0025 }
            throw r0     // Catch:{ RuntimeException -> 0x0025 }
        L_0x00a1:
            boolean r0 = r7.A0D
            if (r0 != 0) goto L_0x00c0
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A09
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x00c0
            X.3m2 r0 = r7.A0C
            if (r0 != 0) goto L_0x00c0
            java.lang.String r0 = "Doze mode disabled. Starting client"
            X.0KC.A0D(r4, r0)
            java.util.concurrent.Executor r1 = r7.A08
            X.45j r0 = new X.45j
            r0.<init>(r3, r7)
            r1.execute(r0)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2603045c.A03(X.45c, boolean):void");
    }

    public final void kickOffConnection() {
        if (this.A09.get()) {
            A03(this, false);
        }
    }

    public final void onNetworkAvailable() {
        ConnectionConfig connectionConfig = this.A01;
        if (connectionConfig != null) {
            connectionConfig.initialNetworkState = 1;
            if (this.A0C == null) {
                ConnectionConfig connectionConfig2 = this.A01;
                if (connectionConfig2 != null) {
                    if (!connectionConfig2.isAppInBackground) {
                        A03(this, false);
                        return;
                    }
                }
            }
            A01(this, new C377179Kv(this, 29));
            return;
        }
        0qQ.A0F("config");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onNetworkInterfaceChanged(int i) {
        if (i != 0 && this.A0C == null) {
            ConnectionConfig connectionConfig = this.A01;
            if (connectionConfig == null) {
                0qQ.A0F("config");
                throw AnonymousClass00P.createAndThrow();
            } else if (!connectionConfig.isAppInBackground) {
                A03(this, false);
                return;
            }
        }
        A01(this, new C377319Lj(this, i, 0));
    }

    public final void onNetworkUnavailable() {
        ConnectionConfig connectionConfig = this.A01;
        if (connectionConfig == null) {
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
        connectionConfig.initialNetworkState = 2;
        A01(this, new C377179Kv(this, 30));
    }

    public final boolean unsubscribe(List list) {
        return this.A06.A03(list);
    }

    public final boolean cancelPublish(int i) {
        A00();
        return this.A05.A03(i);
    }

    public final void stop() {
        Looper looper;
        Looper myLooper = Looper.myLooper();
        26N r1 = this.A04;
        synchronized (r1) {
            HandlerThread handlerThread = r1.A01;
            if (handlerThread != null) {
                looper = handlerThread.getLooper();
            } else {
                looper = null;
            }
        }
        if (0qQ.A0K(myLooper, looper)) {
            this.A09.set(false);
            A02(this, new C377179Kv(this, 26));
            return;
        }
        throw new IllegalStateException("Stop should be called inside the handler!");
    }
}
