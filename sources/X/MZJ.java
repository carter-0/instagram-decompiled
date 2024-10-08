package X;

import com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback;

public final class MZJ extends DatabaseHealthMonitorFatalErrorCallback {
    public final /* synthetic */ AnonymousClass68H A00;

    public MZJ(AnonymousClass68H r1) {
        this.A00 = r1;
    }

    public final void onError(Throwable th) {
        AnonymousClass68H r2 = this.A00;
        r2.A04.A00(AnonymousClass05K.A0C);
        AnonymousClass68H.A01(r2);
        synchronized (r2) {
            DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback = (DatabaseHealthMonitorFatalErrorCallback) r2.A05.A04.get();
            if (databaseHealthMonitorFatalErrorCallback != null) {
                databaseHealthMonitorFatalErrorCallback.onError(th);
            }
        }
    }
}
