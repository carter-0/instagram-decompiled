package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.facedetection.amlfacetracker.AMLFaceTracker;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerProvider;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.SHr  reason: case insensitive filesystem */
public final class C11257SHr {
    public long A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final FaceTrackerModelsProvider A02;
    public final FaceTrackerProvider A03;
    public final SmartCaptureLogger A04;
    public final WeakReference A05;
    public final WeakReference A06;
    public volatile C11176SEc A07;
    public volatile Map A08;
    public volatile boolean A09;

    public static final synchronized void A00(C11257SHr sHr) {
        synchronized (sHr) {
            if (((Context) sHr.A06.get()) != null && !sHr.A09) {
                C11176SEc sEc = sHr.A07;
                if (sEc != null) {
                    AMLFaceTracker aMLFaceTracker = sEc.A00;
                    AMLFaceTracker.NativePeer nativePeer = aMLFaceTracker.A00;
                    if (nativePeer != null) {
                        nativePeer.mHybridData.resetNative();
                    }
                    aMLFaceTracker.A00 = null;
                }
                sHr.A07 = null;
                sHr.A09 = false;
                Map map = sHr.A08;
                if (map != null) {
                    try {
                        SmartCaptureLogger smartCaptureLogger = sHr.A04;
                        smartCaptureLogger.qplMarkerStart(33888866);
                        smartCaptureLogger.qplMarkerAnnotate(33888866, "event", "init");
                        smartCaptureLogger.qplMarkerAnnotate(33888866, "tracker", "aml");
                        sHr.A07 = new C11176SEc(map);
                        smartCaptureLogger.qplMarkerEnd(33888866, true);
                    } catch (Exception e) {
                        sHr.A04.qplMarkerEnd(33888866, false);
                        sHr.A01(e);
                    }
                } else {
                    sHr.A09 = true;
                    sHr.A01.post(new TGP(sHr, AnonymousClass05K.A01));
                    XtE.A00(new TNH(sHr, 5));
                }
            }
        }
    }

    public final synchronized void A01(Exception exc) {
        synchronized (this) {
            this.A04.logError("Failed to fetch face tracker models", exc);
            this.A01.post(new TGP(this, AnonymousClass05K.A0C));
        }
    }

    public C11257SHr(FaceTrackerModelsProvider faceTrackerModelsProvider, FaceTrackerProvider faceTrackerProvider, SmartCaptureLogger smartCaptureLogger, WeakReference weakReference, WeakReference weakReference2) {
        this.A06 = weakReference;
        this.A05 = weakReference2;
        this.A03 = faceTrackerProvider;
        this.A02 = faceTrackerModelsProvider;
        this.A04 = smartCaptureLogger;
    }
}
