package X;

import java.util.function.DoubleUnaryOperator;

public final /* synthetic */ class DIB implements DoubleUnaryOperator {
    public final /* synthetic */ 0sP A00;

    public /* synthetic */ DIB(0sP r1) {
        this.A00 = r1;
    }

    public final double applyAsDouble(double d) {
        return ((Number) this.A00.invoke(Double.valueOf(d))).doubleValue();
    }
}
