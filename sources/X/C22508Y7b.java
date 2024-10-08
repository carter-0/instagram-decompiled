package X;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.pytorch.Tensor;

/* renamed from: X.Y7b  reason: case insensitive filesystem */
public final class C22508Y7b extends Tensor {
    public final ByteBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.int8)", C21055XCg.A1b(this.shape));
    }

    public C22508Y7b(ByteBuffer byteBuffer, XF6 xf6, long[] jArr) {
        super(jArr, xf6);
        this.A00 = byteBuffer;
    }

    public final XF7 dtype() {
        return XF7.INT8;
    }

    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
