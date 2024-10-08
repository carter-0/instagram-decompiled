package com.facebook.rsys.audioevents.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class AudioEventsModel {
    public static 2LV CONVERTER = C71546Omh.A00(10);
    public static long sMcfTypeId;
    public final boolean hasAudioPlayed;
    public final int latestAudioEvent;

    public static native AudioEventsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioEventsModel)) {
            return false;
        }
        AudioEventsModel audioEventsModel = (AudioEventsModel) obj;
        return this.latestAudioEvent == audioEventsModel.latestAudioEvent && this.hasAudioPlayed == audioEventsModel.hasAudioPlayed;
    }

    public int hashCode() {
        return C66583MXo.A01(this.latestAudioEvent) + (this.hasAudioPlayed ? 1 : 0);
    }

    public AudioEventsModel(int i, boolean z) {
        this.latestAudioEvent = i;
        this.hasAudioPlayed = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AudioEventsModel{latestAudioEvent=");
        A1A.append(this.latestAudioEvent);
        A1A.append(",hasAudioPlayed=");
        return C66584MXp.A0b(A1A, this.hasAudioPlayed);
    }
}
