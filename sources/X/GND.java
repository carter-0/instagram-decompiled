package X;

import android.media.AudioManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GND extends 0ng {
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener A00;
    public final /* synthetic */ AudioManager A01;
    public final /* synthetic */ 1vq A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GND(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, AudioManager audioManager, 1vq r6) {
        super(1411717440, 3, false, false);
        this.A02 = r6;
        this.A01 = audioManager;
        this.A00 = onAudioFocusChangeListener;
    }

    public final void run() {
        1vq r4 = this.A02;
        boolean z = false;
        if (r4.A01.getAndSet(false)) {
            int abandonAudioFocus = this.A01.abandonAudioFocus(this.A00);
            AtomicBoolean atomicBoolean = r4.A00;
            if (abandonAudioFocus != 1) {
                z = true;
            }
            atomicBoolean.set(z);
        }
    }
}
