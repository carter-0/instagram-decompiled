package X;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import org.pytorch.executorch.Tensor;

/* renamed from: X.Y7d  reason: case insensitive filesystem */
public final class C22510Y7d extends Tensor {
    public final DoubleBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.float64)", C21055XCg.A1b(this.shape));
    }

    public C22510Y7d(DoubleBuffer doubleBuffer, long[] jArr) {
        super(jArr);
        this.A00 = doubleBuffer;
    }

    public final C21232XQd dtype() {
        return C21232XQd.DOUBLE;
    }

    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
