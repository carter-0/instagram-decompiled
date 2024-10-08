package androidx.media;

import X.C71006OWm;

public class AudioAttributesCompatParcelizer {
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    public static AudioAttributesCompat read(C71006OWm oWm) {
        ? obj = new Object();
        Object obj2 = obj.A00;
        if (oWm.A09(1)) {
            obj2 = oWm.A04();
        }
        obj.A00 = (AudioAttributesImpl) obj2;
        return obj;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C71006OWm oWm) {
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.A00;
        oWm.A05(1);
        oWm.A08(audioAttributesImpl);
    }
}
