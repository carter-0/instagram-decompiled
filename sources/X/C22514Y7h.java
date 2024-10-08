package X;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.pytorch.executorch.Tensor;

/* renamed from: X.Y7h  reason: case insensitive filesystem */
public final class C22514Y7h extends Tensor {
    public final ByteBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.uint8)", C21055XCg.A1b(this.shape));
    }

    public C22514Y7h(ByteBuffer byteBuffer, long[] jArr) {
        super(jArr);
        this.A00 = byteBuffer;
    }

    public final C21232XQd dtype() {
        return C21232XQd.UINT8;
    }

    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
