package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@AutoGenJsonSerializer
@AutoGenJsonDeserializer
@JsonDeserialize(using = FacecastShareToPublicChannelDeserializer.class)
public abstract class FacecastShareToPublicChannel {
    @JsonProperty("initialToggleState")
    public final boolean initialToggleState;
    @JsonProperty("threadName")
    public final String threadName;
}
