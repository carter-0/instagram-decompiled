package X;

import java.io.IOException;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.NEv  reason: case insensitive filesystem */
public final class C68389NEv extends C2609547r {
    public final int A00;

    public C68389NEv(C257263x7 r3, IOException iOException, int i) {
        super(r3, iOException, (int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 1);
        this.A00 = i;
    }

    public final String getMessage() {
        return 002.A0b(super.getMessage(), ", address hash: ", this.A00);
    }
}
