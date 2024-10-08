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
import X.C45139Cqx;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import java.util.Iterator;
import java.util.List;

public final class UpcomingDropCampaignEventMetadataImpl extends AnonymousClass0T0 implements Parcelable, UpcomingDropCampaignEventMetadata {
    public static final Parcelable.Creator CREATOR = new W6F(91);
    public final UpcomingEventMedia A00;
    public final ProductCollection A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public UpcomingDropCampaignEventMetadataImpl(UpcomingEventMedia upcomingEventMedia, ProductCollection productCollection, User user, String str, String str2, List list) {
        0qQ.A0B(str, 3);
        AnonymousClass7TG.A1R(str2, user);
        0qQ.A0B(list, 6);
        this.A01 = productCollection;
        this.A00 = upcomingEventMedia;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = user;
        this.A05 = list;
    }

    public final UpcomingDropCampaignEventMetadataImpl FGw(1E9 r1) {
        return this;
    }

    public final UpcomingDropCampaignEventMetadataImpl FGx(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpcomingDropCampaignEventMetadataImpl) {
                UpcomingDropCampaignEventMetadataImpl upcomingDropCampaignEventMetadataImpl = (UpcomingDropCampaignEventMetadataImpl) obj;
                if (!0qQ.A0K(this.A01, upcomingDropCampaignEventMetadataImpl.A01) || !0qQ.A0K(this.A00, upcomingDropCampaignEventMetadataImpl.A00) || !0qQ.A0K(this.A03, upcomingDropCampaignEventMetadataImpl.A03) || !0qQ.A0K(this.A04, upcomingDropCampaignEventMetadataImpl.A04) || !0qQ.A0K(this.A02, upcomingDropCampaignEventMetadataImpl.A02) || !0qQ.A0K(this.A05, upcomingDropCampaignEventMetadataImpl.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        this.A02.writeToParcel(parcel, i);
        Iterator A1F = C41848B3p.A1F(parcel, this.A05);
        while (A1F.hasNext()) {
            ((ProductDetailsProductItemDict) A1F.next()).writeToParcel(parcel, i);
        }
    }

    public final ProductCollection Aoo() {
        return this.A01;
    }

    public final UpcomingEventMedia As2() {
        return this.A00;
    }

    public final String Az9() {
        return this.A03;
    }

    public final String BLi() {
        return this.A04;
    }

    public final User BRo() {
        return this.A02;
    }

    public final List Bga() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTUpcomingDropCampaignEventMetadata", C45139Cqx.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A05, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, ((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31))));
    }

    public final UpcomingDropCampaignEventMetadata EAc(1E9 r1) {
        return this;
    }
}
