package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: X.Ria  reason: case insensitive filesystem */
public abstract class C9861Ria {
    public static boolean A00(String str) {
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (Pxh.A1V(codecInfoAt, str) && (encoderCapabilities = codecInfoAt.getCapabilitiesForType(str).getEncoderCapabilities()) != null && encoderCapabilities.isBitrateModeSupported(0)) {
                return true;
            }
        }
        return false;
    }
}
