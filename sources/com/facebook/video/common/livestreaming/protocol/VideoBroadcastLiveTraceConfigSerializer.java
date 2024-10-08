package com.facebook.video.common.livestreaming.protocol;

import X.17Z;
import X.C269504fE;
import X.C291405h7;
import com.fasterxml.jackson.databind.JsonSerializer;

public class VideoBroadcastLiveTraceConfigSerializer extends JsonSerializer {
    static {
        Object obj = new Object();
        C291405h7.A08.putIfAbsent(VideoBroadcastLiveTraceConfig.class, obj);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r3, C269504fE r4, Object obj) {
        VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig = (VideoBroadcastLiveTraceConfig) obj;
        if (videoBroadcastLiveTraceConfig == null) {
            r3.A0a();
        }
        r3.A0c();
        boolean z = videoBroadcastLiveTraceConfig.enabled;
        r3.A0q("enabled");
        r3.A0x(z);
        int i = videoBroadcastLiveTraceConfig.sampleIntervalInSeconds;
        r3.A0q("sampleIntervalInSeconds");
        r3.A0g(i);
        int i2 = videoBroadcastLiveTraceConfig.samplingSource;
        r3.A0q("samplingSource");
        r3.A0g(i2);
        r3.A0Z();
    }
}
