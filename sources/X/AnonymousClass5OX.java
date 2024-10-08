package X;

import android.media.MediaCodecInfo;
import java.util.List;

/* renamed from: X.5OX  reason: invalid class name */
public abstract class AnonymousClass5OX {
    public static void A00(String str, List list, boolean z) {
        if ("video/av01".equals(str) && z) {
            list.add(2Km.A00((MediaCodecInfo.CodecCapabilities) null, "meta.dav1d.av1.decoder", "video/av01", "video/av01", false, true));
        }
    }
}
