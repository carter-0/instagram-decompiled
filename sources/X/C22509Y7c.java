package X;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.pytorch.Tensor;

/* renamed from: X.Y7c  reason: case insensitive filesystem */
public final class C22509Y7c extends Tensor {
    public final ByteBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.uint8)", C21055XCg.A1b(this.shape));
    }

    public C22509Y7c(ByteBuffer byteBuffer, XF6 xf6, long[] jArr) {
        super(jArr, xf6);
        this.A00 = byteBuffer;
    }

    public final XF7 dtype() {
        return XF7.UINT8;
    }

    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
