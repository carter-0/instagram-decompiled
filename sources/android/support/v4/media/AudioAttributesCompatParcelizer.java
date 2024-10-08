package android.support.v4.media;

import X.C71006OWm;
import androidx.media.AudioAttributesCompat;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C71006OWm oWm) {
        return androidx.media.AudioAttributesCompatParcelizer.read(oWm);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C71006OWm oWm) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, oWm);
    }
}
