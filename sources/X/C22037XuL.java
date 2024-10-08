package X;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.XuL  reason: case insensitive filesystem */
public final class C22037XuL implements AudioManager.OnAudioFocusChangeListener {
    public final Handler A00;
    public final /* synthetic */ C22000Xq8 A01;

    public C22037XuL(Handler handler, C22000Xq8 xq8) {
        this.A01 = xq8;
        this.A00 = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.A00.post(new Y2J(this, i));
    }
}
