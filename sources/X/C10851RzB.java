package X;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;
import java.util.concurrent.Semaphore;

/* renamed from: X.RzB  reason: case insensitive filesystem */
public final class C10851RzB {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SurfaceTexture A05;
    public int[] A06;
    public int[] A07;
    public final Rect A08 = AnonymousClass7TE.A0W();
    public final FloatBuffer A09;
    public final FloatBuffer A0A;
    public final Semaphore A0B = new Semaphore(0);
    public final float[] A0C;
    public final float[] A0D;
    public final float[] A0E;

    public C10851RzB() {
        float[] fArr = {1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f};
        this.A0E = fArr;
        float[] fArr2 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
        this.A0D = fArr2;
        FloatBuffer asFloatBuffer = Pxg.A13(48).asFloatBuffer();
        asFloatBuffer.put(fArr);
        this.A0A = asFloatBuffer;
        this.A02 = -1;
        this.A0C = new float[16];
        asFloatBuffer.position(0);
        FloatBuffer asFloatBuffer2 = Pxg.A13(32).asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        this.A09 = asFloatBuffer2;
        asFloatBuffer2.position(0);
    }
}
