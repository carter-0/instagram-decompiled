package com.instagram.shopping.model.taggingfeed;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTA;
import android.os.Parcel;

public final class ImmutablePandoProductCollectionFeedTaggingMeta extends 17P implements ProductCollectionFeedTaggingMetaIntf {
    public static final C3035269k CREATOR = CTA.A00(75);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.shopping.model.taggingfeed.ImmutablePandoProductCollectionFeedTaggingMeta] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
