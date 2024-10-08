package X;

import com.instagram.pendingmedia.model.ClipInfo;

public abstract class LKM {
    public static final LA8 A00(ClipInfo clipInfo) {
        0qQ.A0B(clipInfo, 0);
        return new LA8(clipInfo.A0F, (String) null, clipInfo.A07, clipInfo.A05, clipInfo.A03, clipInfo.A0A);
    }

    public static final LA8 A01(String str, String str2, int i) {
        return new LA8(str, str2, 0, i, -1, (long) i);
    }
}
