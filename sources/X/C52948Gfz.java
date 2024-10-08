package X;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* renamed from: X.Gfz  reason: case insensitive filesystem */
public final class C52948Gfz extends C52949Gg0 {
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            inputConnection.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    public C52948Gfz(InputConnection inputConnection, 0sP r2) {
        super(inputConnection, r2);
    }
}
