package X;

import android.os.Looper;
import com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl;
import com.facebook.onecamera.components.logging.xlogger.cppimpl.OneCameraXLoggerCpp;

/* renamed from: X.9kj  reason: invalid class name and case insensitive filesystem */
public final class C386519kj extends 0ng {
    public final /* synthetic */ AnonymousClass80R A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386519kj(AnonymousClass80R r4) {
        super(2052766117, 5, false, false);
        this.A00 = r4;
    }

    public final void run() {
        if (!0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            OneCameraXLoggerCpp.loadSoLibrary();
            QPLUserFlowImpl.loadSoLibrary();
            return;
        }
        throw AnonymousClass7TE.A15("OC warm up should not be called from Main Thread");
    }
}
