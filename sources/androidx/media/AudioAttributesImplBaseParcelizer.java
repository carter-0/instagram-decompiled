package androidx.media;

import X.C71006OWm;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C71006OWm oWm) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.A03 = oWm.A01(audioAttributesImplBase.A03, 1);
        audioAttributesImplBase.A00 = oWm.A01(audioAttributesImplBase.A00, 2);
        audioAttributesImplBase.A01 = oWm.A01(audioAttributesImplBase.A01, 3);
        audioAttributesImplBase.A02 = oWm.A01(audioAttributesImplBase.A02, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C71006OWm oWm) {
        oWm.A06(audioAttributesImplBase.A03, 1);
        oWm.A06(audioAttributesImplBase.A00, 2);
        oWm.A06(audioAttributesImplBase.A01, 3);
        oWm.A06(audioAttributesImplBase.A02, 4);
    }
}
