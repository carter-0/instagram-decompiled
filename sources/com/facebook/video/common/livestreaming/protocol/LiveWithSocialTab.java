package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@AutoGenJsonSerializer
@AutoGenJsonDeserializer
@JsonDeserialize(using = LiveWithSocialTabDeserializer.class)
public abstract class LiveWithSocialTab {
    @JsonProperty("'id")
    public final String id;
    @JsonProperty("title")
    public final String title;
}
