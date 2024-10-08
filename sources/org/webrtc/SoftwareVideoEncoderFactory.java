package org.webrtc;

import X.C13988Tno;
import X.C13989Tnp;
import java.util.ArrayList;
import java.util.HashMap;
import org.webrtc.VideoEncoderFactory;

public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    public static VideoCodecInfo[] supportedCodecs() {
        ArrayList arrayList = new ArrayList();
        C13988Tno.A1R("VP8", arrayList, new HashMap());
        if (LibvpxVp9Encoder.nativeIsSupported()) {
            C13988Tno.A1R("VP9", arrayList, new HashMap());
        }
        return C13989Tnp.A1b(arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [org.webrtc.VideoEncoder, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [org.webrtc.VideoEncoder, java.lang.Object] */
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        String str = videoCodecInfo.name;
        if (str.equalsIgnoreCase("VP8")) {
            return new Object();
        }
        if (!str.equalsIgnoreCase("VP9") || !LibvpxVp9Encoder.nativeIsSupported()) {
            return null;
        }
        return new Object();
    }

    public /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    /* renamed from: getSupportedCodecs */
    public VideoCodecInfo[] getImplementations() {
        return supportedCodecs();
    }
}
