package com.facebook.video.common.livestreaming.protocol;

import X.ULD;
import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@AutoGenJsonSerializer
@AutoGenJsonDeserializer
@JsonDeserialize(using = VideoBroadcastAudioStreamingConfigDeserializer.class)
public final class VideoBroadcastAudioStreamingConfig {
    @JsonProperty("bitRate")
    public final int bitRate;
    @JsonProperty("channels")
    public final int channels;
    @JsonProperty("profile")
    public final int profile;
    @JsonProperty("sampleRate")
    public final int sampleRate;
    @JsonProperty("useAudioASC")
    public final boolean useAudioASC;

    public VideoBroadcastAudioStreamingConfig(ULD uld) {
        this.sampleRate = uld.A03;
        this.bitRate = uld.A00;
        this.channels = uld.A01;
        this.profile = uld.A02;
        this.useAudioASC = uld.A04;
    }
}
