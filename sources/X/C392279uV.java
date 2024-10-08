package X;

import android.media.AudioManager;
import android.os.Handler;
import androidx.media.AudioAttributesCompat;

/* renamed from: X.9uV  reason: invalid class name and case insensitive filesystem */
public final class C392279uV {
    public int A00;
    public AudioManager.OnAudioFocusChangeListener A01;
    public Handler A02;
    public AudioAttributesCompat A03;

    public final C39894ADw A00() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
        if (onAudioFocusChangeListener != null) {
            return new C39894ADw(onAudioFocusChangeListener, this.A02, this.A03, this.A00);
        }
        throw AnonymousClass7TE.A0z("Can't build an AudioFocusRequestCompat instance without a listener");
    }

    public final void A01(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        Handler A0D = AnonymousClass7TF.A0D();
        if (onAudioFocusChangeListener != null) {
            this.A01 = onAudioFocusChangeListener;
            this.A02 = A0D;
            return;
        }
        throw AnonymousClass7TE.A0w("OnAudioFocusChangeListener must not be null");
    }
}
