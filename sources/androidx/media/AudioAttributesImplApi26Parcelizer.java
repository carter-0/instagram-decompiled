package androidx.media;

import X.C71006OWm;
import android.media.AudioAttributes;

public class AudioAttributesImplApi26Parcelizer {
    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.media.AudioAttributesImplApi26, androidx.media.AudioAttributesImplApi21] */
    public static AudioAttributesImplApi26 read(C71006OWm oWm) {
        ? audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.A01 = (AudioAttributes) oWm.A02(audioAttributesImplApi21.A01, 1);
        audioAttributesImplApi21.A00 = oWm.A01(audioAttributesImplApi21.A00, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, C71006OWm oWm) {
        oWm.A07(audioAttributesImplApi26.A01, 1);
        oWm.A06(audioAttributesImplApi26.A00, 2);
    }
}
