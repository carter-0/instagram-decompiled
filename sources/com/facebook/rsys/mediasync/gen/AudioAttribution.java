package com.facebook.rsys.mediasync.gen;

import X.002;
import X.2LV;
import X.C41845B3m;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class AudioAttribution {
    public static 2LV CONVERTER = C71546Omh.A00(48);
    public static long sMcfTypeId;
    public final String artistName;
    public final String songTitle;

    public static native AudioAttribution createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAttribution)) {
            return false;
        }
        AudioAttribution audioAttribution = (AudioAttribution) obj;
        return this.artistName.equals(audioAttribution.artistName) && this.songTitle.equals(audioAttribution.songTitle);
    }

    public int hashCode() {
        return C41845B3m.A01(this.songTitle, C66583MXo.A06(this.artistName));
    }

    public String toString() {
        return 002.A11("AudioAttribution{artistName=", this.artistName, ",songTitle=", this.songTitle, "}");
    }

    public AudioAttribution(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.artistName = str;
        this.songTitle = str2;
    }
}
