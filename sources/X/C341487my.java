package X;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.7my  reason: invalid class name and case insensitive filesystem */
public final class C341487my implements AudioManager.OnAudioFocusChangeListener {
    public Handler A00;
    public volatile C341457mv A01;
    public volatile C3730593v A02;

    public final void onAudioFocusChange(int i) {
        Handler handler = this.A00;
        if (handler != null) {
            handler.post(new C40936Ali(this, i));
        }
    }
}
