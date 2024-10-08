package org.webrtc;

import X.AnonymousClass00P;
import X.C13988Tno;
import X.C13989Tnp;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.Map;
import org.webrtc.EglBase;
import org.webrtc.VideoDecoderFactory;

public class MediaCodecVideoDecoderFactory implements VideoDecoderFactory {
    public static final String TAG = "MediaCodecVideoDecoderFactory";
    public final Predicate codecAllowedPredicate;
    public final Map extendedSettings;
    public final EglBase.Context sharedContext;

    private MediaCodecInfo findCodecForType(VideoCodecMimeType videoCodecMimeType) {
        MediaCodecInfo mediaCodecInfo;
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.e(TAG, "Cannot retrieve decoder codec info", e);
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecMimeType)) {
                return mediaCodecInfo;
            }
        }
        return null;
    }

    public /* synthetic */ VideoDecoder createDecoder(String str) {
        VideoDecoderFactory.CC.$default$createDecoder((VideoDecoderFactory) this, str);
        throw AnonymousClass00P.createAndThrow();
    }

    private boolean isCodecAllowed(MediaCodecInfo mediaCodecInfo) {
        Predicate predicate = this.codecAllowedPredicate;
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, org.webrtc.MediaCodecWrapperFactory] */
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecMimeType valueOf = VideoCodecMimeType.valueOf(videoCodecInfo.name);
        MediaCodecInfo findCodecForType = findCodecForType(valueOf);
        if (findCodecForType == null) {
            return null;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = findCodecForType.getCapabilitiesForType(valueOf.mimeType());
        return new AndroidVideoDecoder(new Object(), findCodecForType.getName(), valueOf, MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, capabilitiesForType).intValue(), this.sharedContext, capabilitiesForType.isFeatureSupported("adaptive-playback"), this.extendedSettings);
    }

    public VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        VideoCodecMimeType videoCodecMimeType = VideoCodecMimeType.VP8;
        VideoCodecMimeType videoCodecMimeType2 = VideoCodecMimeType.VP9;
        VideoCodecMimeType videoCodecMimeType3 = VideoCodecMimeType.H264;
        VideoCodecMimeType[] videoCodecMimeTypeArr = {videoCodecMimeType, videoCodecMimeType2, videoCodecMimeType3, VideoCodecMimeType.H265};
        int i = 0;
        do {
            VideoCodecMimeType videoCodecMimeType4 = videoCodecMimeTypeArr[i];
            MediaCodecInfo findCodecForType = findCodecForType(videoCodecMimeType4);
            if (findCodecForType != null) {
                String name = videoCodecMimeType4.name();
                if (videoCodecMimeType4 == videoCodecMimeType3 && isH264HighProfileSupported(findCodecForType)) {
                    C13988Tno.A1R(name, arrayList, MediaCodecUtils.getCodecProperties(videoCodecMimeType4, true));
                }
                C13988Tno.A1R(name, arrayList, MediaCodecUtils.getCodecProperties(videoCodecMimeType4, false));
            }
            i++;
        } while (i < 4);
        return C13989Tnp.A1b(arrayList);
    }

    public MediaCodecVideoDecoderFactory(EglBase.Context context, Predicate predicate, Map map) {
        this.sharedContext = context;
        this.codecAllowedPredicate = predicate;
        this.extendedSettings = map;
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (!name.startsWith(MediaCodecUtils.QCOM_PREFIX) && !name.startsWith(MediaCodecUtils.EXYNOS_PREFIX)) {
            Map map = this.extendedSettings;
            if (map == null) {
                return false;
            }
            Integer num = 1;
            if (num.equals(map.get("fb-add-264highprofile-by-default"))) {
                return true;
            }
            return false;
        }
        return true;
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        mediaCodecInfo.getName();
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecMimeType) || MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType())) == null) {
            return false;
        }
        return isCodecAllowed(mediaCodecInfo);
    }

    public MediaCodecVideoDecoderFactory(EglBase.Context context, Predicate predicate) {
        this(context, predicate, (Map) null);
    }
}
