package com.facebook.rsys.audio.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66582MXn;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class AudioStream {
    public static 2LV CONVERTER = C71546Omh.A00(8);
    public static long sMcfTypeId;
    public final int channelState;
    public final boolean hasVoiceActivity;
    public final Float playbackVolumeDesiredDeprecated;
    public final AudioSource source;
    public final String streamId;
    public final McfReference streamSource;
    public final int streamState;
    public final int streamStateDesired;
    public final int type;

    public static native AudioStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AudioStream)) {
                return false;
            }
            AudioStream audioStream = (AudioStream) obj;
            AudioSource audioSource = this.source;
            AudioSource audioSource2 = audioStream.source;
            if (audioSource == null) {
                if (audioSource2 != null) {
                    return false;
                }
            } else if (!audioSource.equals(audioSource2)) {
                return false;
            }
            McfReference mcfReference = this.streamSource;
            McfReference mcfReference2 = audioStream.streamSource;
            if (mcfReference == null) {
                if (mcfReference2 != null) {
                    return false;
                }
            } else if (!mcfReference.equals(mcfReference2)) {
                return false;
            }
            if (this.type != audioStream.type || this.hasVoiceActivity != audioStream.hasVoiceActivity) {
                return false;
            }
            String str = this.streamId;
            String str2 = audioStream.streamId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.streamState != audioStream.streamState || this.streamStateDesired != audioStream.streamStateDesired || this.channelState != audioStream.channelState) {
                return false;
            }
            Float f = this.playbackVolumeDesiredDeprecated;
            Float f2 = audioStream.playbackVolumeDesiredDeprecated;
            if (f != null) {
                return f.equals(f2);
            }
            if (f2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((((((((((((C66583MXo.A01(AnonymousClass7TG.A0C(this.source)) + AnonymousClass7TG.A0C(this.streamSource)) * 31) + this.type) * 31) + (this.hasVoiceActivity ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.streamId)) * 31) + this.streamState) * 31) + this.streamStateDesired) * 31) + this.channelState) * 31) + AnonymousClass7TE.A0L(this.playbackVolumeDesiredDeprecated);
    }

    public AudioStream(AudioSource audioSource, McfReference mcfReference, int i, boolean z, String str, int i2, int i3, int i4, Float f) {
        this.source = audioSource;
        this.streamSource = mcfReference;
        this.type = i;
        this.hasVoiceActivity = z;
        this.streamId = str;
        this.streamState = i2;
        this.streamStateDesired = i3;
        this.channelState = i4;
        this.playbackVolumeDesiredDeprecated = f;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AudioStream{source=");
        A1A.append(this.source);
        A1A.append(",streamSource=");
        A1A.append(this.streamSource);
        A1A.append(",type=");
        A1A.append(this.type);
        A1A.append(",hasVoiceActivity=");
        A1A.append(this.hasVoiceActivity);
        A1A.append(",streamId=");
        A1A.append(this.streamId);
        A1A.append(",streamState=");
        A1A.append(this.streamState);
        A1A.append(",streamStateDesired=");
        A1A.append(this.streamStateDesired);
        A1A.append(",channelState=");
        A1A.append(this.channelState);
        A1A.append(",playbackVolumeDesiredDeprecated=");
        return C66582MXn.A0v(this.playbackVolumeDesiredDeprecated, A1A);
    }
}
