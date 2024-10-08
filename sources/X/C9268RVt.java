package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;

/* renamed from: X.RVt  reason: case insensitive filesystem */
public abstract class C9268RVt {
    public static boolean A00(String str, int i, int i2, boolean z, boolean z2) {
        for (int i3 = 0; i3 < MediaCodecList.getCodecCount(); i3++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
            if (codecInfoAt.isEncoder() && Pxh.A1V(codecInfoAt, str)) {
                if ((z2 || Build.VERSION.SDK_INT < 29 || codecInfoAt.isHardwareAccelerated()) && (!z || !codecInfoAt.getName().toLowerCase().contains(".mtk."))) {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                    if (!(capabilitiesForType == null || capabilitiesForType.profileLevels == null)) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            int i4 = codecProfileLevel.profile;
                            int i5 = codecProfileLevel.level;
                            if (i4 == i && i5 >= i2) {
                                return true;
                            }
                        }
                        continue;
                    }
                } else {
                    codecInfoAt.getName();
                }
            }
        }
        return false;
    }
}
