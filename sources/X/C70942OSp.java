package X;

import android.content.Context;
import android.media.AudioManager;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.OSp  reason: case insensitive filesystem */
public final class C70942OSp {
    public final AudioManager A00;

    public /* synthetic */ C70942OSp(Context context) {
        Object systemService = context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        0qQ.A0C(systemService, AnonymousClass000.A00(4));
        AudioManager audioManager = (AudioManager) systemService;
        0qQ.A0B(audioManager, 2);
        this.A00 = audioManager;
    }

    public static final int A00() {
        return (1w8.A00().A01 * 100) / 1w8.A00().A00;
    }
}
