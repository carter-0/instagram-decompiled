package com.instagram.user.model;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C45141Cqz;
import X.C45450Cwd;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;

public final class UpcomingEventImpl extends AnonymousClass0T0 implements UpcomingEvent, Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(92);
    public final long A00;
    public final EventPageNavigationMetadata A01;
    public final IGLocalEventDict A02;
    public final UpcomingEventIDType A03;
    public final UpcomingEventMedia A04;
    public final UpcomingDropCampaignEventMetadata A05;
    public final UpcomingEventLiveMetadata A06;
    public final User A07;
    public final Boolean A08;
    public final Long A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public UpcomingEventImpl(EventPageNavigationMetadata eventPageNavigationMetadata, IGLocalEventDict iGLocalEventDict, UpcomingEventIDType upcomingEventIDType, UpcomingEventMedia upcomingEventMedia, UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata, UpcomingEventLiveMetadata upcomingEventLiveMetadata, User user, Boolean bool, Long l, Long l2, String str, String str2, String str3, long j, boolean z) {
        0qQ.A0B(str, 4);
        0qQ.A0B(str3, 14);
        0qQ.A0B(upcomingEventIDType, 15);
        this.A05 = upcomingDropCampaignEventMetadata;
        this.A09 = l;
        this.A01 = eventPageNavigationMetadata;
        this.A0B = str;
        this.A02 = iGLocalEventDict;
        this.A08 = bool;
        this.A0A = l2;
        this.A06 = upcomingEventLiveMetadata;
        this.A04 = upcomingEventMedia;
        this.A07 = user;
        this.A0E = z;
        this.A00 = j;
        this.A0C = str2;
        this.A0D = str3;
        this.A03 = upcomingEventIDType;
    }

    public final UpcomingEventImpl FGy(1E9 r1) {
        return this;
    }

    public final UpcomingEventImpl FGz(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpcomingEventImpl) {
                UpcomingEventImpl upcomingEventImpl = (UpcomingEventImpl) obj;
                if (!0qQ.A0K(this.A05, upcomingEventImpl.A05) || !0qQ.A0K(this.A09, upcomingEventImpl.A09) || !0qQ.A0K(this.A01, upcomingEventImpl.A01) || !0qQ.A0K(this.A0B, upcomingEventImpl.A0B) || !0qQ.A0K(this.A02, upcomingEventImpl.A02) || !0qQ.A0K(this.A08, upcomingEventImpl.A08) || !0qQ.A0K(this.A0A, upcomingEventImpl.A0A) || !0qQ.A0K(this.A06, upcomingEventImpl.A06) || !0qQ.A0K(this.A04, upcomingEventImpl.A04) || !0qQ.A0K(this.A07, upcomingEventImpl.A07) || this.A0E != upcomingEventImpl.A0E || this.A00 != upcomingEventImpl.A00 || !0qQ.A0K(this.A0C, upcomingEventImpl.A0C) || !0qQ.A0K(this.A0D, upcomingEventImpl.A0D) || this.A03 != upcomingEventImpl.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A05, i);
        C41848B3p.A1K(parcel, this.A09);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A02, i);
        C41848B3p.A1I(parcel, this.A08);
        C41848B3p.A1K(parcel, this.A0A);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A04, i);
        User user = this.A07;
        if (user == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            user.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeParcelable(this.A03, i);
    }

    public final /* bridge */ /* synthetic */ C45450Cwd AKf() {
        return new C45450Cwd(this);
    }

    public final UpcomingDropCampaignEventMetadata AzB() {
        return this.A05;
    }

    public final Long B1d() {
        return this.A09;
    }

    public final EventPageNavigationMetadata B2K() {
        return this.A01;
    }

    public final IGLocalEventDict BFR() {
        return this.A02;
    }

    public final Long BLB() {
        return this.A0A;
    }

    public final UpcomingEventLiveMetadata BNJ() {
        return this.A06;
    }

    public final UpcomingEventMedia BPg() {
        return this.A04;
    }

    public final User BZw() {
        return this.A07;
    }

    public final UpcomingEventIDType CBz() {
        return this.A03;
    }

    public final Boolean CUx() {
        return this.A08;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTUpcomingEventDict", C45141Cqz.A00(this));
    }

    public final String getId() {
        return this.A0B;
    }

    public final boolean getReminderEnabled() {
        return this.A0E;
    }

    public final long getStartTime() {
        return this.A00;
    }

    public final String getStrongId() {
        return this.A0C;
    }

    public final String getTitle() {
        return this.A0D;
    }

    public final int hashCode() {
        String str = this.A0B;
        int A092 = AnonymousClass7TF.A09(this.A0E, (((((((((((AnonymousClass7TF.A08(str, ((((AnonymousClass7TG.A0C(this.A05) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31);
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A08(this.A0D, (AnonymousClass7TF.A01(this.A00, A092) + C41845B3m.A00(this.A0C)) * 31));
    }

    public final UpcomingEvent EAd(1E9 r1) {
        return this;
    }
}
