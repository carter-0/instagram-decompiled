package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTA;
import X.HU6;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoTextAppSearchDiscussionTopic extends 17P implements TextAppSearchDiscussionTopic {
    public static final C3035269k CREATOR = new CTA(7);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.TextAppSearchDiscussionTopic, com.instagram.api.schemas.ImmutablePandoTextAppSearchDiscussionTopic] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, HU6.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String B4l() {
        return A0j(3136215);
    }

    public final String BGL() {
        return A0i(-877823861);
    }

    public final String BSr() {
        return A0i(1485732072);
    }

    public final String BxS() {
        return A0i(-1775780078);
    }

    public final TextAppSearchDiscussionTopicImpl FCU() {
        return new TextAppSearchDiscussionTopicImpl(A0j(3136215), A0i(-877823861), A0i(1485732072), A0i(-1775780078), A0Y());
    }

    public final String getTitle() {
        return A0Y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTextAppSearchDiscussionTopic] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
