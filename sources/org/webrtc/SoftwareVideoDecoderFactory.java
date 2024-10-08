package org.webrtc;

import X.C13988Tno;
import X.C13989Tnp;
import java.util.ArrayList;
import java.util.HashMap;

public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    public static VideoCodecInfo[] supportedCodecs() {
        ArrayList arrayList = new ArrayList();
        C13988Tno.A1R("VP8", arrayList, new HashMap());
        if (LibvpxVp9Decoder.nativeIsSupported()) {
            C13988Tno.A1R("VP9", arrayList, new HashMap());
        }
        return C13989Tnp.A1b(arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, org.webrtc.VideoDecoder] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, org.webrtc.VideoDecoder] */
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        String str = videoCodecInfo.name;
        if (str.equalsIgnoreCase("VP8")) {
            return new Object();
        }
        if (!str.equalsIgnoreCase("VP9") || !LibvpxVp9Decoder.nativeIsSupported()) {
            return null;
        }
        return new Object();
    }

    public VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }

    @Deprecated
    public VideoDecoder createDecoder(String str) {
        return createDecoder(new VideoCodecInfo(str, new HashMap()));
    }
}
