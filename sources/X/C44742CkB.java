package X;

import com.instagram.api.schemas.GuideMediaType;

/* renamed from: X.CkB  reason: case insensitive filesystem */
public abstract class C44742CkB {
    public static final 1Xj A00(BIR bir) {
        GuideMediaType guideMediaType;
        if (bir != null) {
            guideMediaType = bir.A00;
        } else {
            guideMediaType = null;
        }
        if (guideMediaType == GuideMediaType.IG_MEDIA) {
            return bir.A01.A01;
        }
        return null;
    }
}
