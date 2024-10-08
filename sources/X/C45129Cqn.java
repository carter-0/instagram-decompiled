package X;

import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.user.model.UpcomingDropCampaignEventMetadata;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.UpcomingEventLiveMetadataImpl;
import com.instagram.user.model.User;

/* renamed from: X.Cqn  reason: case insensitive filesystem */
public abstract class C45129Cqn {
    public static final UpcomingEventImpl A00(CGC cgc) {
        long j;
        CGC cgc2 = cgc;
        0qQ.A0B(cgc2, 0);
        Long l = cgc2.A05;
        String str = cgc2.A08;
        if (str == null) {
            str = "0";
        }
        Long l2 = cgc2.A06;
        UpcomingEventLiveMetadataImpl upcomingEventLiveMetadataImpl = cgc2.A03;
        UpcomingEventMediaImpl upcomingEventMediaImpl = cgc2.A02;
        User user = cgc2.A04;
        boolean z = cgc2.A0A;
        Long l3 = cgc2.A07;
        if (l3 != null) {
            j = l3.longValue();
        } else {
            j = 0;
        }
        String str2 = cgc2.A09;
        if (str2 == null) {
            str2 = "";
        }
        UpcomingEventIDType upcomingEventIDType = cgc2.A01;
        if (upcomingEventIDType == null) {
            upcomingEventIDType = UpcomingEventIDType.UNRECOGNIZED;
        }
        return new UpcomingEventImpl((EventPageNavigationMetadata) null, (IGLocalEventDict) null, upcomingEventIDType, upcomingEventMediaImpl, (UpcomingDropCampaignEventMetadata) null, upcomingEventLiveMetadataImpl, user, (Boolean) null, l, l2, str, (String) null, str2, j, z);
    }
}
