package X;

import android.view.Choreographer;
import com.meta.metaai.components.animation.ui.view.SpeechIndicatorView;

public final class I9s implements Choreographer.FrameCallback {
    public final SpeechIndicatorView A00;

    public final void doFrame(long j) {
        SpeechIndicatorView speechIndicatorView = this.A00;
        SpeechIndicatorView.A01(speechIndicatorView, j);
        speechIndicatorView.invalidate();
        Choreographer.getInstance().postFrameCallback(this);
    }

    public I9s(SpeechIndicatorView speechIndicatorView) {
        this.A00 = speechIndicatorView;
    }
}
