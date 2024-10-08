package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.AbstractCollection;
import java.util.ArrayList;

public abstract class SL2 {
    public static final String A00(MediaCodec.CodecException codecException) {
        ArrayList A0q = AnonymousClass7TF.A0q(codecException, 0);
        A02("recoverable=%s", A0q, C51968G9o.A1b(codecException.isRecoverable()));
        A02("transient=%s", A0q, C51968G9o.A1b(codecException.isTransient()));
        A02("errorCode=%s", A0q, AnonymousClass7TF.A1b(codecException.getErrorCode()));
        A02("diagnostics_info=%s", A0q, new Object[]{codecException.getDiagnosticInfo()});
        String A02 = C239023El.A00('|').A02(A0q);
        0qQ.A07(A02);
        return A02;
    }

    public static final String A01(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        String str;
        0qQ.A0B(mediaCodec, 0);
        try {
            ArrayList A1C = AnonymousClass7TE.A1C();
            A02("name=%s", A1C, new Object[]{mediaCodec.getName()});
            A02("input_format=%s", A1C, new Object[]{mediaFormat.toString()});
            A02("metrics=%s", A1C, new Object[]{mediaCodec.getMetrics().toString()});
            int integer = mediaFormat.getInteger(IgReactMediaPickerNativeModule.WIDTH);
            int integer2 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.HEIGHT);
            Integer valueOf = Integer.valueOf(integer);
            A02("input_size=[%s X %s]", A1C, new Object[]{valueOf, Integer.valueOf(integer2)});
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(mediaFormat.getString("mime"));
            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
            boolean isSizeSupported = videoCapabilities.isSizeSupported(integer, integer2);
            A02("size_supported=%s", A1C, new Object[]{Boolean.valueOf(isSizeSupported)});
            Object[] objArr = new Object[1];
            if (videoCapabilities.getSupportedWidths().contains(valueOf)) {
                objArr[0] = videoCapabilities.getSupportedHeightsFor(integer);
                str = "supported_height_for_width=%s";
            } else {
                objArr[0] = valueOf;
                str = "unsupported_width=%s";
            }
            A02(str, A1C, objArr);
            if (isSizeSupported) {
                A02("framerate_for_size=%s", A1C, new Object[]{videoCapabilities.getSupportedFrameRatesFor(integer, integer2)});
                A02("achievable_framerate=%s", A1C, new Object[]{videoCapabilities.getAchievableFrameRatesFor(integer, integer2)});
            }
            A02("bitrate=%s", A1C, new Object[]{videoCapabilities.getBitrateRange()});
            A02("alignment=[%s,%s]", A1C, new Object[]{Integer.valueOf(videoCapabilities.getWidthAlignment()), Integer.valueOf(videoCapabilities.getHeightAlignment())});
            A02("general_framerate=%s", A1C, new Object[]{videoCapabilities.getSupportedFrameRates()});
            A02("supported_instance=%s", A1C, new Object[]{Integer.valueOf(capabilitiesForType.getMaxSupportedInstances())});
            String A02 = C239023El.A00('|').A02(A1C);
            0qQ.A07(A02);
            return A02;
        } catch (Exception e) {
            return AnonymousClass7TF.A0m("Details Retrieval failed with ", e);
        }
    }

    public static void A02(String str, AbstractCollection abstractCollection, Object[] objArr) {
        abstractCollection.add(0mp.A06(str, objArr));
    }
}
