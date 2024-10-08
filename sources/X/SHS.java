package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.multiprocess.RemoteCallback;
import java.util.concurrent.Executor;

public final class SHS {
    public static final String A04 = AnonymousClass389.A01("ListenableWorkerImplClient");
    public C11441SVc A00;
    public final Context A01;
    public final Object A02 = Pxe.A0p();
    public final Executor A03;

    public final C2379539x A00(ComponentName componentName, C13513Tbe tbe) {
        C2379539x r2;
        synchronized (this.A02) {
            if (this.A00 == null) {
                AnonymousClass389.A00();
                componentName.getPackageName();
                componentName.getClassName();
                this.A00 = new C11441SVc();
                try {
                    Intent A09 = DbS.A09();
                    A09.setComponent(componentName);
                    if (!this.A01.bindService(A09, this.A00, 1)) {
                        C11441SVc sVc = this.A00;
                        RuntimeException A15 = AnonymousClass7TE.A15("Unable to bind to service");
                        AnonymousClass389.A00();
                        Log.e(A04, "Unable to bind to service", A15);
                        sVc.A00.A08(A15);
                    }
                } catch (Throwable th) {
                    C11441SVc sVc2 = this.A00;
                    AnonymousClass389.A00();
                    Log.e(A04, "Unable to bind to service", th);
                    sVc2.A00.A08(th);
                }
            }
            r2 = this.A00.A00;
        }
        RemoteCallback remoteCallback = new RemoteCallback();
        r2.addListener(new TJS(this, remoteCallback, tbe, r2), this.A03);
        int A032 = AnonymousClass0fD.A03(-764495376);
        C2379539x r1 = remoteCallback.A02;
        AnonymousClass0fD.A0A(1363793704, A032);
        return r1;
    }

    public SHS(Context context, Executor executor) {
        this.A01 = context;
        this.A03 = executor;
    }
}
