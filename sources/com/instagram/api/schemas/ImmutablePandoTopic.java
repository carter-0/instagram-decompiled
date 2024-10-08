package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44542Cgc;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoTopic extends 17P implements TopicIntf {
    public static final C3035269k CREATOR = CTA.A00(10);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.TopicIntf, com.instagram.api.schemas.ImmutablePandoTopic] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44542Cgc.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String C8W() {
        return A0k(-957291989);
    }

    public final Topic FCu() {
        return new Topic(A0i(-892481550), A0k(-957291989));
    }

    public final String getStatus() {
        return A0i(-892481550);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTopic] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
