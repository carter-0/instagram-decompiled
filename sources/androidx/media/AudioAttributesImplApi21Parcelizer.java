package androidx.media;

import X.C71006OWm;
import android.media.AudioAttributes;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C71006OWm oWm) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.A01 = (AudioAttributes) oWm.A02(audioAttributesImplApi21.A01, 1);
        audioAttributesImplApi21.A00 = oWm.A01(audioAttributesImplApi21.A00, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C71006OWm oWm) {
        oWm.A07(audioAttributesImplApi21.A01, 1);
        oWm.A06(audioAttributesImplApi21.A00, 2);
    }
}
