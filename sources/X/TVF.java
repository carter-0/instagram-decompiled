package X;

import android.media.MediaCodecInfo;
import java.util.ArrayList;

public final class TVF extends 0Yg implements C62320sa {
    public static final TVF A00 = new TVF();

    public TVF() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        MediaCodecInfo[] A1Z = Pxg.A1Z(0);
        ArrayList<MediaCodecInfo> A15 = DbV.A15(A1Z);
        for (MediaCodecInfo mediaCodecInfo : A1Z) {
            String canonicalName = mediaCodecInfo.getCanonicalName();
            0qQ.A07(canonicalName);
            if (00l.A0d(canonicalName, "dv", false) || 00l.A0d(canonicalName, "dolby", false)) {
                A15.add(mediaCodecInfo);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A15);
        for (MediaCodecInfo canonicalName2 : A15) {
            A0r.add(canonicalName2.getCanonicalName());
        }
        return A0r;
    }
}
