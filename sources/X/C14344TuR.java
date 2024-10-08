package X;

import android.content.Context;
import android.media.AudioManager;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.TuR  reason: case insensitive filesystem */
public final class C14344TuR implements AudioManager.OnAudioFocusChangeListener {
    public C14044Tol A00;
    public WeakReference A01;
    public boolean A02;
    public final AudioManager A03;
    public final 1vq A04;
    public final UserSession A05;
    public final C14357Tum A06;

    public final void onAudioFocusChange(int i) {
        float f = 0.5f;
        if (i != -3) {
            f = 0.0f;
            if (i != -2) {
                if (i == -1) {
                    this.A04.A03(this);
                } else if (i == 1 || i == 2 || i == 3 || i == 4) {
                    f = 1.0f;
                } else {
                    return;
                }
            }
        }
        A00(f, 0);
    }

    public final void A00(float f, int i) {
        C263754Nf r1;
        C14044Tol tol = this.A00;
        if (tol != null) {
            tol.A03(f, i);
        }
        WeakReference weakReference = this.A01;
        if (weakReference != null && (r1 = (C263754Nf) weakReference.get()) != null) {
            r1.A00 = AnonymousClass7TF.A1P(Float.compare(f, 0.0f));
        }
    }

    public final void A01(int i) {
        1GE.A00(this.A05).A00(false);
        A00(0.0f, i);
        this.A04.A03(this);
    }

    public final void A02(int i) {
        1GE.A00(this.A05).A00(true);
        A00(1.0f, i);
        this.A04.A04(this);
    }

    public C14344TuR(Context context, UserSession userSession, C14357Tum tum, C14044Tol tol) {
        AudioManager audioManager;
        this.A05 = userSession;
        this.A06 = tum;
        this.A00 = tol;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (systemService instanceof AudioManager) {
            audioManager = (AudioManager) systemService;
        } else {
            audioManager = null;
        }
        this.A03 = audioManager;
        this.A04 = new 1vq(audioManager, userSession);
    }
}
