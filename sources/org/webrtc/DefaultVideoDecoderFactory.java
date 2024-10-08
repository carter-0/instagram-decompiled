package org.webrtc;

import X.AnonymousClass00P;
import X.C13989Tnp;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import org.webrtc.EglBase;
import org.webrtc.VideoDecoderFactory;

public class DefaultVideoDecoderFactory implements VideoDecoderFactory {
    public final VideoDecoderFactory hardwareVideoDecoderFactory;
    public final VideoDecoderFactory platformSoftwareVideoDecoderFactory;
    public final VideoDecoderFactory softwareVideoDecoderFactory = new Object();

    public /* synthetic */ VideoDecoder createDecoder(String str) {
        VideoDecoderFactory.CC.$default$createDecoder((VideoDecoderFactory) this, str);
        throw AnonymousClass00P.createAndThrow();
    }

    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoDecoderFactory videoDecoderFactory;
        VideoDecoder createDecoder = this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        VideoDecoder createDecoder2 = this.hardwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (createDecoder == null && (videoDecoderFactory = this.platformSoftwareVideoDecoderFactory) != null) {
            createDecoder = videoDecoderFactory.createDecoder(videoCodecInfo);
        }
        if (createDecoder2 == null) {
            return createDecoder;
        }
        if (createDecoder != null) {
            return new VideoDecoderFallback(createDecoder, createDecoder2);
        }
        return createDecoder2;
    }

    public VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(this.softwareVideoDecoderFactory.getSupportedCodecs()));
        linkedHashSet.addAll(Arrays.asList(this.hardwareVideoDecoderFactory.getSupportedCodecs()));
        VideoDecoderFactory videoDecoderFactory = this.platformSoftwareVideoDecoderFactory;
        if (videoDecoderFactory != null) {
            linkedHashSet.addAll(Arrays.asList(videoDecoderFactory.getSupportedCodecs()));
        }
        return C13989Tnp.A1b(linkedHashSet);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [org.webrtc.VideoDecoderFactory, java.lang.Object] */
    public DefaultVideoDecoderFactory(EglBase.Context context) {
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(context);
        this.platformSoftwareVideoDecoderFactory = new PlatformSoftwareVideoDecoderFactory(context);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [org.webrtc.VideoDecoderFactory, java.lang.Object] */
    public DefaultVideoDecoderFactory(EglBase.Context context, Map map) {
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(context, map);
        this.platformSoftwareVideoDecoderFactory = new PlatformSoftwareVideoDecoderFactory(context);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [org.webrtc.VideoDecoderFactory, java.lang.Object] */
    public DefaultVideoDecoderFactory(VideoDecoderFactory videoDecoderFactory) {
        this.hardwareVideoDecoderFactory = videoDecoderFactory;
        this.platformSoftwareVideoDecoderFactory = null;
    }
}
