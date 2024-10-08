package com.facebook.rsys.audio.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C22180Xwq;
import X.C66579MXk;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class PlaybackVolumeParametersDeprecated {
    public static 2LV CONVERTER = C22180Xwq.A00(7);
    public static long sMcfTypeId;
    public final int streamType;
    public final String userID;
    public final float volume;

    public static native PlaybackVolumeParametersDeprecated createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaybackVolumeParametersDeprecated)) {
            return false;
        }
        PlaybackVolumeParametersDeprecated playbackVolumeParametersDeprecated = (PlaybackVolumeParametersDeprecated) obj;
        return this.userID.equals(playbackVolumeParametersDeprecated.userID) && this.streamType == playbackVolumeParametersDeprecated.streamType && this.volume == playbackVolumeParametersDeprecated.volume;
    }

    public int hashCode() {
        return ((C66583MXo.A06(this.userID) + this.streamType) * 31) + Float.floatToIntBits(this.volume);
    }

    public PlaybackVolumeParametersDeprecated(String str, int i, float f) {
        str.getClass();
        this.userID = str;
        this.streamType = i;
        this.volume = f;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PlaybackVolumeParametersDeprecated{userID=");
        A1A.append(this.userID);
        A1A.append(C66579MXk.A00(457));
        A1A.append(this.streamType);
        A1A.append(",volume=");
        A1A.append(this.volume);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
