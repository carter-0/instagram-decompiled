package X;

import android.graphics.Point;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;
import org.webrtc.SurfaceTextureHelper;

public final class AD4 {
    public float A00;
    public int A01;
    public Point A02;
    public final A4Q A03;

    public static final void A00(AD4 ad4, float f, int i) {
        if (f != 0.0f && i != 0) {
            Point point = ad4.A02;
            int i2 = i;
            float f2 = (float) i;
            if (f > 1.0f) {
                i = (int) (f2 / f);
            } else {
                i2 = (int) (f2 * f);
            }
            if (point != null) {
                int i3 = point.x;
                if (i3 > 0) {
                    i2 -= i2 % i3;
                }
                int i4 = point.y;
                if (i4 > 0) {
                    i -= i % i4;
                }
            }
            if (i2 > 0 && i > 0) {
                IgLiteCameraProxy igLiteCameraProxy = ad4.A03.A00;
                igLiteCameraProxy.A01 = i2;
                igLiteCameraProxy.A00 = i;
                C71004OWb.A00.A00("IgLiteCameraProxy", 002.A02(i2, i, "onCalculatedSizeChanged width=", " height="));
                SurfaceTextureHelper surfaceTextureHelper = igLiteCameraProxy.A09;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.setTextureSize(i2, i);
                }
            }
        }
    }

    public AD4(A4Q a4q) {
        this.A03 = a4q;
    }
}
