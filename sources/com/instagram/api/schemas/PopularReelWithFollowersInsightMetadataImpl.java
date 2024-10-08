package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44240Cbb;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class PopularReelWithFollowersInsightMetadataImpl extends AnonymousClass0T0 implements Parcelable, PopularReelWithFollowersInsightMetadata {
    public static final Parcelable.Creator CREATOR = DE6.A00(15);
    public final int A00;
    public final int A01;
    public final int A02;
    public final List A03;

    public final PopularReelWithFollowersInsightMetadataImpl F7a() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PopularReelWithFollowersInsightMetadataImpl) {
                PopularReelWithFollowersInsightMetadataImpl popularReelWithFollowersInsightMetadataImpl = (PopularReelWithFollowersInsightMetadataImpl) obj;
                if (!(this.A00 == popularReelWithFollowersInsightMetadataImpl.A00 && 0qQ.A0K(this.A03, popularReelWithFollowersInsightMetadataImpl.A03) && this.A01 == popularReelWithFollowersInsightMetadataImpl.A01 && this.A02 == popularReelWithFollowersInsightMetadataImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeStringList(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }

    public final List BQJ() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTPopularReelWithFollowersInsightMetadata", C44240Cbb.A00(this));
    }

    public final int getLikeCount() {
        return this.A00;
    }

    public final int getPlayCount() {
        return this.A01;
    }

    public final int getReshareCount() {
        return this.A02;
    }

    public final int hashCode() {
        return (((((this.A00 * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + this.A01) * 31) + this.A02;
    }

    public PopularReelWithFollowersInsightMetadataImpl(List list, int i, int i2, int i3) {
        this.A00 = i;
        this.A03 = list;
        this.A01 = i2;
        this.A02 = i3;
    }
}
