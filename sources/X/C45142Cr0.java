package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.user.model.ScheduledLiveProductsMetadataIntf;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cr0  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45142Cr0 {
    public static Map A00(UpcomingEventLiveMetadata upcomingEventLiveMetadata) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (upcomingEventLiveMetadata.Ai3() != null) {
            A1H.put(TraceFieldType.BroadcastId, upcomingEventLiveMetadata.Ai3());
        }
        if (upcomingEventLiveMetadata.CPg() != null) {
            A1H.put("is_broadcast_ended", upcomingEventLiveMetadata.CPg());
        }
        upcomingEventLiveMetadata.CbF();
        A1H.put("is_scheduled_live", Boolean.valueOf(upcomingEventLiveMetadata.CbF()));
        upcomingEventLiveMetadata.BNM();
        A1H.put("live_notifs_enabled", Boolean.valueOf(upcomingEventLiveMetadata.BNM()));
        if (upcomingEventLiveMetadata.BeF() != null) {
            A1H.put("post_live_media_id", upcomingEventLiveMetadata.BeF());
        }
        if (upcomingEventLiveMetadata.Btm() != null) {
            ScheduledLiveProductsMetadataIntf Btm = upcomingEventLiveMetadata.Btm();
            if (Btm != null) {
                treeUpdaterJNI = Btm.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("shopping_info", treeUpdaterJNI);
        }
        if (upcomingEventLiveMetadata.CFW() != null) {
            A1H.put("visibility", upcomingEventLiveMetadata.CFW());
        }
        return 0Yt.A0B(A1H);
    }
}
