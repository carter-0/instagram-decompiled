package X;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class SS7 {
    public static final SS7 A00 = new Object();
    public static final AnonymousClass0eM A01;
    public static final AnonymousClass0eM A02;
    public static final AnonymousClass0eM A03;
    public static final AnonymousClass0eM A04;
    public static final AnonymousClass0eM A05;
    public static final AnonymousClass0eM A06;

    public static final boolean A01(String str) {
        try {
            List<MediaCodecInfo> list = (List) A01.getValue();
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (MediaCodecInfo supportedTypes : list) {
                String[] supportedTypes2 = supportedTypes.getSupportedTypes();
                0qQ.A07(supportedTypes2);
                if (03t.A0O(str, supportedTypes2)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            0KC.A0G("EncoderCapabilityUtil", C273654mx.A00(2421), e);
        }
    }

    public static final boolean A02(String str, Set set) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        try {
            List<MediaCodecInfo> list = (List) A01.getValue();
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (MediaCodecInfo mediaCodecInfo : list) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                0qQ.A07(supportedTypes);
                if (!(!03t.A0O(str, supportedTypes) || (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str)) == null || (codecProfileLevelArr = capabilitiesForType.profileLevels) == null)) {
                    ArrayList A0v = DbS.A0v(r3);
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        AnonymousClass7TF.A1M(A0v, codecProfileLevel.profile);
                    }
                    if (C66580MXl.A1b(00k.A0l(A0v, 00k.A0k(set)))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            0KC.A0G("EncoderCapabilityUtil", C273654mx.A00(3414), e);
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.SS7] */
    static {
        0eO r1 = 0eO.A02;
        A01 = AnonymousClass0eN.A00(r1, C13335TVi.A00);
        A02 = AnonymousClass0eN.A00(r1, C13336TVj.A00);
        A05 = AnonymousClass0eN.A00(r1, C13339TVm.A00);
        A04 = AnonymousClass0eN.A00(r1, C13338TVl.A00);
        A03 = AnonymousClass0eN.A00(r1, C13337TVk.A00);
        A06 = AnonymousClass0eN.A00(r1, C13340TVn.A00);
    }

    public static final boolean A00(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        String name = mediaCodecInfo.getName();
        0qQ.A07(name);
        if (!C66580MXl.A1a("OMX.", 1, name)) {
            return false;
        }
        String name2 = mediaCodecInfo.getName();
        0qQ.A07(name2);
        if (!00l.A0d(name2, "google", false)) {
            return true;
        }
        return false;
    }
}
