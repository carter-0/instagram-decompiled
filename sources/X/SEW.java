package X;

import android.media.AudioTrack;
import java.util.concurrent.TimeUnit;

public final class SEW {
    public static final long A02 = TimeUnit.SECONDS.toMicros(1);
    public final long A00;
    public final AudioTrack A01;

    public SEW(AudioTrack audioTrack) {
        this.A01 = audioTrack;
        this.A00 = (long) audioTrack.getSampleRate();
    }
}
