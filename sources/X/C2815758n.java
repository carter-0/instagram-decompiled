package X;

import com.instagram.api.schemas.LiveUserPaySupportTier;

/* renamed from: X.58n  reason: invalid class name and case insensitive filesystem */
public abstract class C2815758n {
    public static final LiveUserPaySupportTier A00(String str) {
        LiveUserPaySupportTier liveUserPaySupportTier = (LiveUserPaySupportTier) LiveUserPaySupportTier.A01.get(str);
        if (liveUserPaySupportTier == null) {
            return LiveUserPaySupportTier.UNRECOGNIZED;
        }
        return liveUserPaySupportTier;
    }
}
