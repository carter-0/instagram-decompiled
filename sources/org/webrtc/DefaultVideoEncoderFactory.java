package org.webrtc;

import X.C13989Tnp;
import java.util.Arrays;
import java.util.LinkedHashSet;
import org.webrtc.EglBase;
import org.webrtc.VideoEncoderFactory;

public class DefaultVideoEncoderFactory implements VideoEncoderFactory {
    public final VideoEncoderFactory hardwareVideoEncoderFactory;
    public final VideoEncoderFactory softwareVideoEncoderFactory = new Object();

    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        VideoEncoder createEncoder = this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        VideoEncoder createEncoder2 = this.hardwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        if (createEncoder2 == null) {
            return createEncoder;
        }
        if (createEncoder != null) {
            return new VideoEncoderFallback(createEncoder, createEncoder2);
        }
        return createEncoder2;
    }

    public /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    /* renamed from: getSupportedCodecs */
    public VideoCodecInfo[] getImplementations() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(this.softwareVideoEncoderFactory.getSupportedCodecs()));
        linkedHashSet.addAll(Arrays.asList(this.hardwareVideoEncoderFactory.getSupportedCodecs()));
        return C13989Tnp.A1b(linkedHashSet);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [org.webrtc.VideoEncoderFactory, java.lang.Object] */
    public DefaultVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2) {
        this.hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z, z2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [org.webrtc.VideoEncoderFactory, java.lang.Object] */
    public DefaultVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3) {
        this.hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z, z2, z3, (Predicate) null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [org.webrtc.VideoEncoderFactory, java.lang.Object] */
    public DefaultVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z, z2, z3, z4, z5, z6, (Predicate) null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [org.webrtc.VideoEncoderFactory, java.lang.Object] */
    public DefaultVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory) {
        this.hardwareVideoEncoderFactory = videoEncoderFactory;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [org.webrtc.VideoEncoderFactory, java.lang.Object] */
    public DefaultVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        this.hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z, z2, z3, z4, (Predicate) null);
    }
}
