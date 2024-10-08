package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.7vB  reason: invalid class name and case insensitive filesystem */
public abstract class C346447vB {
    public static MediaCodecInfo.CodecCapabilities A00() {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/avc")) {
                        return mediaCodecInfo.getCapabilitiesForType(str);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static boolean A01(C343967r6 r5, C39800A9v a9v) {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        boolean equals = AnonymousClass000.A00(3585).equals(new C59110Jg().A01);
        if (equals && r5.CTO(128)) {
            z = true;
        }
        if (a9v.A01 == 6 && a9v.A02 == 7) {
            return C9268RVt.A00("video/hevc", 2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, !equals, false);
        }
        return C9268RVt.A00("video/hevc", 1, 1024, !z, !r5.CTO(129));
    }

    public static boolean A02(C39800A9v a9v, boolean z) {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        if (a9v.A01 == 6 && a9v.A02 == 7) {
            return C9268RVt.A00("video/av01", 2, 512, true, false);
        }
        return C9268RVt.A00("video/av01", 1, 512, true, z);
    }
}
