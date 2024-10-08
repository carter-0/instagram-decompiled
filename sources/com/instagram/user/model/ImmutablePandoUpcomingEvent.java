package com.instagram.user.model;

import X.17P;
import X.1E9;
import X.1hu;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41848B3p;
import X.C45141Cqz;
import X.C45450Cwd;
import X.CTA;
import X.DP4;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.ImmutablePandoEventPageNavigationMetadata;
import com.instagram.api.schemas.ImmutablePandoIGLocalEventDict;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.session.UserSession;
import com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;

public final class ImmutablePandoUpcomingEvent extends 17P implements UpcomingEvent {
    public static final C3035269k CREATOR = CTA.A00(88);
    public UpcomingDropCampaignEventMetadata A00;
    public UpcomingEventLiveMetadata A01;
    public User A02;

    public final /* synthetic */ C45450Cwd AKf() {
        return new C45450Cwd(this);
    }

    public final UpcomingDropCampaignEventMetadata AzB() {
        UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata = this.A00;
        if (upcomingDropCampaignEventMetadata == null) {
            return (UpcomingDropCampaignEventMetadata) A05(348906851, ImmutablePandoUpcomingDropCampaignEventMetadata.class);
        }
        return upcomingDropCampaignEventMetadata;
    }

    public final EventPageNavigationMetadata B2K() {
        return (EventPageNavigationMetadata) A05(2132109818, ImmutablePandoEventPageNavigationMetadata.class);
    }

    public final IGLocalEventDict BFR() {
        return (IGLocalEventDict) A05(-215380848, ImmutablePandoIGLocalEventDict.class);
    }

    public final UpcomingEventLiveMetadata BNJ() {
        UpcomingEventLiveMetadata upcomingEventLiveMetadata = this.A01;
        if (upcomingEventLiveMetadata == null) {
            return (UpcomingEventLiveMetadata) A05(-1273346782, ImmutablePandoUpcomingEventLiveMetadata.class);
        }
        return upcomingEventLiveMetadata;
    }

    public final UpcomingEventMedia BPg() {
        return (UpcomingEventMedia) A05(103772132, ImmutablePandoUpcomingEventMedia.class);
    }

    public final User BZw() {
        return this.A02;
    }

    public final UpcomingEventIDType CBz() {
        return (UpcomingEventIDType) A0M(-453030570, DP4.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.user.model.UpcomingEventImpl FGy(X.1E9 r20) {
        /*
            r19 = this;
            r0 = r19
            com.instagram.user.model.UpcomingDropCampaignEventMetadata r1 = r0.AzB()
            r9 = 0
            r2 = r20
            if (r1 == 0) goto L_0x008e
            com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl r7 = r1.FGw(r2)
        L_0x000f:
            r1 = 1725551537(0x66d9d3b1, float:5.1432927E23)
            java.lang.Long r11 = r0.A0L(r1)
            com.instagram.api.schemas.EventPageNavigationMetadata r1 = r0.B2K()
            if (r1 == 0) goto L_0x008c
            com.instagram.api.schemas.EventPageNavigationMetadataImpl r3 = r1.F2m()
        L_0x0020:
            java.lang.String r13 = r0.A0g()
            com.instagram.api.schemas.IGLocalEventDict r1 = r0.BFR()
            if (r1 == 0) goto L_0x008a
            com.instagram.api.schemas.IGLocalEventDictImpl r4 = r1.F4d()
        L_0x002e:
            r1 = -1604645158(0xffffffffa05b0eda, float:-1.8554936E-19)
            java.lang.Boolean r10 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1505271864(0x59b8a038, float:6.4959448E15)
            java.lang.Long r12 = r0.A0L(r1)
            com.instagram.user.model.UpcomingEventLiveMetadata r1 = r0.BNJ()
            if (r1 == 0) goto L_0x0088
            com.instagram.user.model.UpcomingEventLiveMetadataImpl r8 = r1.FH0(r2)
        L_0x0046:
            com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia r1 = r0.BPg()
            if (r1 == 0) goto L_0x0086
            com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl r6 = r1.FG4()
        L_0x0050:
            r1 = 106164915(0x653f2b3, float:3.9862997E-35)
            com.instagram.user.model.ImmutablePandoUserDict r1 = X.C41845B3m.A0Z(r0, r1)
            if (r1 == 0) goto L_0x0063
            com.instagram.user.model.User r1 = X.C41845B3m.A0b(r2, r1)
            if (r1 == 0) goto L_0x0063
            com.instagram.user.model.User r9 = X.C41846B3n.A0b(r2, r1)
        L_0x0063:
            r1 = -244359052(0xfffffffff16f6074, float:-1.18533635E30)
            boolean r18 = r0.getBooleanValueByHashCode(r1)
            r1 = -1573145462(0xffffffffa23bb48a, float:-2.5438802E-18)
            long r16 = r0.A03(r1)
            r1 = 356255459(0x153c06e3, float:3.797173E-26)
            java.lang.String r14 = r0.A0j(r1)
            java.lang.String r15 = r0.A0S()
            com.instagram.api.schemas.UpcomingEventIDType r5 = r0.CBz()
            com.instagram.user.model.UpcomingEventImpl r2 = new com.instagram.user.model.UpcomingEventImpl
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18)
            return r2
        L_0x0086:
            r6 = r9
            goto L_0x0050
        L_0x0088:
            r8 = r9
            goto L_0x0046
        L_0x008a:
            r4 = r9
            goto L_0x002e
        L_0x008c:
            r3 = r9
            goto L_0x0020
        L_0x008e:
            r7 = r9
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.model.ImmutablePandoUpcomingEvent.FGy(X.1E9):com.instagram.user.model.UpcomingEventImpl");
    }

    public final UpcomingEventImpl FGz(1hu r2) {
        if (r2 == null) {
            r2 = new 1hu((UserSession) null);
        }
        return FGy(C41846B3n.A0S(r2));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUpcomingEvent, com.instagram.user.model.UpcomingEvent] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45141Cqz.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Long B1d() {
        return A0L(1725551537);
    }

    public final Long BLB() {
        return A0L(1505271864);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUpcomingEvent] */
    public final Boolean CUx() {
        return getOptionalBooleanValueByHashCode(-1604645158);
    }

    public final UpcomingEvent EAd(1E9 r3) {
        UpcomingDropCampaignEventMetadata AzB = AzB();
        UpcomingEventLiveMetadata upcomingEventLiveMetadata = null;
        if (AzB != null) {
            AzB.EAc(r3);
        } else {
            AzB = null;
        }
        this.A00 = AzB;
        UpcomingEventLiveMetadata BNJ = BNJ();
        if (BNJ != null) {
            BNJ.EAe(r3);
            upcomingEventLiveMetadata = BNJ;
        }
        this.A01 = upcomingEventLiveMetadata;
        this.A02 = C41848B3p.A1B(r3, this, 106164915);
        return this;
    }

    public final String getId() {
        return A0g();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUpcomingEvent] */
    public final boolean getReminderEnabled() {
        return getBooleanValueByHashCode(-244359052);
    }

    public final long getStartTime() {
        return A03(-1573145462);
    }

    public final String getStrongId() {
        return A0j(356255459);
    }

    public final String getTitle() {
        return A0S();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.user.model.ImmutablePandoUpcomingEvent] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
