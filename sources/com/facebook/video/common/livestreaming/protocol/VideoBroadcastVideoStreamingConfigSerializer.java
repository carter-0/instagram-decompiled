package com.facebook.video.common.livestreaming.protocol;

import X.17Z;
import X.C269504fE;
import X.C291405h7;
import X.C291415hE;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public class VideoBroadcastVideoStreamingConfigSerializer extends JsonSerializer {
    static {
        Object obj = new Object();
        C291405h7.A08.putIfAbsent(VideoBroadcastVideoStreamingConfig.class, obj);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r3, C269504fE r4, Object obj) {
        VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig = (VideoBroadcastVideoStreamingConfig) obj;
        if (videoBroadcastVideoStreamingConfig == null) {
            r3.A0a();
        }
        r3.A0c();
        int i = videoBroadcastVideoStreamingConfig.width;
        r3.A0q(IgReactMediaPickerNativeModule.WIDTH);
        r3.A0g(i);
        int i2 = videoBroadcastVideoStreamingConfig.height;
        r3.A0q(IgReactMediaPickerNativeModule.HEIGHT);
        r3.A0g(i2);
        int i3 = videoBroadcastVideoStreamingConfig.bitRate;
        r3.A0q("bitRate");
        r3.A0g(i3);
        int i4 = videoBroadcastVideoStreamingConfig.frameRate;
        r3.A0q("frameRate");
        r3.A0g(i4);
        C291415hE.A04(r3, "videoProfile", videoBroadcastVideoStreamingConfig.videoProfile);
        float f = videoBroadcastVideoStreamingConfig.iFrameInterval;
        r3.A0q("iFrameInterval");
        r3.A0f(f);
        r3.A0Z();
    }
}
