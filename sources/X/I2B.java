package X;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

public abstract class I2B {
    public static final void A00(HandwritingGesture handwritingGesture, C52754Gc7 gc7, C52693Gb5 gb5, AnonymousClass5RG r6, Executor executor, IntConsumer intConsumer, 0sP r9) {
        int i;
        C52754Gc7 gc72 = gc7;
        if (gc7 != null) {
            i = I4P.A00.A01(handwritingGesture, gc72, gb5, r6, r9);
        } else {
            i = 3;
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new C57801Igg(intConsumer, i));
        } else {
            intConsumer.accept(i);
        }
    }

    public static final boolean A02(CancellationSignal cancellationSignal, PreviewableHandwritingGesture previewableHandwritingGesture, C52754Gc7 gc7, C52693Gb5 gb5) {
        if (gc7 != null) {
            return I4P.A00.A02(cancellationSignal, previewableHandwritingGesture, gc7, gb5);
        }
        return false;
    }
}
