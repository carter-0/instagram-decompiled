package com.facebook.mqtt.service.ipc;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface IMqttPublishListener extends IInterface {

    public abstract class Stub extends Binder implements IMqttPublishListener {

        public final class Proxy implements IMqttPublishListener {
            public IBinder A00;

            public final IBinder asBinder() {
                int A03 = AnonymousClass0fD.A03(-2045656236);
                IBinder iBinder = this.A00;
                AnonymousClass0fD.A0A(-1136486335, A03);
                return iBinder;
            }
        }

        /* JADX WARNING: type inference failed for: r2v1, types: [com.facebook.mqtt.service.ipc.IMqttPublishListener$Stub$Proxy, java.lang.Object, com.facebook.mqtt.service.ipc.IMqttPublishListener] */
        public static IMqttPublishListener A00(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.mqtt.service.ipc.IMqttPublishListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IMqttPublishListener)) {
                return (IMqttPublishListener) queryLocalInterface;
            }
            ? obj = new Object();
            int A03 = AnonymousClass0fD.A03(1507773689);
            obj.A00 = iBinder;
            AnonymousClass0fD.A0A(128547923, A03);
            return obj;
        }
    }
}
