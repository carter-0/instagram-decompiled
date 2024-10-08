package X;

import android.os.Looper;
import com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl;
import com.facebook.onecamera.components.logging.xlogger.cppimpl.OneCameraXLoggerCpp;

/* renamed from: X.9lX  reason: invalid class name and case insensitive filesystem */
public final class C387019lX extends 0vM {
    public C387019lX() {
        super("warmup_onecamera", 2052766117, 5, false, false);
    }

    public final void loggedRun() {
        if (!0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            OneCameraXLoggerCpp.loadSoLibrary();
            QPLUserFlowImpl.loadSoLibrary();
            return;
        }
        throw AnonymousClass7TE.A15("OC warm up should not be called from Main Thread");
    }
}
