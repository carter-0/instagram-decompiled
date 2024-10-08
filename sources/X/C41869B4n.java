package X;

import com.instagram.api.schemas.FanClubStatusSyncInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4n  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41869B4n {
    public static Map A00(FanClubStatusSyncInfo fanClubStatusSyncInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        fanClubStatusSyncInfo.B0l();
        linkedHashMap.put("eligible_to_subscribe", Boolean.valueOf(fanClubStatusSyncInfo.B0l()));
        fanClubStatusSyncInfo.C2O();
        linkedHashMap.put("subscribed", Boolean.valueOf(fanClubStatusSyncInfo.C2O()));
        if (fanClubStatusSyncInfo.C2P() != null) {
            linkedHashMap.put(AnonymousClass000.A00(4067), fanClubStatusSyncInfo.C2P());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
