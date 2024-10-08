package X;

import com.instagram.model.reels.ReelType;

/* renamed from: X.3HS  reason: invalid class name */
public abstract class AnonymousClass3HS {
    public static final ReelType A00(String str) {
        ReelType reelType = (ReelType) ReelType.A01.get(str);
        if (reelType == null) {
            return ReelType.A0m;
        }
        return reelType;
    }
}
