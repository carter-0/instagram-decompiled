package X;

import com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback;

public final class NBJ extends DatabaseHealthMonitorFatalErrorCallback {
    public final /* synthetic */ C70812OMh A00;
    public final /* synthetic */ DatabaseHealthMonitorFatalErrorCallback A01;

    public final synchronized void onError(Throwable th) {
        C70812OMh oMh = this.A00;
        oMh.A01 = null;
        oMh.A00 = null;
        oMh.A02.set(false);
        this.A01.onError(th);
    }

    public NBJ(C70812OMh oMh, DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback) {
        this.A00 = oMh;
        this.A01 = databaseHealthMonitorFatalErrorCallback;
    }
}
