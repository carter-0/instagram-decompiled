package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: X.Snx  reason: case insensitive filesystem */
public abstract class C12149Snx implements C13771Tgk {
    public final boolean ADg(Context context, Intent intent, ServiceConnection serviceConnection) {
        DbY.A1S(context, serviceConnection);
        return context.bindService(intent, serviceConnection, 513);
    }

    public final void FIS(Context context, ServiceConnection serviceConnection) {
        AnonymousClass7TG.A1N(context, serviceConnection);
        context.unbindService(serviceConnection);
    }
}
