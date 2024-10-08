package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import java.io.IOException;

/* renamed from: X.RAg  reason: case insensitive filesystem */
public final class C8805RAg extends 0v9 {
    public final /* synthetic */ IGTigonQuickPerformanceLogger A00;
    public final /* synthetic */ 1Qe A01;
    public final /* synthetic */ 1QS A02;
    public final /* synthetic */ IOException A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8805RAg(IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger, 1Qe r5, 1QS r6, IOException iOException) {
        super(11, 3, true, true);
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = iOException;
        this.A00 = iGTigonQuickPerformanceLogger;
    }

    public final void run() {
        1Qe r1 = this.A01;
        1QS r3 = this.A02;
        IOException iOException = this.A03;
        r1.A04(r3, iOException);
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger = this.A00;
        String message = iOException.getMessage();
        if (message == null) {
            message = "null";
        }
        iGTigonQuickPerformanceLogger.markerAnnotate(r3, TraceFieldType.FailureReason, message);
        iGTigonQuickPerformanceLogger.markerEnd(r3, 3);
    }
}
