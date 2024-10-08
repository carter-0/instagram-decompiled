package X;

import android.hardware.Camera;
import com.instagram.pendingmedia.model.ClipInfo;
import java.nio.FloatBuffer;

/* renamed from: X.Tsy  reason: case insensitive filesystem */
public final class C14275Tsy {
    public float A00 = 0.5f;
    public final C14270Tst A01;

    public final void A00(ClipInfo clipInfo) {
        int i;
        float f = ((float) clipInfo.A09) / ((float) clipInfo.A06);
        float f2 = clipInfo.A00;
        int i2 = clipInfo.A03;
        if (i2 == -1 || clipInfo.A0J) {
            i = 0;
        } else {
            Integer num = clipInfo.A0C;
            if (num != null) {
                i = num.intValue();
            } else {
                C363888kV r0 = C363878kU.A01;
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                int i3 = cameraInfo.facing;
                int i4 = cameraInfo.orientation;
                if (i3 == 1) {
                    i = ((((360 - i4) / 90) + 2) % 4) + 4;
                } else {
                    i = ((i4 / 90) + 2) % 4;
                }
            }
        }
        C14270Tst tst = this.A01;
        FloatBuffer floatBuffer = tst.A01;
        floatBuffer.put(C14268Tsr.A02(f, f2, this.A00));
        floatBuffer.position(0);
        FloatBuffer floatBuffer2 = tst.A02;
        floatBuffer2.put(C14268Tsr.A00[i % 8]);
        floatBuffer2.position(0);
        float f3 = ((float) clipInfo.A09) / ((float) clipInfo.A06);
        float f4 = clipInfo.A00;
        float A012 = C229632nm.A01(clipInfo.A02);
        this.A00 = A012;
        floatBuffer.put(C14268Tsr.A02(f3, f4, A012));
        floatBuffer.position(0);
    }

    public C14275Tsy() {
        C14270Tst A002 = C14268Tsr.A00();
        this.A01 = A002;
        FloatBuffer floatBuffer = A002.A01;
        floatBuffer.put(C14268Tsr.A02(1.0f, 1.0f, this.A00));
        floatBuffer.position(0);
        FloatBuffer floatBuffer2 = A002.A02;
        floatBuffer2.put(C14268Tsr.A00[0]);
        floatBuffer2.position(0);
    }
}
