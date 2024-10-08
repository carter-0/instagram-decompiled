package X;

import android.media.MediaCodecInfo;
import java.util.ArrayList;

public final class TVH extends 0Yg implements C62320sa {
    public static final TVH A00 = new TVH();

    public TVH() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        MediaCodecInfo[] A1Z = Pxg.A1Z(0);
        ArrayList<MediaCodecInfo> A15 = DbV.A15(A1Z);
        for (MediaCodecInfo mediaCodecInfo : A1Z) {
            if (!mediaCodecInfo.isEncoder() && SUE.A01.contains(mediaCodecInfo.getCanonicalName())) {
                A15.add(mediaCodecInfo);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A15);
        for (MediaCodecInfo canonicalName : A15) {
            A0r.add(canonicalName.getCanonicalName());
        }
        return A0r;
    }
}
