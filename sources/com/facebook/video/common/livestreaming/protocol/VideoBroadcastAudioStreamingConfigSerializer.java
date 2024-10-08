package com.facebook.video.common.livestreaming.protocol;

import X.17Z;
import X.C269504fE;
import X.C291405h7;
import com.fasterxml.jackson.databind.JsonSerializer;

public class VideoBroadcastAudioStreamingConfigSerializer extends JsonSerializer {
    static {
        Object obj = new Object();
        C291405h7.A08.putIfAbsent(VideoBroadcastAudioStreamingConfig.class, obj);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r3, C269504fE r4, Object obj) {
        VideoBroadcastAudioStreamingConfig videoBroadcastAudioStreamingConfig = (VideoBroadcastAudioStreamingConfig) obj;
        if (videoBroadcastAudioStreamingConfig == null) {
            r3.A0a();
        }
        r3.A0c();
        int i = videoBroadcastAudioStreamingConfig.sampleRate;
        r3.A0q("sampleRate");
        r3.A0g(i);
        int i2 = videoBroadcastAudioStreamingConfig.bitRate;
        r3.A0q("bitRate");
        r3.A0g(i2);
        int i3 = videoBroadcastAudioStreamingConfig.channels;
        r3.A0q("channels");
        r3.A0g(i3);
        int i4 = videoBroadcastAudioStreamingConfig.profile;
        r3.A0q("profile");
        r3.A0g(i4);
        boolean z = videoBroadcastAudioStreamingConfig.useAudioASC;
        r3.A0q("useAudioASC");
        r3.A0x(z);
        r3.A0Z();
    }
}
