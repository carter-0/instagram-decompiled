package X;

import com.facebook.mqtt.service.ConnectionCallback;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.concurrent.Executor;

/* renamed from: X.45m  reason: invalid class name and case insensitive filesystem */
public final class C2604045m implements ConnectionCallback {
    public final /* synthetic */ ConnectionConfig A00;
    public final /* synthetic */ XplatNativeClientWrapper A01;

    public final void onConnectionChanged(int i, String str) {
        C2603845k r3;
        0qQ.A0B(str, 1);
        if (i == 0) {
            r3 = C2603845k.DISCONNECTED;
        } else if (i == 1) {
            r3 = C2603845k.CONNECTING;
        } else if (i == 2) {
            r3 = C2603845k.CONNECTED;
        } else if (i == 3) {
            r3 = C2603845k.CONNECTED_AND_ACK;
        } else {
            throw new IllegalArgumentException("Invalid Channel State");
        }
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        if (r3 != xplatNativeClientWrapper.connectionState) {
            xplatNativeClientWrapper.connectionState = r3;
            Executor executor = xplatNativeClientWrapper.callbackExecutor;
            if (executor == null) {
                0qQ.A0F("callbackExecutor");
                throw AnonymousClass00P.createAndThrow();
            } else {
                executor.execute(new AnonymousClass46K(xplatNativeClientWrapper, r3));
            }
        }
    }

    public final void onMessageDropped(String str, byte[] bArr, long j) {
        String str2 = str;
        0qQ.A0B(str, 0);
        byte[] bArr2 = bArr;
        0qQ.A0B(bArr, 1);
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Executor executor = xplatNativeClientWrapper.callbackExecutor;
        if (executor == null) {
            0qQ.A0F("callbackExecutor");
            throw AnonymousClass00P.createAndThrow();
        } else {
            executor.execute(new C13048TJe(xplatNativeClientWrapper, str2, bArr2, j));
        }
    }

    public C2604045m(ConnectionConfig connectionConfig, XplatNativeClientWrapper xplatNativeClientWrapper) {
        this.A01 = xplatNativeClientWrapper;
        this.A00 = connectionConfig;
    }

    public final void onConnectionError(int i) {
        Integer num;
        if (i == 3005) {
            num = AnonymousClass05K.A0N;
        } else if (i == 3010) {
            num = AnonymousClass05K.A0Y;
        } else if (i == 3013) {
            num = AnonymousClass05K.A01;
        } else if (i != 3014) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0C;
        }
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Executor executor = xplatNativeClientWrapper.callbackExecutor;
        if (executor == null) {
            0qQ.A0F("callbackExecutor");
            throw AnonymousClass00P.createAndThrow();
        } else {
            executor.execute(new TIZ(this.A00, xplatNativeClientWrapper, num));
        }
    }
}
