package com.instagram.user.model;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C45136Cqu;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import java.util.Iterator;
import java.util.List;

public final class ScheduledLiveProductsMetadata extends AnonymousClass0T0 implements Parcelable, ScheduledLiveProductsMetadataIntf {
    public static final Parcelable.Creator CREATOR = new W6F(89);
    public final ScheduledLiveAffiliateInfo A00;
    public final ScheduledLiveDiscountInfo A01;
    public final ProductCollection A02;
    public final User A03;
    public final List A04;

    public final ScheduledLiveProductsMetadata FGv(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScheduledLiveProductsMetadata) {
                ScheduledLiveProductsMetadata scheduledLiveProductsMetadata = (ScheduledLiveProductsMetadata) obj;
                if (!0qQ.A0K(this.A00, scheduledLiveProductsMetadata.A00) || !0qQ.A0K(this.A02, scheduledLiveProductsMetadata.A02) || !0qQ.A0K(this.A01, scheduledLiveProductsMetadata.A01) || !0qQ.A0K(this.A03, scheduledLiveProductsMetadata.A03) || !0qQ.A0K(this.A04, scheduledLiveProductsMetadata.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        User user = this.A03;
        if (user == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            user.writeToParcel(parcel, i);
        }
        List list = this.A04;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A1G = C41848B3p.A1G(parcel, list);
        while (A1G.hasNext()) {
            ((ProductWrapper) A1G.next()).writeToParcel(parcel, i);
        }
    }

    public final ScheduledLiveAffiliateInfo AaE() {
        return this.A00;
    }

    public final ProductCollection Aoo() {
        return this.A02;
    }

    public final ScheduledLiveDiscountInfo Axt() {
        return this.A01;
    }

    public final User BRo() {
        return this.A03;
    }

    public final List Bga() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTScheduledLiveProductsConsumptionPayload", C45136Cqu.A00(this));
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public ScheduledLiveProductsMetadata(ScheduledLiveAffiliateInfo scheduledLiveAffiliateInfo, ScheduledLiveDiscountInfo scheduledLiveDiscountInfo, ProductCollection productCollection, User user, List list) {
        this.A00 = scheduledLiveAffiliateInfo;
        this.A02 = productCollection;
        this.A01 = scheduledLiveDiscountInfo;
        this.A03 = user;
        this.A04 = list;
    }

    public final ScheduledLiveProductsMetadataIntf EAb(1E9 r1) {
        return this;
    }
}
