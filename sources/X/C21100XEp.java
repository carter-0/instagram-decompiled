package X;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.pytorch.Tensor;

/* renamed from: X.XEp  reason: case insensitive filesystem */
public final class C21100XEp extends Tensor {
    public final FloatBuffer A00;

    public final float[] getDataAsFloatArray() {
        FloatBuffer floatBuffer = this.A00;
        floatBuffer.rewind();
        float[] fArr = new float[floatBuffer.remaining()];
        floatBuffer.get(fArr);
        return fArr;
    }

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.float32)", C21055XCg.A1b(this.shape));
    }

    public C21100XEp(FloatBuffer floatBuffer, XF6 xf6, long[] jArr) {
        super(jArr, xf6);
        this.A00 = floatBuffer;
    }

    public final XF7 dtype() {
        return XF7.FLOAT32;
    }

    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
