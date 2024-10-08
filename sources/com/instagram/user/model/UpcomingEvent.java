package com.instagram.user.model;

import X.1E6;
import X.1E9;
import X.C45450Cwd;
import X.D9W;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;

public interface UpcomingEvent extends Parcelable {
    public static final D9W A00 = D9W.A00;

    C45450Cwd AKf();

    UpcomingDropCampaignEventMetadata AzB();

    Long B1d();

    EventPageNavigationMetadata B2K();

    IGLocalEventDict BFR();

    Long BLB();

    UpcomingEventLiveMetadata BNJ();

    UpcomingEventMedia BPg();

    User BZw();

    UpcomingEventIDType CBz();

    Boolean CUx();

    UpcomingEvent EAd(1E9 r1);

    UpcomingEventImpl FGy(1E9 r1);

    UpcomingEventImpl FGz(1E6 r1);

    TreeUpdaterJNI FHC();

    String getId();

    boolean getReminderEnabled();

    long getStartTime();

    String getStrongId();

    String getTitle();
}
