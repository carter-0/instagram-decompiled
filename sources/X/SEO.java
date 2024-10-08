package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import java.util.LinkedList;

public final class SEO {
    public static final int A02;
    public final LinkedList A00 = Pxe.A1A();
    public final LinkedList A01 = Pxe.A1A();

    static {
        int i;
        try {
            MediaCodec A012 = 0fX.A01("audio/mp4a-latm", 656189169);
            MediaCodecInfo codecInfo = A012.getCodecInfo();
            0fX.A03(A012, -1309177863);
            i = codecInfo.getCapabilitiesForType("audio/mp4a-latm").getMaxSupportedInstances();
        } catch (Exception unused) {
            i = 1;
        }
        A02 = i;
    }
}
