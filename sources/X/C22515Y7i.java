package X;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.pytorch.executorch.Tensor;

/* renamed from: X.Y7i  reason: case insensitive filesystem */
public final class C22515Y7i extends Tensor {
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

    public C22515Y7i(FloatBuffer floatBuffer, long[] jArr) {
        super(jArr);
        this.A00 = floatBuffer;
    }

    public final C21232XQd dtype() {
        return C21232XQd.FLOAT;
    }

    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
