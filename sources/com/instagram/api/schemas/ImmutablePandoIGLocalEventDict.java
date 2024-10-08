package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CZ9;
import X.DL2;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIGLocalEventDict extends 17P implements IGLocalEventDict {
    public static final C3035269k CREATOR = CTC.A00(99);

    public final EventVisibilityType BF2() {
        return (EventVisibilityType) A0N(-1808927016, DL2.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.IGLocalEventDict, com.instagram.api.schemas.ImmutablePandoIGLocalEventDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CZ9.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BF1() {
        return A0i(561684157);
    }

    public final IGLocalEventDictImpl F4d() {
        return new IGLocalEventDictImpl(BF2(), A0i(561684157));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGLocalEventDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
