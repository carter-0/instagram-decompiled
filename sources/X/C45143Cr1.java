package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.user.model.ScheduledLiveProductsMetadata;
import com.instagram.user.model.UpcomingEventLiveMetadataImpl;
import java.io.IOException;

/* renamed from: X.Cr1  reason: case insensitive filesystem */
public abstract class C45143Cr1 {
    public static UpcomingEventLiveMetadataImpl parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            Boolean bool3 = null;
            String str2 = null;
            ScheduledLiveProductsMetadata scheduledLiveProductsMetadata = null;
            Integer num = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if (TraceFieldType.BroadcastId.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("is_broadcast_ended".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r14);
                } else if ("is_scheduled_live".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r14);
                } else if ("live_notifs_enabled".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r14);
                } else if ("post_live_media_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("shopping_info".equals(A17)) {
                    scheduledLiveProductsMetadata = C45137Cqv.parseFromJson(r14);
                } else {
                    num = C41847B3o.A13(r14, num, A17, "visibility");
                }
                r14.A0z();
            }
            if (bool == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_scheduled_live", r14, "UpcomingEventLiveMetadataImpl");
            } else if (bool2 != null || !(r14 instanceof 0c9)) {
                return new UpcomingEventLiveMetadataImpl(scheduledLiveProductsMetadata, bool3, num, str, str2, bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("live_notifs_enabled", r14, "UpcomingEventLiveMetadataImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
