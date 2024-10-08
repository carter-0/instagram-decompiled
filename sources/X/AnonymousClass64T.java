package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.internal.zzad;

/* renamed from: X.64T  reason: invalid class name */
public final class AnonymousClass64T implements ServiceConnection {
    public final int A00;
    public final /* synthetic */ BaseGmsClient A01;

    public AnonymousClass64T(BaseGmsClient baseGmsClient, int i) {
        this.A01 = baseGmsClient;
        this.A00 = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler handler;
        Message message;
        IGmsServiceBroker zzad;
        int i;
        int i2;
        BaseGmsClient baseGmsClient = this.A01;
        if (iBinder == null) {
            synchronized (baseGmsClient.A0J) {
                i = baseGmsClient.A02;
            }
            if (i == 3) {
                baseGmsClient.A0B = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            handler = baseGmsClient.A0G;
            message = handler.obtainMessage(i2, baseGmsClient.A0A.get(), 16);
        } else {
            synchronized (baseGmsClient.A0K) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) {
                    zzad = new zzad(iBinder);
                } else {
                    zzad = (IGmsServiceBroker) queryLocalInterface;
                }
                baseGmsClient.A08 = zzad;
            }
            int i3 = this.A00;
            C301095yU r2 = new C301095yU(baseGmsClient, 0);
            handler = baseGmsClient.A0G;
            message = handler.obtainMessage(7, i3, -1, r2);
        }
        handler.sendMessage(message);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient = this.A01;
        synchronized (baseGmsClient.A0K) {
            baseGmsClient.A08 = null;
        }
        int i = this.A00;
        Handler handler = baseGmsClient.A0G;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
