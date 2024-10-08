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
import X.C45142Cr0;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class UpcomingEventLiveMetadataImpl extends AnonymousClass0T0 implements UpcomingEventLiveMetadata, Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(93);
    public final ScheduledLiveProductsMetadata A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final UpcomingEventLiveMetadataImpl FH0(1E9 r1) {
        return this;
    }

    public final UpcomingEventLiveMetadataImpl FH1(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpcomingEventLiveMetadataImpl) {
                UpcomingEventLiveMetadataImpl upcomingEventLiveMetadataImpl = (UpcomingEventLiveMetadataImpl) obj;
                if (!0qQ.A0K(this.A03, upcomingEventLiveMetadataImpl.A03) || !0qQ.A0K(this.A01, upcomingEventLiveMetadataImpl.A01) || this.A05 != upcomingEventLiveMetadataImpl.A05 || this.A06 != upcomingEventLiveMetadataImpl.A06 || !0qQ.A0K(this.A04, upcomingEventLiveMetadataImpl.A04) || !0qQ.A0K(this.A00, upcomingEventLiveMetadataImpl.A00) || !0qQ.A0K(this.A02, upcomingEventLiveMetadataImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        C41848B3p.A1I(parcel, this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A04);
        ScheduledLiveProductsMetadata scheduledLiveProductsMetadata = this.A00;
        if (scheduledLiveProductsMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            scheduledLiveProductsMetadata.writeToParcel(parcel, i);
        }
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
    }

    public final String Ai3() {
        return this.A03;
    }

    public final boolean BNM() {
        return this.A06;
    }

    public final String BeF() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ ScheduledLiveProductsMetadataIntf Btm() {
        return this.A00;
    }

    public final Integer CFW() {
        return this.A02;
    }

    public final Boolean CPg() {
        return this.A01;
    }

    public final boolean CbF() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTUpcomingEventLiveMetadataDict", C45142Cr0.A00(this));
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, ((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31)) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public UpcomingEventLiveMetadataImpl(ScheduledLiveProductsMetadata scheduledLiveProductsMetadata, Boolean bool, Integer num, String str, String str2, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = bool;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = str2;
        this.A00 = scheduledLiveProductsMetadata;
        this.A02 = num;
    }

    public final UpcomingEventLiveMetadata EAe(1E9 r1) {
        return this;
    }
}
