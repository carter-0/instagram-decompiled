package X;

import com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback;

/* renamed from: X.695  reason: invalid class name */
public final class AnonymousClass695 extends DatabaseHealthMonitorFatalErrorCallback {
    public final void onError(Throwable th) {
        0wb.A03("msys_db_fatal_error", "Fatal error has occurred in Msys Database");
    }
}
