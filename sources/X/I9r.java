package X;

import android.graphics.RadialGradient;
import android.view.Choreographer;
import com.meta.metaai.components.animation.ui.view.ListeningIndicatorView;
import com.meta.metaai.components.animation.ui.view.SpeechIndicatorView;
import java.util.Random;

public final class I9r implements Choreographer.FrameCallback {
    public final ListeningIndicatorView A00;

    public final void doFrame(long j) {
        ListeningIndicatorView listeningIndicatorView = this.A00;
        RadialGradient radialGradient = ListeningIndicatorView.A0S;
        long j2 = j - listeningIndicatorView.A07;
        listeningIndicatorView.A07 = j;
        int i = listeningIndicatorView.A05;
        int[] iArr = SpeechIndicatorView.A0b;
        listeningIndicatorView.A05 = (int) C55219HeA.A00((float) listeningIndicatorView.A06, (float) i, 2.0f, j2);
        listeningIndicatorView.A01 = C55219HeA.A00(listeningIndicatorView.A04, listeningIndicatorView.A01, 0.025f, j2);
        float f = listeningIndicatorView.A02;
        Random random = listeningIndicatorView.A0J;
        listeningIndicatorView.A02 = Math.min(Math.max((f + (random.nextFloat() * 0.05f)) - 0.025f, 0.7f), 1.8f);
        listeningIndicatorView.A00 = Math.min(Math.max((listeningIndicatorView.A00 + (random.nextFloat() * 0.05f)) - 0.025f, 0.7f), 1.8f);
        listeningIndicatorView.A03 = Math.min(Math.max((listeningIndicatorView.A03 + (random.nextFloat() * 0.05f)) - 0.025f, 0.7f), 1.8f);
        if (!(listeningIndicatorView.A05 == i && listeningIndicatorView.A01 == listeningIndicatorView.A04)) {
            listeningIndicatorView.invalidate();
        }
        Choreographer.getInstance().postFrameCallback(this);
    }

    public I9r(ListeningIndicatorView listeningIndicatorView) {
        this.A00 = listeningIndicatorView;
    }
}
