package X;

import android.content.Context;
import android.media.AudioManager;
import com.instagram.common.session.UserSession;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.2xu  reason: invalid class name and case insensitive filesystem */
public final class C234462xu implements AudioManager.OnAudioFocusChangeListener {
    public AudioManager.OnAudioFocusChangeListener A00;
    public 1vq A01;
    public final Context A02;
    public final UserSession A03;

    public C234462xu(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A02 = context;
        this.A03 = userSession;
    }

    public final void onAudioFocusChange(int i) {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        if ((i == -2 || i == -1) && (onAudioFocusChangeListener = this.A00) != null) {
            onAudioFocusChangeListener.onAudioFocusChange(i);
        }
    }

    public final void A00() {
        1vq r0 = this.A01;
        if (r0 != null) {
            r0.A03(this);
            this.A00 = null;
        }
    }

    public final void A01(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        1vq r2 = this.A01;
        if (r2 == null) {
            Object systemService = this.A02.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (systemService != null) {
                r2 = new 1vq((AudioManager) systemService, this.A03);
                this.A01 = r2;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A00 = onAudioFocusChangeListener;
        r2.A04(this);
    }
}
