package X;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.SVm  reason: case insensitive filesystem */
public final class C11450SVm implements AudioManager.OnAudioFocusChangeListener {
    public final Handler A00;
    public final /* synthetic */ SwE A01;

    public C11450SVm(Handler handler, SwE swE) {
        this.A01 = swE;
        this.A00 = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.A00.post(new TH2(this, i));
    }
}
