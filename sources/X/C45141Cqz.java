package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.UpcomingDropCampaignEventMetadata;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cqz  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45141Cqz {
    public static Map A00(UpcomingEvent upcomingEvent) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (upcomingEvent.AzB() != null) {
            UpcomingDropCampaignEventMetadata AzB = upcomingEvent.AzB();
            if (AzB != null) {
                treeUpdaterJNI4 = AzB.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put("drops_campaign_metadata", treeUpdaterJNI4);
        }
        if (upcomingEvent.B1d() != null) {
            A1H.put("end_time", upcomingEvent.B1d());
        }
        if (upcomingEvent.B2K() != null) {
            EventPageNavigationMetadata B2K = upcomingEvent.B2K();
            if (B2K != null) {
                treeUpdaterJNI3 = B2K.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("event_page_metadata", treeUpdaterJNI3);
        }
        if (upcomingEvent.getId() != null) {
            C41845B3m.A0x(upcomingEvent.getId(), A1H);
        }
        if (upcomingEvent.BFR() != null) {
            IGLocalEventDict BFR = upcomingEvent.BFR();
            if (BFR != null) {
                treeUpdaterJNI2 = BFR.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("ig_local_event_dict", treeUpdaterJNI2);
        }
        if (upcomingEvent.CUx() != null) {
            A1H.put("is_ig_local_event", upcomingEvent.CUx());
        }
        if (upcomingEvent.BLB() != null) {
            A1H.put("last_notification_time", upcomingEvent.BLB());
        }
        if (upcomingEvent.BNJ() != null) {
            UpcomingEventLiveMetadata BNJ = upcomingEvent.BNJ();
            if (BNJ != null) {
                treeUpdaterJNI = BNJ.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("live_metadata", treeUpdaterJNI);
        }
        if (upcomingEvent.BPg() != null) {
            UpcomingEventMedia BPg = upcomingEvent.BPg();
            if (BPg != null) {
                treeUpdaterJNI5 = BPg.FHC();
            }
            A1H.put("media", treeUpdaterJNI5);
        }
        User BZw = upcomingEvent.BZw();
        if (BZw != null) {
            A1H.put("owner", BZw.A08());
        }
        upcomingEvent.getReminderEnabled();
        A1H.put("reminder_enabled", Boolean.valueOf(upcomingEvent.getReminderEnabled()));
        upcomingEvent.getStartTime();
        A1H.put(TraceFieldType.StartTime, Long.valueOf(upcomingEvent.getStartTime()));
        if (upcomingEvent.getStrongId() != null) {
            A1H.put("strong_id__", upcomingEvent.getStrongId());
        }
        if (upcomingEvent.getTitle() != null) {
            C41845B3m.A12(upcomingEvent.getTitle(), A1H);
        }
        if (upcomingEvent.CBz() != null) {
            UpcomingEventIDType CBz = upcomingEvent.CBz();
            0qQ.A0B(CBz, 0);
            A1H.put("upcoming_event_id_type", CBz.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
