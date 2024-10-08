package androidx.work.multiprocess;

import X.AnonymousClass0fD;
import X.AnonymousClass389;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class RemoteWorkManagerService extends Service {
    public IBinder A00;

    static {
        AnonymousClass389.A01("RemoteWorkManagerService");
    }

    public final IBinder onBind(Intent intent) {
        AnonymousClass389.A00();
        return this.A00;
    }

    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(1738493411);
        super.onCreate();
        this.A00 = new RemoteWorkManagerImpl(this);
        AnonymousClass0fD.A0B(-636072557, A04);
    }
}
