package X;

import com.facebook.facedetection.amlfacetracker.AMLFaceTracker;
import java.util.Map;

/* renamed from: X.SEc  reason: case insensitive filesystem */
public final class C11176SEc {
    public static final float A02;
    public static final float A03;
    public final AMLFaceTracker A00;
    public final C10389RrQ A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.facebook.facedetection.amlfacetracker.AMLFaceTracker] */
    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.facedetection.amlfacetracker.AMLTrackerConfiguration, java.lang.Object] */
    public C11176SEc(Map map) {
        AMLFaceTracker.NativePeer nativePeer;
        ? obj = new Object();
        try {
            boolean z = AMLFaceTracker.NativePeer.jniLoaded;
            nativePeer = new AMLFaceTracker.NativePeer(new Object(), map);
        } catch (IllegalStateException unused) {
            nativePeer = null;
        }
        obj.A00 = nativePeer;
        this.A00 = obj;
        this.A01 = new C10389RrQ();
    }

    static {
        float degrees = (float) Math.toDegrees(3.141592653589793d);
        A02 = degrees;
        A03 = degrees / 2.0f;
    }
}
