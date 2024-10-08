package X;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import org.pytorch.Tensor;

public final class Y7Y extends Tensor {
    public final DoubleBuffer A00;

    public final String toString() {
        return String.format("Tensor(%s, dtype=torch.float64)", C21055XCg.A1b(this.shape));
    }

    public Y7Y(DoubleBuffer doubleBuffer, XF6 xf6, long[] jArr) {
        super(jArr, xf6);
        this.A00 = doubleBuffer;
    }

    public final XF7 dtype() {
        return XF7.FLOAT64;
    }

    public final Buffer getRawDataBuffer() {
        return this.A00;
    }
}
