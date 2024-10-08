package X;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.pytorch.Tensor;

public final class Y7Z extends Tensor {
    public final IntBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.int32)", C21055XCg.A1b(this.shape));
    }

    public Y7Z(IntBuffer intBuffer, XF6 xf6, long[] jArr) {
        super(jArr, xf6);
        this.A00 = intBuffer;
    }

    public final XF7 dtype() {
        return XF7.INT32;
    }

    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
