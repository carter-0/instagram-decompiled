package X;

import com.instagram.api.schemas.FanClubStatusSyncInfo;
import com.instagram.api.schemas.FanClubStatusSyncInfoImpl;

/* renamed from: X.6pD  reason: invalid class name and case insensitive filesystem */
public abstract class C318596pD {
    public static final FanClubStatusSyncInfo A00(FanClubStatusSyncInfo fanClubStatusSyncInfo, Boolean bool, Boolean bool2) {
        if (!0sr.A1Q(new Object[]{bool, bool2, null}).isEmpty()) {
            if (fanClubStatusSyncInfo == null) {
                fanClubStatusSyncInfo = new FanClubStatusSyncInfoImpl((Long) null, false, false);
            }
            FanClubStatusSyncInfoImpl F2z = fanClubStatusSyncInfo.F2z();
            boolean z = F2z.A01;
            boolean z2 = F2z.A02;
            Long l = F2z.A00;
            if (bool != null) {
                z = bool.booleanValue();
            }
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            }
            return new FanClubStatusSyncInfoImpl(l, z, z2);
        } else if (fanClubStatusSyncInfo != null) {
            return fanClubStatusSyncInfo.F2z();
        } else {
            return null;
        }
    }
}
