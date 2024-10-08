package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.EventPageNavigationMetadataImpl;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.IGLocalEventDictImpl;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.session.UserSession;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.user.model.ImmutablePandoUpcomingEvent;
import com.instagram.user.model.UpcomingDropCampaignEventMetadata;
import com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import com.instagram.user.model.User;

/* renamed from: X.Cwd  reason: case insensitive filesystem */
public class C45450Cwd {
    public long A00;
    public EventPageNavigationMetadata A01;
    public IGLocalEventDict A02;
    public UpcomingEventIDType A03;
    public UpcomingEventMedia A04;
    public UpcomingDropCampaignEventMetadata A05;
    public UpcomingEventLiveMetadata A06;
    public User A07;
    public Boolean A08;
    public Long A09;
    public Long A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public final UpcomingEvent A0F;

    public final UpcomingEvent A00() {
        UpcomingDropCampaignEventMetadataImpl upcomingDropCampaignEventMetadataImpl;
        EventPageNavigationMetadataImpl eventPageNavigationMetadataImpl;
        IGLocalEventDictImpl iGLocalEventDictImpl;
        Object upcomingEventImpl;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6 = null;
        new 1E9(new 1hu((UserSession) null), 6, false);
        UpcomingEvent upcomingEvent = this.A0F;
        if (upcomingEvent instanceof ImmutablePandoUpcomingEvent) {
            UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata = this.A05;
            if (upcomingDropCampaignEventMetadata != null) {
                treeUpdaterJNI = upcomingDropCampaignEventMetadata.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            0eP A1L = AnonymousClass7TE.A1L("drops_campaign_metadata", treeUpdaterJNI);
            0eP A1L2 = AnonymousClass7TE.A1L("end_time", this.A09);
            EventPageNavigationMetadata eventPageNavigationMetadata = this.A01;
            if (eventPageNavigationMetadata != null) {
                treeUpdaterJNI2 = eventPageNavigationMetadata.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            0eP A1L3 = AnonymousClass7TE.A1L("event_page_metadata", treeUpdaterJNI2);
            0eP A1L4 = AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A0B);
            IGLocalEventDict iGLocalEventDict = this.A02;
            if (iGLocalEventDict != null) {
                treeUpdaterJNI3 = iGLocalEventDict.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            0eP A1L5 = AnonymousClass7TE.A1L("ig_local_event_dict", treeUpdaterJNI3);
            0eP A1L6 = AnonymousClass7TE.A1L("is_ig_local_event", this.A08);
            0eP A1L7 = AnonymousClass7TE.A1L("last_notification_time", this.A0A);
            UpcomingEventLiveMetadata upcomingEventLiveMetadata = this.A06;
            if (upcomingEventLiveMetadata != null) {
                treeUpdaterJNI4 = upcomingEventLiveMetadata.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            0eP A1L8 = AnonymousClass7TE.A1L("live_metadata", treeUpdaterJNI4);
            UpcomingEventMedia upcomingEventMedia = this.A04;
            if (upcomingEventMedia != null) {
                treeUpdaterJNI5 = upcomingEventMedia.FHC();
            } else {
                treeUpdaterJNI5 = null;
            }
            0eP A1L9 = AnonymousClass7TE.A1L("media", treeUpdaterJNI5);
            User user = this.A07;
            if (user != null) {
                treeUpdaterJNI6 = user.A08();
            }
            0eP A1L10 = AnonymousClass7TE.A1L("owner", treeUpdaterJNI6);
            0eP A1L11 = AnonymousClass7TE.A1L("reminder_enabled", Boolean.valueOf(this.A0E));
            0eP A1L12 = AnonymousClass7TE.A1L(TraceFieldType.StartTime, Long.valueOf(this.A00));
            0eP A1L13 = AnonymousClass7TE.A1L("strong_id__", this.A0C);
            0eP A1L14 = AnonymousClass7TE.A1L(DialogModule.KEY_TITLE, this.A0D);
            UpcomingEventIDType upcomingEventIDType = this.A03;
            0qQ.A0B(upcomingEventIDType, 0);
            upcomingEventImpl = C41847B3o.A0o(upcomingEvent, new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, AnonymousClass7TE.A1L("upcoming_event_id_type", upcomingEventIDType.A00)});
        } else {
            UpcomingEventMediaImpl upcomingEventMediaImpl = null;
            1E9 r3 = new 1E9(new 1hu((UserSession) null), 6, false);
            UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata2 = this.A05;
            if (upcomingDropCampaignEventMetadata2 != null) {
                upcomingDropCampaignEventMetadataImpl = upcomingDropCampaignEventMetadata2.FGw(r3);
            } else {
                upcomingDropCampaignEventMetadataImpl = null;
            }
            Long l = this.A09;
            EventPageNavigationMetadata eventPageNavigationMetadata2 = this.A01;
            if (eventPageNavigationMetadata2 != null) {
                eventPageNavigationMetadataImpl = eventPageNavigationMetadata2.F2m();
            } else {
                eventPageNavigationMetadataImpl = null;
            }
            String str = this.A0B;
            IGLocalEventDict iGLocalEventDict2 = this.A02;
            if (iGLocalEventDict2 != null) {
                iGLocalEventDictImpl = iGLocalEventDict2.F4d();
            } else {
                iGLocalEventDictImpl = null;
            }
            Boolean bool = this.A08;
            Long l2 = this.A0A;
            UpcomingEventLiveMetadata upcomingEventLiveMetadata2 = this.A06;
            if (upcomingEventLiveMetadata2 != null) {
                treeUpdaterJNI6 = upcomingEventLiveMetadata2.FH0(r3);
            }
            UpcomingEventMedia upcomingEventMedia2 = this.A04;
            if (upcomingEventMedia2 != null) {
                upcomingEventMediaImpl = upcomingEventMedia2.FG4();
            }
            User user2 = this.A07;
            boolean z = this.A0E;
            long j = this.A00;
            Long l3 = l2;
            String str2 = str;
            Boolean bool2 = bool;
            Long l4 = l;
            TreeUpdaterJNI treeUpdaterJNI7 = treeUpdaterJNI6;
            User user3 = user2;
            upcomingEventImpl = new UpcomingEventImpl(eventPageNavigationMetadataImpl, iGLocalEventDictImpl, this.A03, upcomingEventMediaImpl, upcomingDropCampaignEventMetadataImpl, treeUpdaterJNI7, user3, bool2, l4, l3, str2, this.A0C, this.A0D, j, z);
        }
        return (UpcomingEvent) upcomingEventImpl;
    }

    public C45450Cwd(UpcomingEvent upcomingEvent) {
        this.A0F = upcomingEvent;
        this.A05 = upcomingEvent.AzB();
        this.A09 = upcomingEvent.B1d();
        this.A01 = upcomingEvent.B2K();
        this.A0B = upcomingEvent.getId();
        this.A02 = upcomingEvent.BFR();
        this.A08 = upcomingEvent.CUx();
        this.A0A = upcomingEvent.BLB();
        this.A06 = upcomingEvent.BNJ();
        this.A04 = upcomingEvent.BPg();
        this.A07 = upcomingEvent.BZw();
        this.A0E = upcomingEvent.getReminderEnabled();
        this.A00 = upcomingEvent.getStartTime();
        this.A0C = upcomingEvent.getStrongId();
        this.A0D = upcomingEvent.getTitle();
        this.A03 = upcomingEvent.CBz();
    }
}
