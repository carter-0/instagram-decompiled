package X;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.pytorch.Tensor;

/* renamed from: X.Y7a  reason: case insensitive filesystem */
public final class C22507Y7a extends Tensor {
    public final LongBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.int64)", C21055XCg.A1b(this.shape));
    }

    public C22507Y7a(LongBuffer longBuffer, XF6 xf6, long[] jArr) {
        super(jArr, xf6);
        this.A00 = longBuffer;
    }

    public final XF7 dtype() {
        return XF7.INT64;
    }

    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
