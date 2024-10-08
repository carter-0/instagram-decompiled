package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import com.instagram.api.tigon.TigonServiceLayer;
import java.io.IOException;

/* renamed from: X.R8z  reason: case insensitive filesystem */
public final class C8773R8z extends 19W {
    public final /* synthetic */ TigonServiceLayer A00;

    public final void onSucceeded(1QS r5) {
        0qQ.A0B(r5, 0);
        TigonServiceLayer tigonServiceLayer = this.A00;
        tigonServiceLayer.performanceLogger.markerAnnotate(r5, "http_version", "HTTP/1.1");
        tigonServiceLayer.performanceLogger.markerEnd(r5, 2);
    }

    public C8773R8z(TigonServiceLayer tigonServiceLayer) {
        this.A00 = tigonServiceLayer;
    }

    public final void onFailed(1QS r5, IOException iOException) {
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger;
        short s;
        AnonymousClass7TG.A1N(r5, iOException);
        TigonServiceLayer tigonServiceLayer = this.A00;
        tigonServiceLayer.performanceLogger.markerAnnotate(r5, "http_version", "HTTP/1.1");
        if (iOException instanceof RCQ) {
            iGTigonQuickPerformanceLogger = tigonServiceLayer.performanceLogger;
            s = 4;
        } else {
            IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger2 = tigonServiceLayer.performanceLogger;
            String message = iOException.getMessage();
            if (message == null) {
                message = "null";
            }
            iGTigonQuickPerformanceLogger2.markerAnnotate(r5, TraceFieldType.FailureReason, message);
            iGTigonQuickPerformanceLogger = tigonServiceLayer.performanceLogger;
            s = 3;
        }
        iGTigonQuickPerformanceLogger.markerEnd(r5, s);
    }

    public final void onResponseStarted(1QS r4, 1QU r5, 2ZD r6) {
        DbY.A1S(r4, r6);
        this.A00.performanceLogger.markerAnnotate(r4, TraceFieldType.StatusCode, r6.A01);
    }
}
