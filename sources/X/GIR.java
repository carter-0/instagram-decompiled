package X;

import android.media.AudioManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GIR extends 0ng {
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener A00;
    public final /* synthetic */ AudioManager A01;
    public final /* synthetic */ 1vq A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GIR(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, AudioManager audioManager, 1vq r6) {
        super(1411717440, 3, false, false);
        this.A02 = r6;
        this.A01 = audioManager;
        this.A00 = onAudioFocusChangeListener;
    }

    public final void run() {
        1vq r5 = this.A02;
        boolean z = false;
        if (r5.A02.getAndSet(false)) {
            int requestAudioFocus = this.A01.requestAudioFocus(this.A00, 3, 4);
            AtomicBoolean atomicBoolean = r5.A00;
            if (requestAudioFocus == 1) {
                z = true;
            }
            atomicBoolean.set(z);
        }
    }
}
