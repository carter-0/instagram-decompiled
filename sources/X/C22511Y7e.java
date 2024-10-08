package X;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.pytorch.executorch.Tensor;

/* renamed from: X.Y7e  reason: case insensitive filesystem */
public final class C22511Y7e extends Tensor {
    public final IntBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.int32)", C21055XCg.A1b(this.shape));
    }

    public C22511Y7e(IntBuffer intBuffer, long[] jArr) {
        super(jArr);
        this.A00 = intBuffer;
    }

    public final C21232XQd dtype() {
        return C21232XQd.INT32;
    }

    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
