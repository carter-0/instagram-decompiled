package X;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import org.webrtc.MediaStreamTrack;

public final class Xnp {
    public final Spatializer A00;
    public final boolean A01;

    public static Xnp A00(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager == null) {
            return null;
        }
        return new Xnp(audioManager.getSpatializer());
    }

    public Xnp(Spatializer spatializer) {
        this.A00 = spatializer;
        this.A01 = AnonymousClass7TF.A1P(spatializer.getImmersiveAudioLevel());
    }

    public final boolean A01() {
        return this.A01;
    }
}
