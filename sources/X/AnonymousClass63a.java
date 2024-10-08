package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.63a  reason: invalid class name */
public final class AnonymousClass63a {
    public static HandlerThread A05;
    public static AnonymousClass63a A06;
    public static final Object A07 = new Object();
    public final Context A00;
    public final AnonymousClass64D A01;
    public final HashMap A02;
    public final AnonymousClass64B A03;
    public volatile Handler A04;

    public AnonymousClass63a() {
    }

    public static AnonymousClass63a A00(Context context) {
        synchronized (A07) {
            if (A06 == null) {
                A06 = new AnonymousClass63a(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return A06;
    }

    public final void A01(ComponentName componentName, ServiceConnection serviceConnection) {
        A02(serviceConnection, new AnonymousClass64V(componentName));
    }

    public final void A02(ServiceConnection serviceConnection, AnonymousClass64V r7) {
        IllegalStateException illegalStateException;
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            C301015yK r0 = (C301015yK) hashMap.get(r7);
            if (r0 != null) {
                Map map = r0.A05;
                if (map.containsKey(serviceConnection)) {
                    map.remove(serviceConnection);
                    if (map.isEmpty()) {
                        this.A04.sendMessageDelayed(this.A04.obtainMessage(0, r7), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    }
                } else {
                    illegalStateException = new IllegalStateException(002.A0R("Trying to unbind a GmsServiceConnection  that was not bound before.  config=", r7.toString()));
                }
            } else {
                illegalStateException = new IllegalStateException(002.A0R("Nonexistent connection status for service config: ", r7.toString()));
            }
            throw illegalStateException;
        }
    }

    public final boolean A03(ServiceConnection serviceConnection, AnonymousClass64V r6, String str) {
        boolean z;
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            C301015yK r3 = (C301015yK) hashMap.get(r6);
            if (r3 == null) {
                r3 = new C301015yK(r6, this);
                r3.A05.put(serviceConnection, serviceConnection);
                r3.A00(str);
                hashMap.put(r6, r3);
            } else {
                this.A04.removeMessages(0, r6);
                Map map = r3.A05;
                if (!map.containsKey(serviceConnection)) {
                    map.put(serviceConnection, serviceConnection);
                    int i = r3.A00;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(r3.A01, r3.A02);
                    } else if (i == 2) {
                        r3.A00(str);
                    }
                } else {
                    throw new IllegalStateException(002.A0R("Trying to bind a GmsServiceConnection that was already connected before.  config=", r6.toString()));
                }
            }
            z = r3.A03;
        }
        return z;
    }

    public AnonymousClass63a(Context context, Looper looper) {
        this.A02 = new HashMap();
        AnonymousClass64B r1 = new AnonymousClass64B(this);
        this.A03 = r1;
        this.A00 = context.getApplicationContext();
        this.A04 = new AnonymousClass64C(looper, r1);
        this.A01 = AnonymousClass64D.A00();
    }
}
