package X;

import java.nio.FloatBuffer;

/* renamed from: X.Vsm  reason: case insensitive filesystem */
public final class C18491Vsm {
    public static final FloatBuffer A05;
    public static final float[] A06;
    public C18498Vst A00;
    public final int A01;
    public final int A02;
    public final FloatBuffer A03;
    public final float[] A04;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A06 = fArr;
        FloatBuffer A0e = C13990Tnq.A0e(fArr, 32);
        A0e.position(0);
        A05 = A0e;
    }

    public C18491Vsm(C18498Vst vst, int i, int i2) {
        float[] fArr = new float[8];
        this.A04 = fArr;
        FloatBuffer A0e = C13990Tnq.A0e(fArr, 32);
        A0e.position(0);
        this.A03 = A0e;
        this.A00 = vst;
        this.A02 = i;
        this.A01 = i2;
    }
}
