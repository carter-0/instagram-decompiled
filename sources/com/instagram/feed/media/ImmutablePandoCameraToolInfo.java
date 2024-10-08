package com.instagram.feed.media;

import X.17P;
import X.AnonymousClass7TH;
import X.AnonymousClass910;
import X.C3035269k;
import X.C41845B3m;
import X.C46129DNi;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CameraTool;

public final class ImmutablePandoCameraToolInfo extends 17P implements CameraToolInfoIntf {
    public static final C3035269k CREATOR = CTA.A00(26);

    public final CameraTool Ajp() {
        return (CameraTool) A0M(2059177586, C46129DNi.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.feed.media.ImmutablePandoCameraToolInfo, com.facebook.pando.TreeJNI, com.instagram.feed.media.CameraToolInfoIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, AnonymousClass910.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Float AzT() {
        return A0K(-1399061142);
    }

    public final Float ByB() {
        return A0K(1348502743);
    }

    public final Float C7W() {
        return A0K(-328023079);
    }

    public final CameraToolInfo FDu() {
        return new CameraToolInfo(Ajp(), A0K(-1399061142), A0K(1348502743), A0K(-328023079));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.feed.media.ImmutablePandoCameraToolInfo, com.facebook.pando.TreeJNI] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
