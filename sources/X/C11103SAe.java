package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.SAe  reason: case insensitive filesystem */
public abstract class C11103SAe {
    public static final boolean A01(UserSession userSession) {
        if (Build.VERSION.SDK_INT < 29 || !A00() || ("mediatek".equals(AnonymousClass159.A00().A01) && 182.A06(0Tu.A06, userSession, 36317723764266454L))) {
            return false;
        }
        if (!C9861Ria.A00("image/vnd.android.heic") && !C9861Ria.A00("video/hevc") && 182.A06(0Tu.A05, userSession, 36317723764594139L)) {
            return false;
        }
        if (C9861Ria.A00("video/hevc") || !182.A06(0Tu.A06, userSession, 36317723764200917L)) {
            return C9861Ria.A00("image/vnd.android.heic") || 182.A06(0Tu.A05, userSession, 36317723764331991L);
        }
        return false;
    }

    public static final boolean A00() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        try {
            C12613Szx szx = C12613Szx.A00;
            for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder() && Pxh.A1V(codecInfoAt, "video/hevc")) {
                    if (szx.apply(codecInfoAt.getName())) {
                        codecInfoAt.getName();
                    } else {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType("video/hevc");
                        if (!(capabilitiesForType == null || (codecProfileLevelArr = capabilitiesForType.profileLevels) == null)) {
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                                if (codecProfileLevel.profile == 1 && codecProfileLevel.level >= 1024) {
                                    return true;
                                }
                            }
                            continue;
                        }
                    }
                }
            }
            return false;
        } catch (RuntimeException e) {
            0wb.A07("hevc_capability_check_err", e);
            return false;
        }
    }
}
