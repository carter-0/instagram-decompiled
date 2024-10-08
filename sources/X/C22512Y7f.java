package X;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.pytorch.executorch.Tensor;

/* renamed from: X.Y7f  reason: case insensitive filesystem */
public final class C22512Y7f extends Tensor {
    public final LongBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.int64)", C21055XCg.A1b(this.shape));
    }

    public C22512Y7f(LongBuffer longBuffer, long[] jArr) {
        super(jArr);
        this.A00 = longBuffer;
    }

    public final C21232XQd dtype() {
        return C21232XQd.INT64;
    }

    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
