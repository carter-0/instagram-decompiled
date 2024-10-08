package com.facebook.rsys.audio.gen;

import X.002;
import X.2LV;
import X.C41845B3m;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class AudioInputRoute {
    public static 2LV CONVERTER = C71546Omh.A00(2);
    public static final AudioInputRoute DEFAULT = new AudioInputRoute("default_audio_input_route", "Default audio input route");
    public static long sMcfTypeId;
    public final String identifier;
    public final String name;

    public static native AudioInputRoute createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioInputRoute)) {
            return false;
        }
        AudioInputRoute audioInputRoute = (AudioInputRoute) obj;
        return this.identifier.equals(audioInputRoute.identifier) && this.name.equals(audioInputRoute.name);
    }

    public int hashCode() {
        return C41845B3m.A01(this.name, C66583MXo.A06(this.identifier));
    }

    public String toString() {
        return 002.A11("AudioInputRoute{identifier=", this.identifier, ",name=", this.name, "}");
    }

    public AudioInputRoute(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.name = str2;
    }
}
